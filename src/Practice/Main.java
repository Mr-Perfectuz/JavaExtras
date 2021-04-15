package Practice;


public class Main {
    public static  void main(String[] args){
        /** Main method */
            // Declare and create an array
            char[] chars = createArray();

            // Display the array
            System.out.println("The lowercase letters are:");
            displayArray(chars);

            // Count the occurrences of each letter
            int[] counts = countLetters(chars);

            // Display counts
            System.out.println();
            System.out.println("The occurrences of each letter are:");
            displayCounts(counts);


    }
}
