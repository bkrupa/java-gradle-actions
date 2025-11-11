# Java Gradle Application

A simple Java application built with Gradle.

## Running the Application

To run the Hello World application:

```bash
./gradlew run
```

On Windows:
```cmd
gradlew.bat run
```

## Building the Application

To build the application:

```bash
./gradlew build
```

## Running Tests

To run the tests:

```bash
./gradlew test
```

## Project Structure

```
├── build.gradle              # Gradle build configuration
├── gradlew                   # Gradle wrapper script (Unix)
├── gradlew.bat              # Gradle wrapper script (Windows)
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── HelloWorld.java
    └── test/
        └── java/
            └── com/
                └── example/
                    └── HelloWorldTest.java
```