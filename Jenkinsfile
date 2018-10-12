pipeline {

    agent any

    stages {

        stage("compilation") {

            steps {

               
                bat 'mvn clean install -Dmaven.test.skip=true'
                   
 
            }

        }

    }

}
