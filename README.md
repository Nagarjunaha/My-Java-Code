What is Selenium?
Selenium is a free (open source) automated testing suite for web applications across different browsers and platforms.It is quite similar to HP Quick Test Pro (QTP) only that Selenium focuses on automating web-based applications.
Selenium is not just a single tool but a suite of softwares, each catering to different testing needs of an organization. It has four components.
Selenium Integrated Development Environment (IDE)
Selenium Remote Control (RC)
WebDriver
Selenium Grid

 
At the moment, Selenium RC and WebDriver are merged into a single framework to form Selenium 2. Selenium 1, by the way, refers to Selenium RC. 
 




Brief Introduction about WebDriver
The WebDriver proves itself to be better than both Selenium IDE and Selenium RC in many aspects. It implements a more modern and stable approach in automating the browser's actions. WebDriver, unlike Selenium RC, does not rely on JavaScript for automation. It controls the browser by directly communicating to it.
The supported languages are the same as those in Selenium RC.
Java
C#
PHP
Python
Perl
Ruby

Selenium Grid
Selenium Grid is a tool used together with Selenium RC to run parallel tests across different machines and different browsers all at the same time. Parallel execution means running multiple tests at once.
Features:
Enables simultaneous running of tests in multiple browsers and environments.
Saves timeenormously.
Utilizes the hub-and-nodes concept. The hub acts as a central source of Selenium commands to each node connected to it.
Note on Browser and Environment Support
Because of their architectural differences, Selenium IDE, Selenium RC, and WebDriver support different sets of browsers and operating environments.
 
Selenium IDE
Selenium RC
WebDriver
Browser
Support
Mozilla Firefox
Mozilla Firefox
Internet Explorer
Google Chrome
Safari
Opera
Konqueror
Others
 
Internet Explorer versions 6 to 9, both 32 and 64-bit
 
Firefox 3.0, 3.5, 3.6, 4.0, 5.0, 6, 7 and above
(current version is 16.0.1)
 
Google Chrome 12.0.712.0 and above
(current version is 22.0.1229.94 m)
 
Opera 11.5 and above
(current version is 12.02)
 
Android - 2.3 and above for phones and tablets
(devices & emulators)
 
iOS 3+ for phones (devices & emulators) and 3.2+ for tablets (devices & emulators)
 
HtmlUnit 2.9 and above
(current version is 2.10)
Operating System
Windows
Mac OS X
Linux
 
Windows
Mac OS X
Linux
Solaris
All operating systems where the browsers above can run.
How to Choose the Right Selenium Tool for Your Need
 
 
Tool
Why Choose ?
Selenium IDE
To learn about concepts on automated testing and Selenium, including:
Selenese commands such as type, open, clickAndWait, assert, verify, etc.
Locators such as id, name, xpath, css selector, etc.
Executing customized JavaScript code using runScript
Exporting test cases in various formats.
To create tests with little or no prior knowledge in programming.
To create simple test cases and test suites that you can export later to RC or WebDriver.
To test a web application against Firefox only.
Selenium RC
To design a test using a more expressive language than Selenese
To run your test against different browsers (except HtmlUnit) on different operating systems.
To deploy your tests across multiple environments using Selenium Grid.
To test your application against a new browser that supports JavaScript.
To test web applications with complex AJAX-based scenarios.
WebDriver
To use a certain programming language in designing your test case.
To test applications that are rich in AJAX-based functionalities.
To execute tests on the HtmlUnit browser.
To create customized test results.
Selenium Grid
To run your Selenium RC scripts in multiple browsers and operating systems simultaneously.
To run a huge test suite, that need to complete in soonest time possible.

Summary
 
The entire Selenium Tool Suite is comprised of four components:
Selenium Remote Control, also known as Selenium 1, which is the first Selenium tool that allowed users to use programming languages in creating complex tests.
WebDriver, the newer breakthrough that allows your test scripts to communicate directly to the browser, thereby controlling it from the OS level.
Selenium Gridis also a tool that is used with Selenium RC to execute parallel tests across different browsers and operating systems.
Selenium RC and WebDriver was merged to form Selenium 2.
Selenium is more advantageous than QTP in terms of costs and flexibility. It also allows you to run tests in parallel, unlike in QTP where you are only allowed to run tests sequentially.


Installation of Firebug
Firebug is a Firefox add-on that we will use to inspect the HTML elements of the web application under test. It will provide us the name of the element that our Selenese command would act upon.
Step 1
Use Firefox to navigate to Firebug's download page (https://getfirebug.com/downloads/) and click on the download link.

Step 2
Firefox will take you to its Firebug download section. Click the "Add to Firefox" button.

Step 3
Wait for Firefox to complete downloading this add-on. On the dialog box that comes after, click "Install Now."

Step 4
Wait for installation to complete. A notification will pop-up saying, "Firebug has been installed successfully." You can immediately close this pop-up.

Note: In case you do not see above pop-up , no worries! This pop-up appears for a few seconds and disappears.
You do not need to restart Firefox after installing Firebug.
Step 5
Launch Firebug by doing either of these two methods:
Press F12
Click on the Firebug button on the upper right corner of the Firefox window.

Step 6
Firebug should launch at the bottom of Firefox as shown below

 

Guide to install Selenium WebDriver
In this tutorial we will install Webdriver (Java only) and Configure Eclipse
Step 1 - Install Java on your computer
Download and install the Java Software Development Kit (JDK) here.

Next -

 
This JDK version comes bundled with Java Runtime Environment (JRE) so you do not need to download and install the JRE separately.
Step 2 - Install Eclipse IDE
Download "Eclipse IDE for Java Developers" here. Be sure to choose correctly between Windows 32 Bit and 64 Bit versions.

You should be able to download a ZIP file named "eclipse-java-juno-SR1-win32-x86_64.zip" (the version number "SR1" may change over time).

Inside that ZIP file, there is an "eclipse" folder which contains all the application files. You can extract the "eclipse" folder anywhere you want in your PC; but for this tutorial, extract it to your C drive.

Unlike  other popular software , no installation is required to use eclipse.
Step 3 - Download the Selenium Java Client Driver
You can download the Selenium Java Client Driver here. You will find client drivers for other languages there, but only choose the one for Java.

This download comes as a ZIP file named "selenium-2.25.0.zip". For simplicity, extract the contents of this ZIP file on your C drive so that you would have the directory "C:\selenium-2.25.0\". This directory contains all the JAR files that we would later import on Eclipse.
Step 4 - Configure Eclipse IDE with WebDriver
Launch the "eclipse.exe" file inside the "eclipse" folder that we extracted in step 2. If you followed step 2 correctly, the executable should be located on C:\eclipse\eclipse.exe.
When asked to select for a workspace, just accept the default location.

Create a new project through File > New > Java Project. Name the project as "myproject".
Right-click on the newly created project and select New > Package, and name that package as "mypackage".
Create a new Java class under mypackage by right-clicking on it and then selecting New > Class, and then name it as "myclass". Your Eclipse IDE should look like the image below.

Right-click on myproject and select Properties.
On the Properties dialog, click on "Java Build Path".
Click on the Libraries tab, and then click "Add External JARs.."
Navigate to C:\selenium-2.25.0\ (or any other location where you saved the extracted contents of "selenium-2.25.0.zip" in step 3).
Browser
Name of Driver Server
Remarks
HTMLUnit
(none)
WebDriver can drive HTMLUnit without the need of a driver server
Firefox
(none)
WebDriver can drive Firefox without the need of a driver server
Internet Explorer
Internet Explorer Driver Server
Available in 32 and 64-bit versions. Use the version that corresponds to the architecture of your IE
Chrome
ChromeDriver
Though its name is just "ChromeDriver", it is in fact a Driver Server, not just a driver. The current version can support versions higher than Chrome v.21
Opera
OperaDriver
Though its name is just "OperaDriver", it is in fact a Driver Server, not just a driver.
PhantomJS
GhostDriver
PhantomJS is another headless browser just like HTMLUnit.
Safari
SafariDriver
Though its name is just "SafariDriver", it is in fact a Driver Server, not just a driver.
Add all the JAR files inside and outside the "libs" folder. Your Properties dialog should now look similar to the image below.

Finally, click OK and we are done importing Selenium libraries into our project.
Different Drivers
HTMLUnit and Firefox are two browsers that WebDriver can directly automate - meaning that no other separate component is needed to install or run while the test is being executed. For other browsers, a separate program is needed. That program is called as the Driver Server.
A driver server is different for each browser. For example, Internet Explorer has its own driver server which you cannot use on other browsers. Below is the list of driver servers and the corresponding browsers that use them.
 
You can download these driver servers here
Summary
Aside from a browser, you will need the following to start using WebDriver
Java Development Kit (JDK). http://www.oracle.com/technetwork/java/javase/downloads/index.html
Eclipse IDE - http://www.eclipse.org/downloads/
Java Client Driver - http://seleniumhq.org/download/
When starting a WebDriver project in Eclipse, do not forget to import the Java Client Driver files onto your project. These files will constitute your Selenium Library.
HTMLUnit and Firefox are the only browsers that you can automate without the use of a Driver Server.
Each other browser has its own driver server. 
