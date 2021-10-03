/*
* Variables and Conditionals
* Functions and anonymous functions
* Null safety and exceptions
* Scope Functions, Collections
* */

/** Variables */
/*
// fun main() { Block of code }
fun main() {

    // Declaration = Assignment

    // keyword - variableName = value
    // var -> writable
    // val -> read only
    var number = 20 // Type inference - `Ctrl + Shift + P` to inspect inferred type
    number = 30

    val pie = 3.14

    */
/* Data Types
    * Int -> 12121
    * Double -> 2.232323
    * Float -> 2.2323f
    * String -> "Hello World"
    * Boolean -> True, False
    * Char -> 'A'
    * *//*


    // keyword variableName : DataType = value
    */
/* variables cannot contain
    * 1name -> character in first position
    * variable name -> space in name
    * nam!$% -> symbols
    * Double -> DataType, operators, keywords
    * *//*



    val name: String = "Fouad"
    var age: Int = 15
    var weight: Float = 70.23f
    var height: Int = 176

    // assign value from variable
    var nickname = name


    // show the output to user
    println("My nickname is: " + nickname) // Concatenation strings
    println("My nickname is: $nickname") // string template/interpolation


    // variables calculations
    var triangleA = 50
    var triangleB = 20
    var triangleC = 50

    */
/*
    * +
    * -
    * *
    * /
    * *//*


    val p = triangleA + triangleB + triangleC

    println("perimeter of triangle is: $p")
}
*/


/** Conditionals */
// Single Line - > `Ctrl + /`
// Multiple lines -> `Ctrl + Shift + /`
/*

fun main() {

    */
/* Comparison operators
    * == -> equal to
    * != -> not equal to
    * < -> less than
    * > -> greater than
    * >= -> greater than or equal
    * <= -> less than or equal
    * *//*


    // if condition

    // Single Condition
    // if(comparison) { True } else { False }

    if(10 > 20) {
        println("Yes")
    } else {
        println("No")
    }

    // Condition with variables

    var num1 = 10
    var num2 = 20

    if (num1 > num2) {
        println("Yes") // True
    } else {
        println("No") // False
    }

    // Condition with variable and static value

    if(num1 > 20) {
        println("Yes") // True
    } else {
        println("No") // False
    }

    // Multiple conditions
    // if(comparison) { True } else if(comparison) { True } else { False }

    var num3 = 50
    // 10 > 20
    if(num1 > num2) {
        println("Yes") // True

        // 20 > 50
    } else if (num2 > num3) {
        println("Yes") // True
    } else {
        println("No") // False
    }

    // if expression
    // var variableName = if(comparison) { return value } else { return value }

    var condition = if (num1 > num2) {
        "Number one is greater than number two"
    } else {
        "Number two is greater than number one" // lambda
    }

    println(condition)

    // When statement
    // when(value) { caseOne -> {} caseTwo -> {} else -> {} }

    var gender = "Male"

    when(gender) {
        "Male" -> { println("My Gender is: $gender") }
        "Female" -> { println("My Gender is: $gender") }
        else -> { println("Unknown gender") }
    }

    // when statement with range

    var age = 15

    when(age) {
        in 0..14 -> { println("Children") }
        in 14..24 -> { println("Youth") }
        in 25..64 -> { println("Adult") }
        else -> println("unknown age")
    }


    // when expression
    // var variableName = when(value) { caseOne -> { return value } caseTwo -> {} else -> {} }

    var whenCondition =  when(age) {
        in 0..14 -> { "Children" }
        in 14..24 -> { "Youth" }
        in 25..64 -> { "Adult" }
        else -> "unknown age"
    }

    println(whenCondition)

    // Object operations

    var username = "mohamed"
    username.uppercase()

    var number1 = 10

    println(number1.plus(12))

}*/

/** Function */
/*

// fun functionName() { Block of code }

fun output() {
    println("Hello World")
}

fun main() {

    // calling output function
    // functionName()
    output()

    sum(10,20)

    var username = myName()
    username.uppercase()
    println(username)

    println(multi(2,2))
}

// Function with parameters
// fun functionName(paramOneName: DataType, paramTwo: DataType) { }

fun sum(num1: Int, num2: Int) {
    val sum = num1 + num2
    println(sum)
}

// Function with return type
// fun functionName() : DataType { return value }

fun myName(): String {
    var name = "mohamed"
    return name
}

// Single-Expression function
// fun functionName(): DataType = value

fun multi(num1: Int, num2: Int): Int = num1*num2
*/

/** Anonymous Function */

/*
  var triangleP  = { a: Int, b: Int, c: Int ->
     a + b + c
  }
// fun equation(): Int
fun perimeterType(type: String , a: Int, b: Int, c: Int, equation: (Int,Int,Int) -> Int) : Int {
    when(type){
        "Triangle" -> return equation(a,b,c)
        else -> return 0
    }
}

fun main() {
    triangleP(10,20,12)
    perimeterType("Triangle", 10,20,20 , triangleP)

    perimeterType("Triangle", 10,20,20) { a, b, c ->
        a + b + c
    }
}
*/

/** Null Safety and Exceptions */

/*
fun main() {

    // Nullability
    var number: Int? = 23

    // safe call operator ?
    number?.plus(100)

    // non-null asserted call !!
    number!!.plus(100)

    number = null
    // Check nullability with if condition
    if (number != null) {
        println("Not null")
    } else
    {
        println("Null")
    }

    // check nullability with let scope function

    number?.let {
        println("Not Null")
    }


    // check nullability with elvis operator ?:
    val username: String? = null
    val nickname: String = username ?: "nickname"
    println(nickname)

    // throw exception
    // throw ExceptionType
  //  username ?: throw Exception("Unknown")

    // Handling Exception
    // try { Handling code } catch (exceptionType) { catching block }

    try {
        var age = readLine()!!.toInt()
    } catch (e: Exception) {
        println("Unknown number: ${e.message}")
    }

}*/

/** Scope Functions */

/*
fun main(){

    //Let
    // Object reference -> it
    // result value -> lambda result

    var num1: Int? = null
    num1?.let {
        println(it)
    }
    num1 = 50
    var number = num1?.let {
        println(it)
        it+it
    }

    println(number)

    // apply
    // object reference -> this
    // result value -> context object

    var name = "fouad"

    // Use it with classes
   var nickname = name.apply {
        uppercase()
    }
    println(nickname)

    // with
    // object reference -> this
    // result value -> lambda result

    var nameUppercase = with(name) {
        uppercase()
    }

    println(nameUppercase)


    // run
    // object reference -> this
    // result value -> lambda

    var num2: Int? = null

    num2?.run {
        println(plus(50))
    }

    num2 = 10
    var num3 = num2.run {
        plus(50)
    }
    println(num3)


    // also
    // object reference -> it
    // result value -> context object

    var username = "mohamedfouad"
    var password: String?

    username.also {
        password = "$it:123456"
    }

    println(password)
}*/
/** Loop */
/*

fun main() {

    // For
    var books = mutableListOf<String>("AI" , "Computer Vision", "Network","OS")

    for (book in books) {
        println(book)
    }

            for (index in 0..books.size-1) {
                println(books.get(index))
            }

            for (index in 0 until books.size) {
                println(books.get(index))
    }

    for (i in 0..10 step 2) {
        println(i)
    }


    // while

    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
}

*/
