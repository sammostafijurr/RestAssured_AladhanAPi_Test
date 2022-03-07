//package Date;
//
//import org.junit.Test;
//import static io.restassured.RestAssured.given;
//
//public class Current_Date {
//    @Test
//    public void currentDate(){
//        given()
//                .get("http://api.aladhan.com/v1/currentDate?zone=Europe/London")
//                .then()
//                .statusCode(200)
//                .log()
//                .all();
//    }
//}
