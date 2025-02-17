def call(String SonarQubeAPI, String Projectname, String ProjectKey, String SonarScannerTool = 'Sonar-scanner') {
    withSonarQubeEnv("${SonarQubeAPI}") {
        sh "${tool SonarScannerTool}/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -X"
    }
}
