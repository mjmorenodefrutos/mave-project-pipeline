pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
				
            }
			post{
				success {
				echo 'guardando .....'
				archiveArtifacts artifacts: '**/target/*.war'
				}
			}
        }
        stage('Paso a ore') {
            steps {
                build job: 'realizar-deploy'
            }
        }
        stage('Etapa 3') {
            steps {
                echo 'Hola Mundo'
            }
        }
    }
}