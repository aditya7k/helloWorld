package com.sf

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HelloClientSpec {

    @Inject
    lateinit var client: HelloClient

    @Test
    fun testHelloWorldResponse() {
        val blockingGet = client.hello().blockingGet();
        assertEquals("Hello World", blockingGet)
    }
}