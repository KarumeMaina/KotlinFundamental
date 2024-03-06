package com.example.kotlinfundamentals

fun main() {
/*
* In Kotlin, data types are used to define the type of values that a variable can hold.
* Kotlin has a rich set of built-in data types to represent various kinds of data.
* Here are some of the commonly used data types in Kotlin:

1: Integers:
    ->Byte: 8-bit signed integer.
    ->Short: 16-bit signed integer.
    ->Int: 32-bit signed integer (default for whole numbers).
    ->Long: 64-bit signed integer.

2:Floating-Point Numbers:
    ->Float: 32-bit floating-point number.
    ->Double: 64-bit double-precision floating-point number (default for decimal numbers).

3.Characters:
    ->Char: Represents a single 16-bit Unicode character.

4.Booleans:
    ->Boolean: Represents a true or false value.

5.Strings:
    ->String: Represents a sequence of characters.

6. Arrays:
*      ->Array: Represents a fixed-size collection of elements of the same type.
        ->There are also specialized types like IntArray, DoubleArray, etc.
    * */

    //1:Integers
    val intNumber: Int = 42
    val longNumber: Long = 1234567890123456789L
    val shortNumber: Short = 32767
    val byteNumber: Byte = 125

    //2: Floating-Point Numbers
    val floatNumber: Float = 3.14f
    val doubleNumber: Double = 3.14159265359

    //3: Characters
    val letter: Char = 'A'

    //4: Booleans
    val isTrue: Boolean = true
    val isFalse: Boolean = false

    //Strings
    val greeting: String = "Hello, Kotlin!"

    //Array
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val names: Array<String> = arrayOf("Alice", "Bob", "Charlie")

//Class Quiz

    /*
    * Question 1: Declare a variable to store an integer and assign it the value 42.
    * Question 2: Define a variable to store a list of integers and initialize it with the numbers 1 to 5.
    * Question 3: Declare a variable to store a double and assign it the value 3.14.
    * Question 4: Create a variable that concatenates two strings together.
    * Question 5: Write a variable that calculates the area of a circle given its radius (a double).
   */
}