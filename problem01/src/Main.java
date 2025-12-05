import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        printSumForLoop(arr);
        printSumWhileLoop(arr);
        printSumRecursion(arr);

    }

    //for loop function
    public static void printSumForLoop(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum using for loop: " + sum);
    }

    //while loop function
    public static void printSumWhileLoop(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("Sum using for loop: " + sum);
    }

    //recusion function
    public static void printSumRecursion(int[] arr) {
        System.out.println("Sum using recursion: " + Arrays.toString(arr));
    }

    //creat a recursion
    private static int sumArrayRecursive(int[] arr, int idx) {
        if (idx >= arr.length) return 0;
        return arr[idx] + sumArrayRecursive(arr, idx + 1);
    }
}

