package com.example.testspekproject.packagetoruntests.pakage1

import io.kotlintest.shouldBe
import org.spekframework.spek2.Spek

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
object ExampleUnitTest2 : Spek({
    group("dummy test") {
        test("addition is correct") {
            4 shouldBe 2 + 2
        }
    }
})