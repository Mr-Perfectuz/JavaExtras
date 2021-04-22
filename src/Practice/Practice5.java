package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args){
        double[] doubleArray = new double[] { 1, 9, 4.5, 6.6, 5.7,-4.5};
        System.out.println("Before selection sort");
        for (double d: doubleArray){
            System.out.print(d + " ");
        }

        Arrays.sort(doubleArray);
        System.out.println("\nAfter selection sort");
        for (double d: doubleArray){
            System.out.print(d+" ");
        }

    }
}
