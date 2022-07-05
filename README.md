## Final project: Master CICD and DevOps using Jenkins ##
This was a  Hands-On practice Course on Jenkins admin.

## Motivation: ##
This repo contains a [Jenkinsfile](https://github.com/rolandoworks/jenkinsMavenTestNGSeleniumInt/blob/master/Jenkinsfile) to test, package, check the code quality of the [SampleSeleniumTest.java](https://github.com/rolandoworks/jenkinsMavenTestNGSeleniumInt/blob/master/src/test/java/com/rdiaz/training/jenkins/SampleSeleniumTest.java)+[JenkinsCalcTest.java](https://github.com/rolandoworks/jenkinsMavenTestNGSeleniumInt/blob/master/src/test/java/com/rdiaz/training/jenkins/JenkinsCalcTest.java) and send email notification. The Jenkinsfile executes the maven goals, using the [pom.xml](https://github.com/rolandoworks/jenkinsMavenTestNGSeleniumInt/blob/master/pom.xml) configuration file.

#### A video with the complete CI-CD lifecycle (push->test->package->sonarCheck->emailNotification) ####
[![img)](view)](https://user-images.githubusercontent.com/54998736/177230697-67409199-6c23-48fa-bf3d-65ae28f3b100.mp4)

### Systems ###
1) The Jenkins instance was running on Tomcat on a remote server (ubuntu 20.04), as well as the SonarQube code analysis instance.

2) The Job was triggered once a new commit was pushed into the github repo or manually from the Jenkins dashboard.

### Note: ###
After a successful run a SNAPSHOT.jar artifact and [TestNG](https://github.com/rolandoworks/jenkinsMavenTestNGSeleniumInt/blob/master/testng.xml) results are generated.
