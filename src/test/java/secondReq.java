import io.restassured.RestAssured;
import jdk.jfr.RecordingState;

public class secondReq {
    public static void main(String args[])
    {
        RestAssured.given().baseUri("https://reqres.in/api/users/2")
                .when().get().prettyPrint();
    }
}
