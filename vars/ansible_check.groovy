def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/anugrawangchuk/Ansible.git'
    }
}
