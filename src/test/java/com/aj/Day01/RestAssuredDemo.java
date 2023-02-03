package com.aj.Day01;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredDemo {
    @Test
    public void test(){
        //设置请求头、请求体、
        given().

        when().
           get("https://www.baidu.com").
        then().log().body();


    }
}
