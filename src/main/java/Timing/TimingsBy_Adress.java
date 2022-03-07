package Timing;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class TimingsBy_Adress {
    @Test
    public void timeba() {
        given()
                .get(Baseuri.TimingByAdress)
                .then()
                .statusCode(200)
//                .body("data.id[0]", equalTo(7))
//                .body("data.first_name", hasItems("Michael", "Lindsay"))
                .log().all();
    }
}
