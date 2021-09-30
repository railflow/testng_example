# Sample TestNG project

## Running sample tests

To build the project and run tests, execute the following command:

```shell
mvn clean test
```

This will create a `testng-results.xml` report file in `target/surefire-reports` directory.

## Uploading TestNG report into TestRail using Railflow NPM package

1. Install `railflow`

```shell
npm install railflow
```

2. Run `railflow`

```shell
npx railflow -k XXXXX-XXXXX-XXXXX-XXXXX -url https://testrail.server.address/ -u username@company.io -p password -pr "Railflow Demo" -path Demo/TestNG -f testng -r target/surefire-reports/testng-results.xml -tp TestPlanName
```
