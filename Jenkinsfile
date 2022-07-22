pipeline {
    agent any
    tools {
        maven 'Maven3.8'
        jdk 'JDK1.8'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('docker build and deliver to docker hub') {
            steps {
                sh '''docker build -t cicd:v1.0 .
                      docker login --username kloseqz
                      docker tag cicd:v1.0 kloseqz/cicdjenkins:v1.0
                      docker push kloseqz/cicdjenkins:v1.0
                '''
            }
        }
    }
}