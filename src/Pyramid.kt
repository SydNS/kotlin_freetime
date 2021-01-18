class Pyramid {
    fun pyramid() {
        print("enter the last number in the list : ")
        val x = Integer.valueOf(readLine())
        for (num in 1..x) {

            for (y in 1..(num+1)) {
                print("X")
            }
            println("")
        }
    }

}
