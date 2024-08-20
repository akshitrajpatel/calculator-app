pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                git branch: 'main', url: 'https://github.com/akshitrajpatel/calculator-app.git'
            }
        }

        stage('Build') {
            steps {
                // Use Maven to build the project
                sh 'mvn clean install'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                // Run the Selenium test cases
                sh 'mvn test -Dtest=com.calculator.selenium.tests.**'
            }
        }

        stage('Publish Results') {
            steps {
                // Publish the test results
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
