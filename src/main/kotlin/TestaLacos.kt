fun testLoop() {
    for (i in 1..5) println(i)

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 1 until 5) {
        println(i)
    }

    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}
