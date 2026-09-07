def call() {
    stage('Build') {
        echo "Building Maven application..."
        sh 'mvn clean package'
    }
}
