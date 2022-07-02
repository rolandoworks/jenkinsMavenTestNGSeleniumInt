## Final project: Master CICD and DevOps using Jenkins ##
This was a  Hands-On practice Course on Jenkins admin.

## Motivation: ##
This repo contains a [Jenkinsfile](https://github.com/rolandoworks/JenkinsMavenTestNGSeleniumIntegration/blob/master/Jenkinsfile) to build, test, deploy and check the code quality of the [SampleSeleniumTest.java](https://github.com/rolandoworks/JenkinsMavenTestNGSeleniumIntegration/blob/master/src/test/java/com/rdiaz/training/jenkins/SampleSeleniumTest.java)&[JenkinsCalcTest.java](https://github.com/rolandoworks/JenkinsMavenTestNGSeleniumIntegration/blob/master/src/test/java/com/rdiaz/training/jenkins/JenkinsCalcTest.java). The Jenkinsfile executes the maven goals, using the [pom.xml](https://github.com/rolandoworks/JenkinsMavenTestNGSeleniumIntegration/blob/master/pom.xml) configuration file.

### Systems ###
1) The Jenkins instance was running on Tomcat on a remote server (ubuntu 20.04), as well as the SonarQube code analysis instance.

2) The Job was trigger once a new commit was pushed into the github repot or manually from the Jenkins dashboard.

### Note: ###
After a successful run a SNAPSHOT.jar artifact and [TestNG](https://github.com/rolandoworks/JenkinsMavenTestNGSeleniumIntegration/blob/master/testng.xml) results are generated.
