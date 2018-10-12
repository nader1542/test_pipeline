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
                bat 'copy(file:".\\target\\*.jar", tofile:"C:\\apache-tomcat-8.5.34\\webapps")'
            }
        }
    }
}
