import io.restassured.RestAssured;

public class firstReq {

    public static void main(String args[])
    {
        RestAssured.given().baseUri("https://simple-books-api.glitch.me/books/2").when()
                .get().prettyPrint();
    }
}
