package de.richarg.example.kotlinJavaNullableInterop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ClassWithAnnotation implements CommonInterface {

    @Nullable
    public FooText nullableObject(){
        return null;
    }

    @NotNull
    public FooText notNullableObject(){
        return new FooText();
    }

}
