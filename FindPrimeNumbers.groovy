/**
 * Finds all prime numbers up to a given maximum value using Sieve of Eratosthenes algorithm.

 * Algorithm (Sieve of Eratosthenes):
 * 1. Assume all numbers from 2 to maxValue are prime.
 * 2. Starting from the first prime (2), mark all of its multiples as non-prime.
 * 3. Move to the next unmarked number and repeat the process.
 * 4. Stop when the square of the current number exceeds maxValue.

 * This approach efficiently finds all prime numbers in O(n log log n) time.
 **/

def findPrimes(limit) {
    def primes = new boolean[limit + 1]
    Arrays.fill(primes, true)
    primes[0] = primes[1] = false

    for (int p = 2; p * p <= limit; p++) {
        if (primes[p]) {
            for (int i = p * p; i <= limit; i += p) {
                primes[i] = false
            }
        }
    }
    primes.indices.findAll { primes[it] }
}

println findPrimes(100)
