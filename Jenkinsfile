   pipeline {
       agent any

       stages {
           stage('Checkout') {
               steps {
                   checkout scm
               }
           }

           stage('Build') {
               steps {
                   sh 'mvn clean install -DskipTests
               }
           }

           stage('Test') {
               steps {
                   sh 'mvn test'
               }
           }

          stage('Deploy') {
            steps {
                 sh 'echo "Deploying the application to dev server and new line"'
            }
          }
       }
   }
