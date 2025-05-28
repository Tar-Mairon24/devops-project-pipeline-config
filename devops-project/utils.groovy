// utils.groovy

def printEnvVars(envVars) {
    envVars.each { key, value ->
        echo "${key}: ${value}"
    }
}

def runShellCommand(command) {
    echo "Running command: ${command}"
    sh command
}

def listDirectoryContents(dirPath = '.') {
    echo "Listing contents of directory: ${dirPath}"
    sh "ls -la ${dirPath}"
}

return this