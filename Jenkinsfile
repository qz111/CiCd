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
        /*stage('test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }*/
        /*stage('docker build and deliver to docker hub') {
            steps {
                sh '''
                      cd /var/jenkins_home/workspace/cicdJenkins
                      docker build -t cicd:v1.0 .
                      docker tag cicd:v1.0 kloseqz/cicdjenkins:v1.0
                      docker push kloseqz/cicdjenkins:v1.0
                '''
            }
        }*/
        stage('deploy over ssh') {
            steps {
                sshPublisher(publishers: [sshPublisherDesc(configName: 'hostfordeploy', sshRetry: [retries: 1, retryDelay: 10000], transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''sudo docker login -u kloseqz -p 199102113411
                sudo docker pull kloseqz/cicdjenkins:v1.0
                sudo docker run -p 8801:8080 -d --name mycicdjenkins kloseqz/cicdjenkins:v1.0''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
    }
}