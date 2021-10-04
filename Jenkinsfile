pipeline {
    agent none
    stages {
      	stage('Build') {
            agent {
                docker {
                    image 'maven:3.8.1-adoptopenjdk-11'
                }
            }
            steps {
                echo 'BUILD STEP**'
                git branch: 'master', credentialsId: 'b24ca3a6-9191-46fb-bbe7-753712796bc5', url: 'https://github.com/railflow/testng_example'
                sh 'mvn test || true'
                archiveArtifacts artifacts: 'target/surefire-reports/testng-results.xml', fingerprint: true
            }
    	}
        stage('pull artifact') {
            agent { docker { image 'railflow/railflow:2.0.6' } }
            environment {
               npm_config_cache = 'npm-cache'
            }
            steps {
                echo 'UPLOAD RESULT INTO TESTRAIL'
                sh 'cd /usr/railflow'
                copyArtifacts filter: 'target/surefire-reports/testng-results.xml', fingerprintArtifacts: true, projectName: '${JOB_NAME}', selector: specific('${BUILD_NUMBER}')
                withCredentials([string(credentialsId: 'RAILFLOW_KEY', variable: 'RAILFLOW_KEY'), string(credentialsId: 'RAILFLOW_PASSWORD', variable: 'RAILFLOW_PASSWORD'), string(credentialsId: 'RAILFLOW_USERNAME', variable: 'RAILFLOW_USERNAME')]) { //set SECRET with the credential content
                    sh 'echo $RAILFLOW_KEY'
                    sh 'npx railflow -k $RAILFLOW_KEY -url https://testrail6.railflow.io/ -u $RAILFLOW_USERNAME -p $RAILFLOW_PASSWORD -pr "Github-Demo" -path Demo/TestNG -f testng -r ./target/surefire-reports/testng-results.xml -tp TestPlanName'
                    sh '''echo $RAILFLOW_KEY > tmp
                          echo $RAILFLOW_USERNAME >> tmp
                          echo $RAILFLOW_PASSWORD >> tmp
                    '''
                }
                sh 'cat tmp'
            }
        }
    }
}