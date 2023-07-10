# Assignment for Intertrust
**Structure**

The framework is structured as POM design pattern and uses Maven.

The framework is divided into two parts:
1. API
<br>Files: src/main/java/com/intertrust/api
<br>Test Files: src/main/test/com/intertrust/api
2. Web UI
   <br>Files: src/main/java/com/intertrust/webui
   <br>Test Files: src/main/test/com/intertrust/webui

The following dependencies/plugins have been used:
1. Selenium
2. Rest Assured
3. Cucumber (java+testng)
4. Surefire Plugin

**Execution**
1. For running Web UI test cases, run with the following command:
```
mvn clean test -Dplatform=webui
```
2. For running Web UI test cases, run with the following command:
```
mvn clean test -Dplatform=api
```

**Reporting**

For reporting, the framework uses the below components:
1. The default surefire reports (target/surefire-reports)
2. Terminal output
