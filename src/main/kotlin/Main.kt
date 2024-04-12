
fun main() {
    printOddNumbers()
   // oddNumbers()
    println(students(arrayOf("meg","Jane","Audrey","Britney")))
    numbers()
    serveDrinksByAge(15)

}
fun printOddNumbers() {
        for (i in 1..100) {
            if (i % 2 != 0) {
                println(i)
            }
        }
    }
fun students(name:Array<String>) : Int {
    return name.count() {it.length > 5}
}
fun serveDrinksByAge(guestAge:Int){
    if(guestAge <= 6){
        println("serve a glass of milk")
    }
    else if(guestAge <= 15 && guestAge > 6){
        println("serve a bottle of Fanta Orange")
    }
    else{
        println("serve a bottle of coca cola")
    }
}
fun numbers(){
    for(num in 1..100){
        if (num % 3 == 0){
            println("fizz")
        }
        else if(num % 5 == 0){
            println("Buzz")
        }
        else{(num % 3 == 0 && num % 5 == 0)
            println("FizzBuzz")
        }
    }}

