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
				archiveArtifacts: '**/target/*.war'
				}
			}
        }
        stage('Etapa 2') {
            steps {
                echo 'Estoy en etapa 2'
            }
        }
        stage('Etapa 3') {
            steps {
                echo 'Hola Mundo'
            }
        }
    }
}