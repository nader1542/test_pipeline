pipeline {

    agent any

    stages {

        stage("compilation") {

            steps {
 
                bat 'mvn -Dmaven.test.failure.ignore clean package'
            }

        }
        stage('Results') {
             steps {
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
             }
        }
        stage('déploiement'){
            steps {
                dir('target') {
                    bat 'copy *.jar C:\\apache-tomcat-8.5.34\\webapps'
                }
                
            }
        }
    }
}
