import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class put_update_user {

    @Test
    public void testPutUpdateUser() {

        JSONObject request = new JSONObject();
        request.put("name", "Jo");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toString());

        given().body(request.toString())
                .when().put("https://reqres.in/api/users/2")
                .then().statusCode(200)
                .log().all();
    }

}