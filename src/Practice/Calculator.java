package Practice;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double num1, num2;

    Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    double addition(){
        return  num1 + num2;
    }
    double substraction(){
        return num1 - num2;
    }
    double multiplication(){
        return num1 * num2;
    }
    double divition(){
        return num1 / num2;
    }
    double remainder(){
        return num1 % num2;
    }

}
