public class PrimeNumberMethod {
    public static void main(String[] args) {
        /*Invoke the printPrimeNumbers method*/
        /*Display results*/
        System.out.println("The first 100 Prime Numbers are \n");
        printPrimeNumbers(100);
    }

    /*Create a new method printPrimeNumbers*/
    public static void printPrimeNumbers(long numberOfPrimes) {
        final long NUMBER_OF_PRIMES_PER_LINE = 10; /*Display 10 numbers per line*/
        long count = 0; /*Initialize count the number of prime numbers*/
        long number = 2; /*Initialize a number to be tested for primes*/

        /*Repeatedly find the prime numbers*/
        while (count < numberOfPrimes) {
            /*Print the prime number and increase the count*/
            if (isPrime(number)) {  /*Invoke the isPrime method*/
                count++; /*Increase the count*/

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    /*Print the number and advance to the new line*/
                    System.out.printf("%-5d\n", number);
            }
                else System.out.printf("%-5d", number);
            }
            /*Check wether the next number is prime*/
            number++;
        }
    }

    /*Create a new isPrime method*/
    /*Check wether the number is prime*/
    public static boolean isPrime(long number) {
        for (long divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { /*If true, the number is not prime*/
                return false; /*Number is not a prime*/
            }
        }
        return true; /*Number is prime*/
    }
}
