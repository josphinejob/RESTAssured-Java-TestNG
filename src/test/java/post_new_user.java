import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class post_new_user {

    @Test
    public void testPostNewUser() {

        JSONObject request = new JSONObject();
        request.put("name", "Jo");
        request.put("job", "QA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().body(request.toJSONString())
                .when().post("https://reqres.in/api/users")
                .then().statusCode(201 )
                .log().all();
    }

}