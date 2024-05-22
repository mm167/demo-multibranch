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
                   sh 'mvn clean package -DskipTests=true'
               }
           }

           stage('Test') {
               steps {
                   sh 'mvn test'
               }
           }

          stage('Deploy') {
            steps {
                 sh 'echo "Deploying the application to production server"'
            }
          }
       }
   }
