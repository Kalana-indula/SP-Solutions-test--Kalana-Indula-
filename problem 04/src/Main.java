public class Main {

    public static void main(String[] args) {

        //number array
        int[] numbers = {60, 1, 3, 5};

        //largest number
        String largest = makeLargestNumber(numbers);

        //print the number
        System.out.println("Largest formed number: " + largest);
    }

    //function to calculate
    public static String makeLargestNumber(int[] numbers) {

        //  convert int array to a String array
        String[] strArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        //sort to find out which combination is bigger
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {

                String first = strArray[j] + strArray[j + 1];
                String second = strArray[j + 1] + strArray[j];

                // if second is bigger, swap
                if (first.compareTo(second) < 0) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }

        //join all strings together
        String result = "";
        for (int i = 0; i < strArray.length; i++) {
            result = result + strArray[i];
        }

        //if result starts with '0', all numbers were 0
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result;
    }
}
