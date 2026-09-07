def call(String imageName, String tag, String registry) {
    stage('Push Docker Image') {
        sh """
            docker tag ${imageName}:${tag} ${registry}/${imageName}:${tag}
            docker push ${registry}/${imageName}:${tag}
        """
    }
}
