object helloWorld {
    @main def run(): Unit =
        val ages = Seq(42, 75, 29, 64)
        println(s"The oldest person is ${ages.max}")

}
