package apis

import factory.RegisterContasFactory
import pojo.RegisterContasPojo
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

class PostContas: Base() {
      fun postContas(registerContasPojo: RegisterContasPojo):Response{
          return Given {
              spec(specBase())
              contentType(ContentType.JSON)
              body(registerContasPojo)
              log().all()
          }When {
              post("/contas/")
          }Then {
              log().all()

          }Extract {
              response()
          }
      }

}


