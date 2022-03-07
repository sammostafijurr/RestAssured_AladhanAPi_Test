package Times;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Hijri_Calendar {
    @Test
    public void hijricalendar(){
        given()
                .get("http://api.aladhan.com/v1/hijriCalendar?latitude=51.508515&longitude=-0.1254872&method=2&month=4&year=1437")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
