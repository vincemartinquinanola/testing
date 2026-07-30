package com.vauldex.vldx_techhub_api.badcode

import java.io.* // Detekt: WildcardImport

class BadCodeExample {

    // ❌ Ktlint: Unexpected tab character(s) used for indentation
    fun doMathAndStuff() {
        val x=10+5 // ❌ Ktlint: Bad indentation and missing spaces around '=' and '+'
        val magicNumber = x * 42 // ❌ Detekt: MagicNumber (42)

        if(magicNumber > 100){ // ❌ Ktlint: Missing space after 'if' and before '{'
            throw Exception("Boom") // ❌ Detekt: TooGenericExceptionThrown
        }

        val arr = arrayOf("a", "b")
        printThings(*arr) // ❌ Detekt: SpreadOperator
    }

    // ❌ Detekt: EmptyFunctionBlock
    fun emptyFunction() {
    }

    fun printThings(vararg things: String) {
        // ❌ Detekt & Ktlint: MaxLineLength (Exceeds 120 characters)
        val veryLongString = "This is an extremely long string that is definitely going to exceed the maximum line length of one hundred and twenty characters which is the standard limit."
    }


} // ❌ Ktlint: Unexpected blank line(s) before "}"