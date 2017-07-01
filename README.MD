Kapt example
============

This is a bit of boilerplate for an all-Kotlin project containing both the application and an annotation processor applied to the application.
This example uses a multi-project setup using [kotlin-dsl](https://github.com/gradle/kotlin-dsl) and [kapt](https://kotlinlang.org/docs/reference/kapt.html).

 - [kapt-example-app](./kapt-example-app): Project for the actual application.
 - [kapt-example-core](./kapt-example-core): Library project containing logic shared by the application and annotation processor such as annotation classes.
 - [kapt-example-processor](./kapt-example-processor): The annotation processor project.
 
 This example introduces "Interesting" things. The compiler will remark that something is interesting if you annotate it as such.
 This, of course, has no real application.
 
 Test the application using the following. Note that it will remain silent if the compilation task is up to date.
 
 ```
 ./gradlew build
 ```
 
 It should output the following:
 ```
 :kapt-example-app:kaptKotlin
w: warning: main is interesting.
w:
 ```
