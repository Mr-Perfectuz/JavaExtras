package Main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class N2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double arrayDouble [];
         arrayDouble = new double[5];
         System.out.println(" Enter 5 values: ");

         for (int i =0; i< arrayDouble.length; i++){
             arrayDouble[i] = scanner.nextDouble();

         }


         System.out.println("Entered values are: ");
         for (int i =0; i< arrayDouble.length; i++)
             System.out.println(" The "+ (i+1)+ " number is :"+ arrayDouble[i]);

    }
}
