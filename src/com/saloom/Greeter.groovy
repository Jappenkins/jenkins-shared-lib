package com.saloom

class Greeter implements Serializable {
    def steps

    Greeter(steps) {
        this.steps = steps
    }

    def sayHello(String name) {
        steps.echo "Hello, ${name}!"
    }
}
