pipeline {

    agent any

    stages {

        stage("compilation") {

            steps {

               
                bat 'mvn -Dmaven.test.failure.ignore clean package'
                   
 
            }

        }
        
        stage('Results') {
           junit '**/target/surefire-reports/TEST-*.xml'
           archive 'target/*.jar'
        }

    }

}
