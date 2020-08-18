#!groovy

/*
 * This script configures the Jenkins Slack Plugin.
 * Requires the installation of the Slack Plugin.
 * Tested with slack:2.14
 */

import jenkins.model.Jenkins

def slack = Jenkins.instance.getExtensionList('jenkins.plugins.slack.SlackNotifier$DescriptorImpl')[0]
slack.tokenCredentialId = 'slack-token'
slack.teamDomain = 'dvdmelamed'
slack.baseUrl = 'https://dvdmelamed.slack.com/services/hooks/jenkins-ci/'
slack.save()
