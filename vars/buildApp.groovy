
def installingDependencies() {
    echo "Installing dependencies..."
    sh "touch /tmp/test.txt"
}
def runningTests() {
    echo "Running tests..."
}
def buildingApplication() {
    echo "Building the application..."
}
def deployingApplication() {
    echo "Deploying the application..."
}

def thisIsPipelineOne() {
    echo "This is pipeline one"
}
def thisIsPipelineTwo() {
    echo "This is pipeline two"
}
