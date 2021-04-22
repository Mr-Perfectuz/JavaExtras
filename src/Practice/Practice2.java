package Practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 values: ");

        double[] arrayList = new double [5];
        for (int i=0; i<arrayList.length; i++){
            arrayList[i] = scanner.nextDouble();
        }

        System.out.println("Entered values are: ");
        for (int i=0; i<arrayList.length; i++){
            System.out.println("The "+ i + " numer is: "+ arrayList[i]);
        }
    }
}
