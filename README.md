# RESTAssured-Java-TestNG
E2E API testing with REST Assured
Build Tool - Maven
Test Runner - TestNG
Reporting - maven-surefire-report-plugin

API : https://reqres.in/api/users - Free API to test GET, POST, PUT and DELETE

** Execute selected tests

1. To execute single test with Maven: mvn clean test -Dtest="<"test class name eg:get_list_users">"
2. To execute tests from IntelliJ IDE: Use Run option in IDE

** Execute test suite
1. Add test class names to testng.xml
2. To execute test suite from IntelliJ using TestNG: Right-click on the testng.xml file and select Run 
3. To execute the test suite from command line: "mvn clean test"  OR  "mvn test"

** View reports
1. Surefire report is generated when the test suite is executed from command line
2. Report path - target/surefire-reports/emailable-report.html

Note: 
* The Maven Clean Plugin, cleans the files and directories generated by Maven during its build.
* Invalidate caches in IntelliJ if plugins are not updated locally
