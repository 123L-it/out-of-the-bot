package com.vit123long

import com.vit123long.plugins.configureRouting
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import org.junit.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testApp() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/")

        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Out of the box!", response.bodyAsText())
    }
}
