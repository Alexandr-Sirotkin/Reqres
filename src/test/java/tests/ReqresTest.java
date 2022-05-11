package tests;

import static io.restassured.RestAssured.given;

import objects.reqres.User;
import org.testng.annotations.Test;

public class ReqresTest {

  //https://reqres.in/api/users

  @Test
  public void postCreateuserTest() {
    User user = User.builder()
        .name("morpheus")
        .job("leader")
        .build();
    given()
        .body(user)
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .log().all()
        .statusCode(201);
  }

}
