import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class delete_user {

    @Test
    public void testDeleteUser() {

        JSONObject request = new JSONObject();
        given().body(request.toJSONString())
                .when().delete("https://reqres.in/api/users/2").
                then().statusCode(204)
                .log().all();
    }

}