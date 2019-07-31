package com.luizleiteoliveira.helloworld;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ApplicationResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello?who=teste")
          .then()
             .statusCode(200)
             .body(is("hello teste"));
    }

}