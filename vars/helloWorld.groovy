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
