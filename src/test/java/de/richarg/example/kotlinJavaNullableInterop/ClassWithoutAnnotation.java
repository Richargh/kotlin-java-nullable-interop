package de.richarg.example.kotlinJavaNullableInterop;

public class ClassWithoutAnnotation implements CommonInterface {

    public FooText nullableObject(){
        return null;
    }

    public FooText notNullableObject(){
        return new FooText();
    }

}
