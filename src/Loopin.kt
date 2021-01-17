import kotlin.math.sqrt

class Loopin {
    fun squares(){
        print("enter the last number in the list : ")
        val x=Integer.valueOf(readLine())
        for(num in 1..x){
            print("$num : ${num*num}\n")
        }

    }
}