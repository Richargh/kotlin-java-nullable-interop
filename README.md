# Kotlin-Java-Nullable-Interop Example

This project tests what Kotlin does when Java objects might be null.

> Any reference in Java may be null, which makes Kotlin's requirements of strict null-safety impractical for objects coming from Java. 
> [...] Null-checks are relaxed for such types, so that safety guarantees for them are the same as in Java.
> 
> -- [Official Kotlin-Java interop](https://kotlinlang.org/docs/reference/java-interop.html#null-safety-and-platform-types) 

So basically Kotlin does not help us here, which makes sense because it does not have the necessary information.
For me that behavior turned out be rather annoying when dealing with Jaxb generated code for xsd files.
It would be nice if things declared as optional in the xsd are represented as nullable types in Kotlin.

> Java types which have nullability annotations are represented [...] as actual nullable or non-null Kotlin types. 
> The compiler supports several flavors of nullability annotations, including:
> * JetBrains (@Nullable and @NotNull from the org.jetbrains.annotations package)
> * Android (com.android.annotations and android.support.annotations)
> * JSR-305 (javax.annotation, more details below)
> * FindBugs (edu.umd.cs.findbugs.annotations)
> * Eclipse (org.eclipse.jdt.annotation)
> * Lombok (lombok.NonNull).
> 
>-- [Official Kotlin-Java interop](https://kotlinlang.org/docs/reference/java-interop.html#nullability-annotations)

That means if your tool of choice can use these annotations, Kotlin interprets them correctly.
Luckily the tests in this project prove that.