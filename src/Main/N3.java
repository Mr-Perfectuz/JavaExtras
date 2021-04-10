package Main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, sum =0;
        double  [] arrayDouble;

        System.out.println(" Enter the number of items: 10");
        size= scanner.nextInt();
        arrayDouble =new double[size];

        for (int i =0; i< arrayDouble.length; i++){
            arrayDouble[i] = scanner.nextDouble();
            sum +=  arrayDouble[i];
        }

        double average = 0;
        int aboveAverage =0;
        for (int i=0; i<arrayDouble.length; i++){
            average = (arrayDouble[0]+ arrayDouble[1] + arrayDouble[2]+ arrayDouble[3]+ arrayDouble[4]+ arrayDouble[5]+ arrayDouble[6]+ arrayDouble[7]+ arrayDouble[8]+
                    arrayDouble[9]) / arrayDouble.length;

            if (arrayDouble[i] > average){
                aboveAverage++;
            }
        }

        System.out.println(" Average is "+ average);
        System.out.println(" Number of elements abouve averga is "+ aboveAverage);

    }
}
