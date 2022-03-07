package Times;

import org.junit.Test;
import uti.Baseuri;

import static io.restassured.RestAssured.given;

public class HijriCalendarByCity {
    @Test
    public void hijricalendarByCity(){
        given()
                .get(Baseuri.HijriCalenderByCity)
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
