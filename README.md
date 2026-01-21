# demo_mbytes

Small demo project with Java tests and Allure results.

## Project overview

This repository contains test code and generated Allure results. Key paths:

- Source tests: `src/test/java`
- Maven project file: `pom.xml`
- Generated Allure results (examples): `target/allure-results/` and `allure-results/`

## Prerequisites

- Java JDK 8+ (set JAVA_HOME)
- Maven 3.6+
- (Optional) Allure commandline if you want to serve reports locally

## Common commands

Build the project and run tests:

```powershell
mvn clean test
```

Run tests without building (if you'd like to preserve target):

```powershell
mvn -DskipTests=false test
```

Generate/serve Allure report (requires Allure CLI installed):

```powershell
# generate report (Allure will read from target/allure-results)
allure serve target/allure-results
```

If you prefer to generate the report into a directory:

```powershell
allure generate target/allure-results -o target/allure-report --clean
# then open target/allure-report/index.html in a browser
```

## Notes

- The repository already includes example Allure result JSON files in `target/allure-results` and `allure-results`.
- Tests live in `src/test/java` and are run by the Maven `test` lifecycle phase.

## Contributing / Next steps

- Add a `mvn verify` CI job to run tests and publish the Allure results.
- Add a small README or CONTRIBUTING.md for test-writing conventions.

---

Created by an automated assistant to provide quick start instructions for this repository.
