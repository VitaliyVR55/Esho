package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void checkingDataReturn() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("дата")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("дата"))
        ;
    }
}
