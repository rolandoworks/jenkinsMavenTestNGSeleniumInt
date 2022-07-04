pipeline {
    agent any
    environment {
        JAVA_HOME="${tool 'JDKDefault'}"
        PATH="${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
	stage('Cleaning Stage') {
            steps {
                sh "mvn clean"
            }
       }

       stage("Parallel Execution") {
          steps {
            parallel(
            	p1: {
            	   sh "mvn test"
            	  },
            	p2: {
                   sh "mvn package"
            	  }
            	)
          }
       }

       stage('SonarQube analysis Stage') {
         steps {
             withSonarQubeEnv('sonarqube-tokenized') {
                sh 'mvn sonar:sonar'
            }
         }
       }

       stage('Consolidate Results') {
            steps {
            	input("Do you want to capture results?")
                junit '**/target/surefire-reports/TEST-*.xml'
        	archiveArtifacts 'target/*.jar'
            }
        }

       stage('Email Build Status') {
      	    steps {
                mail body: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}\n\nCheck console output at ${env.BUILD_URL} to view the results.",subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}!!",to: 'rolandoworks@gmail.com'
        }
      }
   }
}
