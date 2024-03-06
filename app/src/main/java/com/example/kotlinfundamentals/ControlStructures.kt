package com.example.kotlinfundamentals

fun main() {
    /*Control structures are fundamental programming constructs in Kotlin that allow you to
    control the flow of your code. They enable you to make decisions, repeat actions, and create
    more complex logic in your programs.

    They are categorized into two:
    1: Control statements - Conditional statements allow you to execute different blocks of
            code based on specific conditions.

    2: Loops - Looping structures allow you to repeat a block of code multiple times.
    */

    /*Conditional Statements:
    They Include
            1:->if
            2:->if..else
            3:->when


    1-> if.....Syntax
                if(condition){
                        Block to be executed if condition is true
                }

    2-> if...else.....Syntax
                if(condition){
                       Block to be executed if condition is true
                }else{
                Block to be executed if condition is false
                }

    3->when.....Syntax
                when (condition) {
                    value1 -> statement1
                    value2 -> statement2
                    value3 -> statement3
                    else -> defaultStatement
                    }

            -> condition: The expression whose value you want to check.
            -> value1, value2, value3, etc.: Values you want to compare the condition to.
            -> statement1, statement2, statement3, etc.: Code blocks to execute if the condition
                    matches the corresponding value.
            -> else: An optional block that is executed if none of the values match the condition.
                It acts like the default case in a switch statement.

      * */

    //if
    val age = 20
    if (age >= 18) {
        println("You are an adult.")
    }


    //if...else
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are not an adult.")
    }

    //when
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Other day")
    }


    /*
    Loops

     1:for loop - The for loop is used to iterate over a range of values or elements in a collection.

            Syntax:
            for (variable in range or collection) {
                // Code to be executed
        }

    2:  While Loop: - The while loop is used to repeatedly execute a block of code as long as a given
    condition is true.

            Syntax:
                while (condition) {
                    // Code to be executed
            }

    3: Do-While Loop: - The do-while loop is similar to the while loop but guarantees that the code
    block is executed
    at least once before checking the condition.

            Syntax:
            do {
                // Code to be executed
            } while (condition)
    */

    //for loop
    for (i in 1..10){
        println("The current value of i is: $i")
    }

    /*In the example above, the loop iterates over the range from 1 to 10 and the value for "i" is
    printed for each iteration*/

    //while
    var j = 0
    while (j<=5){
        println("The current value of i is: $j")
        j++
    }
    /*In the example above, the condition j < 5 is checked before entering the loop.
    As long as the condition is true, the code block is executed. */

    //do..while loop

    var k = 0
    do {
        println("The current value of i is: $k")
        k++
    }while (k<5)
/*In this example, the code block inside the do block is executed, and the value of i is printed.
The condition i < 5 is checked after the first execution. If the condition is true, the loop continues.
This loop will run five times, printing values from 0 to 4.*/
}