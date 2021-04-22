package Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Practice6 {
    public static void main(String[] args) {
        Random random = new Random();
        String letters = String.valueOf(random.nextInt(26));
        letters = letters.toLowerCase();
        int[] frequency = new int[26];
        for (char ch : letters.toCharArray()) {
            int index = ch - 'a';
            frequency[index]++;
        }
        System.out.println(Arrays.toString(frequency));


        int[] result = IntStream.of(frequency).filter(i -> i > 0).toArray();
        System.out.println(Arrays.toString(result));
    }
}