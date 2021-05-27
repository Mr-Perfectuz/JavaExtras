package Practice;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = null;

        System.out.println("Enter: number1 OperationSymbol(+, -, *, /, %) number2:");
        calculator.num1 = scanner.nextDouble();
        char mathOperation = scanner.next().charAt(0);
        calculator.num2 = scanner.nextDouble();

        double result = 0.0;

        switch (mathOperation){
            case '+':
                result = calculator.addition();
                System.out.println(result);

                break;
            case '-':
                result= calculator.divition();
                System.out.println(result);
                break;
            case '*':
                result= calculator.multiplication();
                System.out.println(result);
                break;
            case '/':
                result=calculator.divition();
                System.out.println(result);
                break;
            case '%':
                result=calculator.remainder();
                System.out.println(result);
                break;
            default:
                System.out.println("Wrong Input !");
                break;

        }
    }
}
