<h1>My Cucumber - Selenium - Maven Stack</h1>

With this stack BDD Behaviour driven development can be introduced into our web shop projects.

<h2>Cucumber</h2>
provides executable specs, which can be written by QA + dev before the development starts. The developer is then rsponsible for connecting the spec execution against the actual application. The example for testing an Intershop frontend can be found in ciplogin.feature

<h2>Selenium</h2>
provides the web testing tools, like WebDriver, etc.

<h2>Maven</h2>
makes it easy to install and easy to integrate into jenkins for automation

<h2>Getting started</h2>

- clone the repo
- make sure you have access to the cip dev instance
- if you want, install the WebDrivers for Chrome, Safari and Internet Explorer  (http://www.seleniumhq.org/download/)
- start the test with mvn clean test -DbrowserName="Firefox|Internet Explorer|Chrome" -Dwebdriver.chrome.driver=PATH_TO_chromedriver -Dwebdriver.ie.driver=PATH_TO_ie_driver



