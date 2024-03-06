package com.example.kotlinfundamentals
class MyClass {

   val publicVar:String = "This is a public variable"
  val  privateVar:String = "This is a private variable"

    fun publicFunction() {
        println("Public Function")
    }

    private fun privateFunction() {
        println("Private Function")
    }
}

fun main() {
    val myObject = MyClass()
    println(myObject.publicVar) // Accessing publicVar is allowed
    println(myObject.privateVar) // Error: privateVar is private
    myObject.publicFunction() // Calling publicFunction is allowed
    myObject.privateFunction() // Error: privateFunction is private
}
