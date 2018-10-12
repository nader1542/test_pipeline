pipeline {
agent any&lt;/code&gt;
 
tools{
maven 'maven 3'
jdk 'java 8'
}
 
stages {
stage ("initialize") {
steps {
sh '''
echo "PATH = ${PATH}"
echo "MAVEN_HOME = ${MAVEN_HOME}"
}
}
