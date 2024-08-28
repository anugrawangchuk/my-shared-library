def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/OT-MyGurukulam/Ansible_27.git'
    }
}
