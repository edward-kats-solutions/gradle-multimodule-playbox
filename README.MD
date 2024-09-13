# Gradle Multi-Module Project with Environment-based Configuration (a.k.a. Maven profile for Gradle)

## Project Overview
This is a Gradle multi-module Java project that demonstrates dynamic environment-based sources assembly using `.env` files and OS environment variables. It supports multiple implementations (`impl1` and `impl2`) selected at runtime based on the `PROFILE` environment variable.

## Modules
- **starter**: The main entry point of the application. It selects which implementation module (`impl1` or `impl2`) to use based on the `PROFILE` environment variable.
- **api**: Defines shared interfaces or common code used by the implementations.
- **impl1** / **impl2**: Provide different implementations of the functionality defined in the `api` module.

## Features
- Dynamic module selection using environment variables.
- Support for OS environment variables and `.env` file configurations.
- Creation of a fat JAR that includes all dependencies and allows running the project as a standalone application.

## Getting Started

### Prerequisites
- Java 11+

### Create .env file
*Auto-script for lazy (see in Intellij)*
```bash
printf 'PROFILE=impl1' > .env
```
Manually create `.env` file in the root and define the `PROFILE` ENV VAR
```
# .env
PROFILE=impl1
```
OR
```
# .env
PROFILE=impl2
```

You may also define same ENV VAR on OS level instead of `.env` file.

### Build the Project
```bash 
./gradlew :starter:jar
```

### Run the Project
```bash
java -jar starter/build/libs/gradle-multi-module.jar
```

## License
The source code for the site is licensed under the MIT license.


