def call(String name = 'world') {
    echo "Hello, ${name}!"
}

def chooseBuildTool(String buildTool) {
    switch (buildTool) {
        case 'maven':
            echo "Using Maven as build tool..."
            break
        case 'gradle':
            echo "Using Gradle as build tool..."
            break
    }
}
def choosePlatform(String platform) {
    switch (platform) {
        case 'linux':
            echo "Using Linux as platform..."
            break
        case 'windows':
            echo "Using Windows as platform..."
            break
    }
}