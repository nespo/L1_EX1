fun main() {
    // --- Part 1: Find and print the first 50 prime numbers ---

    // Use a mutable list to store the primes as we find them.
    val primes = mutableListOf<Int>()
    var num = 2 // Start checking from the first prime number

    // Helper function to check if a number is prime
    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        // We only need to check divisibility up to the square root of n
        var i = 2
        while (i * i <= n) {
            if (n % i == 0) return false
            i++
        }
        return true
    }

    // Loop until we have found 50 prime numbers
    while (primes.size < 50) {
        if (isPrime(num)) {
            primes.add(num)
        }
        num++
    }

    // Print the list of primes
    println("--- First 50 Prime Numbers ---")
    println(primes)
    println("Total primes found: ${primes.size}")


    // --- Part 2: Add even numbers and print the combined list ---

    // Create a list of the first 50 even numbers (2, 4, 6... 100)
    // We can do this easily with a map operation.
    val evens = (1..50).map { it * 2 }

    // Add the list of even numbers to our existing prime list
    primes.addAll(evens)

    // Print the final combined list
    println("\n--- Combined List (Primes + Evens) ---")
    println(primes)
    println("Total numbers in combined list: ${primes.size}")
}
