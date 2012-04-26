code-coverage-sample
====================

Sample project to measure code and requirements coverage with functional tests on WebDriver.

Default configuration relies on some facts:

- Firefox is installed on the target machine;
- Firefox profile with name 'selenium' is created ('webdriver.firefox.profile' property in pom.xml);
- Sonar is installed on the target machine and project is created in Sonar;
- Sonar database is MySql with default settings ('sonar.jdbc.driverClassName' and 'sonar.jdbc.url' properties in pom.xml);
- Sonar database is available and Sonar is up and running;
- Ports 8080 and 8109 are available ('cargo.servlet.port' and 'cargo.tomcat.ajp.port' properties in pom.xml);

All reports will be generated automatically in Sonar and 'target/site' directory.

Use it with pleasure!


