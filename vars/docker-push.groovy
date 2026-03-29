def call (string project , string ImageTag , string dockerHubUser){
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")]) {
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
}
  sh " docker push ${dockerHubUser}/${project}:${ImageTag}"
