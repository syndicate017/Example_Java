public class PrimeNumber {
    public static void main(String[] args) {
        /*Initialize variable*/
        final long NUMBER_OF_PRIMES = 100; /*Number of primes to display*/
        final long NUMBER_OF_PRIMES_PER_LINE = 10; /*Display 10 per line*/
        long count = 0; /*Count the number of prime numbers*/
        long number = 2; /*A number to be tested for primeness*/

        /*initialize header massage*/
        System.out.println("The first 100 Prime Numbers are: \n");

        /*Create the rules*/
        /*Repeatedly find prime numbers*/
        while (count < NUMBER_OF_PRIMES) {
            /*Assume the number is prime*/
            boolean isPrime = true; /*Is the current number is prime?*/

            /*Test wether the number is prime*/
            for (long divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { /*If true, number is not prime*/
                    isPrime = false; /*Set isPrime to false*/
                    break; /*Exit the for loop*/
                }
            }

            /*Display the prime numbers and increase the count*/
            if (isPrime) {
                count++; /*Increase the count*/

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    /*Display the number and advance to the new line*/
                    System.out.println(number);
                }
                else System.out.print(number + "  ");
            }

            /*Check if the next number is prime*/
            number++;
        }
    }
}
