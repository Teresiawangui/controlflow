
fun main() {
    printOddNumbers()
   // oddNumbers()
    println(students(arrayOf("meg","Jane","Audrey","Britney")))
    numbers()
    serveDrinksByAge(15)



val friends = listOf("Fridah","terry","mary","tom")
println(friends.contains("mary"))


val nums = listOf(-1,78,-45,87,32,0,7,-97)
/*Apredicate is like a seive == the condition*/
val negativeNums = nums.filter { num->num<0 }
println(negativeNums)

val names = listOf("ben","ken","ten","pen","pen","pen","ken")
val realNames = names.filter{name-> name!="ten"&& name != "pen"}
println(realNames)

val contact1=Contact("Brian","0765654356","brian@gmail.com","male")
val contact2 = Contact("Penina","0789898989","penina@gmail.com","female")
val contact3 =Contact("Auma","012345345678","nyambufrtd","female")
val contact4 =Contact("Tito","012345345678","nyambufrtd","male")

val myContacts = listOf(contact1,contact2,contact3,contact4)
val femaleContacts = myContacts.filter{contact->contact.gender=="female"}
val shortContacts = myContacts.filter{contact->contact.name.length==4}
println(femaleContacts)
    println(femaleContacts)



    val words = listOf("apple", "banana", "orange", "pear", "kiwi", "grape")

    val vowelList = words.filter { it.startsWith("a") || it.startsWith("e")
            || it.startsWith("i") || it.startsWith("o") || it.startsWith("u") }
    val consonantList = words.filter { !it.startsWith("a") && !it.startsWith("e")
            && !it.startsWith("i") && !it.startsWith("o") && !it.startsWith("u") }

    println("Words starting with a vowel: $vowelList")
    println("Words starting with a consonant: $consonantList")
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

data class Contact(
    var name:String,
    var phoneNumber:String,
    var email:String,
    var gender:String)









