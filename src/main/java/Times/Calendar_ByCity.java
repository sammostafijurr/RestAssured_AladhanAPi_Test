package Times;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class Calendar_ByCity {
    @Test
    public void calendarcity(){
        given()
                .get(Baseuri.CalendarBycity)
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
