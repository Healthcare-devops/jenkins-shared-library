def call(String imageName, String tag='latest') {
    stage('Docker Build') {
        sh "docker build -t ${imageName}:${tag} ."
    }
}
