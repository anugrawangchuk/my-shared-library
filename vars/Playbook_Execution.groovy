def call() {
    stage('playbook execution') {

        sh "ansible-playbook Assignment5/playbook.yml -i Assignment5/inventory.ini "
    }
}
