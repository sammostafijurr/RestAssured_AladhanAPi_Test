package Date;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class currentDate {
    @Test
    public void currentD() {
        given()
                .get(Baseuri.date)
                .then()
                .statusCode(200)
//                .body("data.id[0]", equalTo(7))
//                .body("data.first_name", hasItems("Michael", "Lindsay"))
                .log().all();
    }
}
