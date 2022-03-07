//package Time;
//
//import org.junit.Test;
//
//import static io.restassured.RestAssured.given;
//
//public class Current_Time {
//    @Test
//    public void currentime(){
//        given()
//                .get("http://api.aladhan.com/v1/currentTime?zone=Europe/London")
//                .then()
//                .statusCode(200)
//                .log()
//                .all();
//    }
//}
