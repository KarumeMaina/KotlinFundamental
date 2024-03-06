package com.example.kotlinfundamentals

fun main() {
    /*
    * Operators - Operators in Kotlin are special symbols or keywords used to perform operations on variables and values.
    * Kotlin supports a wide range of operators for various purposes, including arithmetic, assignment, comparison, logical,
    * and bitwise operations.
    *
    *
    1: Arithmetic Operators - Used to perform Mathematical operations. They include
                + (Addition): Adds two numbers together.
                - (Subtraction): Subtracts the second number from the first.
                * (Multiplication): Multiplies two numbers.
                / (Division): Divides the first number by the second.
                % (Modulus): Returns the remainder of the division.

    2: Assignment Operator - Used to assign values to variables
                = (Assignment): Assigns a value to a variable.
                += (Addition Assignment): Adds the right-hand value to the left-hand variable.
                -= (Subtraction Assignment): Subtracts the right-hand value from the left-hand variable.
                *= (Multiplication Assignment): Multiplies the left-hand variable by the right-hand value.
                /= (Division Assignment): Divides the left-hand variable by the right-hand value.


    3: Comparison Operators -  Used to compare assigned values of variables
                == (Equality): Checks if two values are equal.
                != (Inequality): Checks if two values are not equal.
                < (Less Than): Checks if the left value is less than the right value.
                <= (Less Than or Equal): Checks if the left value is less than or equal to the right value.
                > (Greater Than): Checks if the left value is greater than the right value.
                >= (Greater Than or Equal): Checks if the left value is greater than or equal to the right value.

    4: Logical Operators:

                && (Logical AND): Returns true if both conditions are true.
                || (Logical OR): Returns true if at least one condition is true.
                ! (Logical NOT): Negates a condition (changes true to false and vice versa).
                */

    //1:Arithmetic Operators
    val a = 10
    val b = 3
    val sum = a + b // 13
    val difference = a - b // 7
    val product = a * b // 30
    val quotient = a / b // 3
    val remainder = a % b // 1

    //2:Assignment Operators
    var x = 5
    x += 3 // x is now 8
    x -= 2 // x is now 6
    x *= 4 // x is now 24
    x /= 3 // x is now 8


    //3:Comparison Operators
    val s = 5
    val t = 7
    val isEqual = s == t // false
    val isNotEqual = s != t // true
    val isLessThan = s < t // true
    val isGreaterThanEqual = s >= t // false


    //4:Logical Operators
    val isTrue = true
    val isFalse = false
    val logicalAnd = isTrue && isFalse // false
    val logicalOr = isTrue || isFalse // true
    val logicalNot = !isTrue // false




}