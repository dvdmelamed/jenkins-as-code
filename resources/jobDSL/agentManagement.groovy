pipelineJob() {

    parameters {
        stringParam('agentID', '', '') 
    }

    logRotator {
        numToKeep(50)
    }

    throttleConcurrentBuilds {
        maxTotal(1)
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github("dvdmelamed/jenkins-as-code", "ssh")
                        credentials("deploy-key-shared-library")
                    }

                    branch('master')
                }
            }
        }
    }
}
