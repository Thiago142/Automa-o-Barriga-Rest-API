import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification

open class Base {

    fun specBase():RequestSpecification{
        return RequestSpecBuilder()
            .setBaseUri("https://barrigarest.wcaquino.me/")
            .addHeader("Authorization","JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MzIzNTF9.s73nMqg6mFhfPSiffv2J9hOl2v1UhcGZL5vIW1GZGLI")
            .build()


    }

}