// vars/hello.groovy

def sayHello() {
    echo "Hello from shared library!"
}

def sayBye() {
    echo "Goodbye from shared library!"
}

def greetUser(String name) {
    echo "Hello, ${name}!"
}
