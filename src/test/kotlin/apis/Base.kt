package apis

import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification

open class Base {

    fun specBase():RequestSpecification{
        return RequestSpecBuilder()
            .setBaseUri("https://barrigarest.wcaquino.me/")
            .addHeader("Authorization","JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MzcwOTd9.WVkzd1dMMJ7dCG4ZMHcwM3v1YvR3HOPKcaT4_xRhnck")
            .build()

    }

}