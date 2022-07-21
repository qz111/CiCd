pipeline {
    agent{
        docker{
            image 'maven:3-openjdk-8-slim'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}