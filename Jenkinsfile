pipeline {

    agent any

    stages {

        stage(‘Build’) {

            steps {

                sh 'mvn clean install -Dmaven.test.skip=true'

            }

        }

    }

}
