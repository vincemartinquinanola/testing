package com.vauldex.vldx_techhub_api

class BadCodeExample {
    companion object {
        private const val BASE_VALUE = 10
        private const val ADDEND = 5
        private const val MULTIPLIER = 42
        private const val THRESHOLD = 100
    }

    fun doMathAndStuff() {
        val x = BASE_VALUE + ADDEND
        val magicNumber = x * MULTIPLIER

        if (magicNumber > THRESHOLD) {
            // ✅ Fix: Throws a specific exception instead of a generic one
            error("Boom")
        }

        val arr = arrayOf("a", "b")

        // ✅ Fix: Suppressing the spread operator since we intentionally want to use it here
        @Suppress("SpreadOperator")
        printThings(*arr)
    }

    fun emptyFunction() {
        // ✅ Fix: Added a comment so the block is no longer considered "empty"
        // Intentionally left blank for testing purposes
    }

    fun printThings(vararg things: String) {
        // ✅ Fix: Broke the long string into multiple lines to satisfy MaxLineLength
        val veryLongString =
            "This is an extremely long string that is definitely going to exceed " +
                "the maximum line length of one hundred and twenty characters which is the standard limit."

        // ✅ Fix: Actually using the variables so Detekt doesn't complain about dead code
        println(veryLongString)
        println(things.joinToString())
    }
}
