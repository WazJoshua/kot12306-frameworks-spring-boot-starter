package com.josh.kotlintest

import lombok.RequiredArgsConstructor
import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicBoolean

/**
@author :Joshua
@date :2023/12/9 16:06:20
@description :
 */
@RequiredArgsConstructor
class TestLombok(private val i: Int, executeOnlyOnce: AtomicBoolean) {

    private val executeOnlyOnce: AtomicBoolean = AtomicBoolean(false)

    fun printAllArgs() {
        println("$i, ${executeOnlyOnce.get()}")
    }
}