import kotlin.math.sqrt

class Loopin {
    fun odds(){
        print("enter the last number in the list : ")
        val x=Integer.valueOf(readLine())
        for(num in 1..x){
            print("$num : ${sqrt(num.toDouble())}")
        }

    }
}