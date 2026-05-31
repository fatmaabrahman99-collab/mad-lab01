package tz.ac.suza.hellosuza


fun variablesDemo() {
    val name = "Ali"
    var age = 21

    println("My name is $name and I am $age years old.")
}

/*
// Question 2: Area of Rectangle
// =========================
fun area(width: Double, height: Double): Double {
    return width * height
}

// =========================
// Question 3: Grade Calculator
// =========================
fun grade(score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "F"
    }
}

// =========================
// Question 4: FizzBuzz
// =========================
fun fizzBuzz() {
    for (i in 1..30) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}

// =========================
// Question 6: Classes
// =========================
class Course(
    val code: String,
    val title: String,
    val credits: Int
) {
    override fun toString(): String {
        return "[$code] $title ($credits)"
    }
}

/*
// =========================
// Main Function
// =========================
fun main() {

    // Question 1
    println("=== Question 1 ===")
    variablesDemo()

    // Question 2
    println("\n=== Question 2 ===")
    println("Area = ${area(3.0, 4.0)}")

    // Question 3
    println("\n=== Question 3 ===")
    println("Grade for 85 = ${grade(85)}")

    // Question 4
    println("\n=== Question 4 ===")
    fizzBuzz()

    // Question 5
    println("\n=== Question 5 ===")
    val nums = listOf(1, 2, 3, 4, 5, 6)

    println("Sum = ${nums.sum()}")
    println("Even Numbers = ${nums.filter { it % 2 == 0 }}")
    println("Doubled Numbers = ${nums.map { it * 2 }}")

    // Question 6
    println("\n=== Question 6 ===")
    val courses = listOf(
        Course("MAD101", "Mobile App Development", 3),
        Course("CSC201", "Data Structures", 4),
        Course("NET301", "Computer Networks", 3)
    )

    courses.forEach {
        println(it)
    }

    // Question 7
    println("\n=== Question 7 ===")
    print("Enter your name: ")

    val name: String? = readLine()

    println("Length = ${name?.length ?: 0}")

}
*/