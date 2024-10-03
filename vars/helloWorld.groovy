def call()
{
	pipeline{
		agent any
		
		stages
		{

			stage('build')
			{
				steps
				{
					script 
					{
                    				sh 'dotnet build StarWarsChallenge/StarWarsChallenge.sln'
                			}

				}
			}

			stage('test')
			{
				steps
				{
					script 
					{
						sh 'dotnet test StarWarsChallenge/StarWarsChallenge.sln'
				
					}
				}
			}
		}
	}
}
