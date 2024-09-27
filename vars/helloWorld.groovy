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
					echo 'hello by vars'
				}
			}

			stage('test')
			{
				steps
				{
					echo 'testing vars'
				}
			}
		}
	}
}