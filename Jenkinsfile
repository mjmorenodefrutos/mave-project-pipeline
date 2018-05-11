pipeline {
    agent any
	
	triggers {
		pollSCM('* * * * *')
	}
	

    stages {
		/*git url: 'git://github.com/mjmorenodefrutos/mave-project-pipeline', branch: 'master'*/

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
        stage('Paso a pre') {
            steps {
                build job: 'realizar-deploy'
            }
			post {
				always {
					bat 'mvn checkstyle:checkstyle'
				}

				success {
					echo 'checkstyle correcto'
				}
				failure {
					echo 'Ha fallado checkstyle'
				}
			}
        }
        stage('Paso a pro') {
            steps {
                timeout(time:5, unit:'DAYS'){
					input message: 'Aprobar el '
				}
				build job: 'realizar-deploy-produccion'
            }
			post{
				success {
					echo 'Despliegue correcto'
				}
				failure {
					echo 'Ha fallado despliegue a PRO'
				}
			}
        }
    }
}