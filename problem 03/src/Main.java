public class Main {

    public static void main(String[] args) {
        long[] fibonacciNumbers = computeFibonacci();

        // print fibonnacci numbers
        for (long number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
    }

    //compute function
    public static long[] computeFibonacci() {
        long[] fib = new long[100];

        // first two Fibonacci numbers
        fib[0] = 0;
        fib[1] = 1;

        // find the rest
        for (int i = 2; i < 100; i++) {

            // each number is sum of previous two
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
