package de.richarg.example.kotlinJavaNullableInterop

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.Test
import java.lang.NullPointerException

class NotNullAnnotationTest {

    @Test
    fun `method without annotation is assumed to be not-null`() {
        // arrange
        val foo = ClassWithoutAnnotation()

        //act
        val notNullableObject = foo.notNullableObject()

        //assert
        assertThat(notNullableObject.text()).isEqualTo("foo")
    }

    @Test
    fun `method with annotation is assumed to be not-null`() {
        // arrange
        val foo = ClassWithAnnotation()

        //act
        val notNullableObject: FooText = foo.notNullableObject()

        //assert
        assertThat(notNullableObject.text()).isEqualTo("foo")
    }

}
