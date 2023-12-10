package com.josh.kotlintest

import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicBoolean

/**
@author :Joshua
@date :2023/12/9 16:15:10
@description :
 */
class TestLo {

    @Test
    fun testLombok() {
        val t = TestLombok(3, AtomicBoolean(true))
        t.printAllArgs()
    }

}