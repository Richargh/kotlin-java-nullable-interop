package de.richarg.example.kotlinJavaNullableInterop

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.Test
import java.lang.NullPointerException

class NullableAnnotationTest {

    @Test
    fun `method without annotation is assumed to be not-null which leads to a Nullpointer`() {
        // arrange
        val foo = ClassWithoutAnnotation()

        //act
        val nullableText = foo.nullableObject()

        //assert
        assertThatExceptionOfType(NullPointerException::class.java).isThrownBy { nullableText.text() }
    }

    @Test
    fun `method with annotation is assumed to be nullable which now requires non-null asserted call`() {
        // arrange
        val foo = ClassWithAnnotation()

        //act
        val nullableText: FooText? = foo.nullableObject()

        //assert
        assertThatExceptionOfType(NullPointerException::class.java).isThrownBy { nullableText!!.text() }
    }

}
