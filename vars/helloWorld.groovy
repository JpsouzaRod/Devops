def call()
{
	pipeline{
		agent any
		
		stages
		{

			stage('init')
			{
				steps
				{
					script 
					{
                    				sh 'git clone https://github.com/JpsouzaRod/challenge-back-end-hit.git'
                			}

				}
			}
			stage('build')
			{
				steps
				{
					script 
					{
						sh 'cd/var/jenkins_home/workspace/PipelineGroovyTest_develop/StarWarsChallenge'
                    				sh 'dotnet build StarWarsChallenge.sln'
                			}

				}
			}

			stage('test')
			{
				steps
				{
					script 
					{
						sh 'dotnet test StarWarsChallenge.sln'
				
					}
				}
			}
		}
	}
}
