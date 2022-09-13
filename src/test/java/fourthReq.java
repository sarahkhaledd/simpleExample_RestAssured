import io.restassured.RestAssured;

public class fourthReq {
    public static void main(String args[])
    {
        RestAssured.given().baseUri("https://reqres.in/api/users")
                .when().header("Content-Type","application/json").body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").when().post().prettyPrint();
    }// "name": "morpheus",
   // "job": "leader"
}
