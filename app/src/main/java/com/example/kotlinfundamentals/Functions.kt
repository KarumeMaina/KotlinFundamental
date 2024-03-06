package com.example.kotlinfundamentals
/**
 * Function - is a sequence of program instructions that perform a specific task.These functions are reusable
 * ********How do we declare/ Create functions*************
 * For us to create a function we use the key word fun to declare it.
 * it looks as shown below:
 *
 *      fun  functionName(parameter1, parameter3,....ParameterN){
 *                  //Body
 *              }
 *
 *              fun - Key word used to declre a function
 *
 *              functionName - The function name is an identifier that uniquely identifies the function.
 *
 *              parameters(inputs) - Parameters are placeholders for values that the function expects to receive.
 *                                   They are enclosed in parentheses and separated by commas.
 *                                   Parameters are optional, and a function can have zero or more of them.
 *
 *              Body - The function body is enclosed in curly braces {}. It contains the code that defines what
 *                      the function does when it's called. The function body can include declarations,
 *                      statements, expressions, and control flow.
 *
 *              return - The return statement specifies the value that the function should return when it's called.
 *                      A function can return a single value. If a function doesn't include a return statement, it
 *                      implicitly returns undefined.
 */

class Navigate(){
    //class scope

//fun test(){
//      Var variable
// }

}


fun main() {
    //Body
    val message = greet("Kong")
    println(message)

    //calling on function adds
    val result = adds(3,456)
    println("The sum is : $result")

    //calling function isEven
    val even = isEven(7)
    println("Is the number even ? $even")
}

fun  greet(name:String):String{
    return "Hello, $name"

    var lName = "Doe"
}

//creating a function that will add numbers
fun adds(a:Int, b:Int):Int{
    return a+b
}

fun isEven(num:Int):Boolean{
    return num % 2 ==0
}

fun addNum(){
    minusNum()
}

fun minusNum(){
    addNum()
}