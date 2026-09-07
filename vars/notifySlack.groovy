def call(String message) {
    stage('Slack Notification') {
        slackSend(
            channel: '#devops',
            message: message
        )
    }
}
