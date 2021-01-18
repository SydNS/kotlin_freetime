class Evens {
        fun evens(){
            print("enter the last number in the list : ")
            val x=Integer.valueOf(readLine())
            for(num in 0..x) if (num%2==0) print("$num \n")

        }

}