package Times;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class HijriCalendarByAdress {
    @Test
    public void hijricalendarAdress(){

        given()
                .get(Baseuri.CalendarByAdress)
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
