package Time;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class currentTime {
    @Test
    public void currentT() {
        given()
                .get(Baseuri.Time)
                .then()
                .statusCode(200)
//                .body("data.id[0]", equalTo(7))
//                .body("data.first_name", hasItems("Michael", "Lindsay"))
                .log().all();
    }
}
