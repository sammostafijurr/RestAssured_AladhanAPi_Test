//package Times;
//
//import org.junit.Test;
//
//import static io.restassured.RestAssured.given;
//
//public class calendar_ByAdress {
//    @Test
//    public void calendarAdress() {
//        given()
//                .get(" http://api.aladhan.com/v1/calendarByAddress?address=Sultanahmet Mosque, Istanbul, Turkey&method=2&month=04&year=2017")
//                .then()
//                .statusCode(200)
////                .body("data.id[0]", equalTo(7))
////                .body("data.first_name", hasItems("Michael", "Lindsay"))
//                .log().all();
//    }
//}
