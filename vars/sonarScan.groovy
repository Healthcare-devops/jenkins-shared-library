def call(String projectKey = 'maven-app') {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQube') {
            sh """
                mvn sonar:sonar \
                -Dsonar.projectKey=${projectKey}
            """
        }
    }
}
