package Enumeration;

import java.util.Scanner;

public class Enum {
    public static  void main(String[] args){
//        String str = new String("Hello");
//        String str2 = new String("Hello");
//        System.out.println(str == str2);
//
//        String str3 = "hello";
//        String str4 = "Hello";
//        System.out.println(str3 == str4);
//
//
//        String str5 = new String();
//        str5 = "hello";
//        System.out.println(str3 == str5);
//
//
//        str4 = str3;
//        System.out.println(str4 == str5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String message = scanner.nextLine();

        int numberOfUpperCase =0;
        for (int i =0; i<message.length(); i++){
            char ch = message.charAt(i);
            if (ch > 'A' && ch< 'Z')
                numberOfUpperCase++;
        }

        System.out.println("Numer of Upper latters is: " + numberOfUpperCase);



    }
}
