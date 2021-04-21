package Main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class New {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int [] arrayInt;
        arrayInt = new int[10];
//
//        for (int i =0; i < arrayInt.length; i++){
//            System.out.println(" Enter "+(i + 1)+ "numbers");
//            arrayInt[i] = scanner.nextInt();
//        }
//

        Random random = new Random();
        int sum = 0;
        int largest;

        for (int i =0; i < arrayInt.length; i++){
            arrayInt[i] = (int) (random()*10);
            sum = sum + arrayInt[i];


//            if (arrayInt[1]> arrayInt[i]){
//                System.out.println(" The largest is "+ arrayInt[1]);
//            }
//            else if (arrayInt[0] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[0]);
//            }
//            else if (arrayInt[2] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[2]);
//            }
//            else if (arrayInt[3] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[3]);
//            }
//            else if (arrayInt[4] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[4]);
//            }
//            else if (arrayInt[5] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[5]);
//            }
//            else if (arrayInt[6] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[6]);
//            }
//            else if (arrayInt[7] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[7]);
//            }
//            else if (arrayInt[8] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[8]);
//            }
//            else if (arrayInt[9] > arrayInt[i]){
//                System.out.println(" The largest  is "+ arrayInt[9]);
//            }

//        for (int j =0; j < arrayInt.length; j++){
//            if (arrayInt[j]> arrayInt[i]){
//                j++;
//                System.out.println(" The largest is "+ arrayInt[j]);
//            }
//
//        }

        }

        int max =0;
        for (int i=0; i <arrayInt.length; i++){
            if (max < arrayInt[i])
                max = arrayInt[i];

        }
        int min =0;
        for (int i=0; i <arrayInt.length; i++){
            if (max < arrayInt[i])
                max = arrayInt[i];

        }
        System.out.println("The minimum number is "+ min);
        System.out.println("The maximum number is "+max);
        System.out.println("The sum is "+sum);

        Arrays.sort(arrayInt);
        for (int i=0; i<arrayInt.length; i++){

        }
//

        for (int i =0; i < arrayInt.length; i++)
            System.out.print(arrayInt[i]);

    }
}
