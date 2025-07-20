package com.saloom

class Greeter implements Serializable {
    def steps

    Greeter(steps) {
        this.steps = steps
    }

    def sayHello(String name) {
        steps.echo "Hello, ${name}!"
    }
    def sayWelcome(String name) {
        steps.echo "Welcome, ${name}!"
    }
    def sayGoodbye(String name) {
        steps.echo "Goodbye, ${name}!"
    }
}
