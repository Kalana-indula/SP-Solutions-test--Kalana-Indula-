public class Main {

    public static void main(String[] args) {

//        character array
        char[] charArray = {'a', 'b', 'c'};

//        numbers array
        int[] intArray = {1, 2, 3};

        combineArrays(charArray, intArray);
    }

    public static void combineArrays(char[] characters, int[] numbers) {

        // Combined array size = sum of both array lengths
        // We use Object[] because it can store both chars and ints
        Object[] combined = new Object[characters.length + numbers.length];

        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            combined[index] = characters[i];
            index++;

            combined[index] = numbers[i];
            index++;
        }

        // print result
        System.out.print("[");
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i]);
            if (i < combined.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
