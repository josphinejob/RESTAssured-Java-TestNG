import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class get_list_users {

    @Test
    public void testWithAssert() {

        Response response = RestAssured.get("https://reqres.in/api/users");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusLine());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    public void testWithGivenWhenSyntax() {

        given().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200)
                .body("data.id[1]", equalTo(8))
                .body("data.first_name", hasItems("Michael","Lindsay"))
                .log().all();
    }

}