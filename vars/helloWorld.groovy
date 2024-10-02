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
                   				// Build .NET solution
                    				bat 'dotnet build StarWarsChallenge.sln'
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
