package com.saloom

class Greeter implements Serializable {
    def steps

    Greeter(steps) {
        this.steps = steps
    }

    def sayHello(String name) {
        steps.echo "Hello, ${name}!"
    }

    def sayImfine(String name){
        steps.echo "im fine ${name}"
    }

    def sayGoodbye(String name){
        steps.echo "good bye ${name}"
    }
}
