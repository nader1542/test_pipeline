pipeline {

    agent any

    stages {

        stage('compilation') {
            steps { 
                bat 'mvn clean install -Dmaven.test.skip=true'
            }
        }
        stage('test'){
            steps { 
                bat 'mvn test -Dmaven.test.failure.ignore'
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
        stage('Démarrage du serveur'){
            steps {
                dir('C:\\apache-tomcat-8.5.34\\bin') {
                    bat 'startup'
                }
                
            }
        }
    }
}
