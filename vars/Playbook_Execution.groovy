def call() {
    stage('playbook execution') {

        sh "ansible-playbook Ansible/playbook.yml -i Ansible/inventory.ini"
    }
}
