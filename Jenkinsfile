pipeline {
    agent any
    tools {
        maven 'Maven3.8'
        jdk 'JAVA_HOME'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}