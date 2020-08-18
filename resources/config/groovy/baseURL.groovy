#!groovy

/*
 * This script configures the Jenkins base URL.
 */

import jenkins.model.JenkinsLocationConfiguration

JenkinsLocationConfiguration location = Jenkins.instance.getExtensionList('jenkins.model.JenkinsLocationConfiguration')[0]
location.url = 'http://localhost:8088/' // minikube:jenkins-node-port
location.save()
