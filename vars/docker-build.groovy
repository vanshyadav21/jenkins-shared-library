def call ( string projectName  , string ImageTag , string DockerHubUser){
  sh " docker build -t ${DockerHubUser}/${projectName}:${ImageTag} "
}
