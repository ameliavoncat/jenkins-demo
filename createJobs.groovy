pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ameliavoncat/spring-boot-demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ameliavoncat/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}

pipelineJob('theme-park-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ameliavoncat/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}
