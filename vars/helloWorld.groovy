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
						deleteDir()
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
