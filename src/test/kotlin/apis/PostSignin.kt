package apis

import pojo.RegisterUserPojo
import factory.RegisterUsersFactory
import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostSignin: Base() {

    fun postSignin(registerUserPojo: RegisterUserPojo):Response{
        return Given {
            spec(specBase())
            contentType(ContentType.JSON)
            body(registerUserPojo)
            log().all()
        }When {
            post("/signin")
        }Then {
            log().all()
        }Extract {
            response()
        }
    }

}