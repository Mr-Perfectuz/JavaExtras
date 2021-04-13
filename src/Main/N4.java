package Main;

public class N4 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2};
        int number ;
        System.out.println("Before invoking swap");
        System.out.println(" array is { "+ arrayInt[0]+" : "+ arrayInt[1]+ "}");

        System.out.println("After inwoking swap");
        number = arrayInt[0];
        arrayInt[0] = arrayInt[1];
        arrayInt[1] = number;
        System.out.println(" array is { "+ arrayInt[0]+" : "+ arrayInt[1]+ "}");



    }
}
