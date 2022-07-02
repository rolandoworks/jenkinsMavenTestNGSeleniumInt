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

        stage('Testing Stage') {
            steps {
                sh "mvn test"
            }
        }

        stage('Packaging Stage') {
            steps {
                sh "mvn package"
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
