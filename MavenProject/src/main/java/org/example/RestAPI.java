package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPI {
    public static void main(String[] args) {
        System.out.println("Testing API");
 RestAssured.given().baseUri("https://ogads-pa.clients6.google.com/$rpc/google.internal.onegoogle.asyncdata.v1.AsyncDataService/GetAsyncData").get().then().statusCode(200);

    }
}
