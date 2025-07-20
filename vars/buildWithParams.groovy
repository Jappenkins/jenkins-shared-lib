def call(String name = 'world') {
    def greeter = new com.saloom.Greeter(this)
    greeter.sayHello(name)
}
