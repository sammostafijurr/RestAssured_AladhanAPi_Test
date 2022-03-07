package TimeStamp;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class Time_Stamp {
    @Test
    public void timestamp() {
        given()
                .get(Baseuri.TimeStamp)
                .then()
                .statusCode(200)
//                .body("data.id[0]", equalTo(7))
//                .body("data.first_name", hasItems("Michael", "Lindsay"))
                .log().all();
    }
}
