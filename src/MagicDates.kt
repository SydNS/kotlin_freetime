import java.time.Year

class MagicDates {
//    4.  Magic DatesThe date June 10, 1960, is special because when it is written in the following format,
//    themonth times the day equals the year:6/10/60Design a program
//    that asks the user to enter a month (in numeric form),
//    a day, and a two-digit year. The program should then determine whether the month times the day equals theyear.
//    If so, it  should display a message saying the date is magic. Otherwise, it should dis-play a message


    fun magicIt(): String {
        print("Finding out if a date is a magic Enter the date  ")
        print("\nEnter the day : ")
        val dayOfWk = Integer.valueOf(readLine())
        print("Enter the month : ")
        val monthOfYear = Integer.valueOf(readLine())

        print("Enter the year : ")
        val year = Integer.valueOf(readLine())

        if (dayOfWk*monthOfYear==year){
            return "its a magic date"
        }else return "not a magic date"

    }


}

fun main() {
//    print(MagicDates().magicIt())
//    val loopin=Loopin()
//    loopin.squares()
//    val odds=Odds()
//    odds.odds()
//    val evens=Evens()
//    evens.evens()
//    val pyramid=Pyramid()
//    pyramid.pyramid()
//    val doubled = List(3) { it * 2 }  // or MutableList if you want to change its content later
//    println(doubled)
//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length>4 }
//    println(longerThan3)
    val numbers = listOf("one", "two", "three", "four")

    val plusList = numbers + "five"
    val minusList = numbers - listOf("three", "four")
    println(plusList)
    println(minusList)
}