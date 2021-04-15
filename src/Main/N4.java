package Main;

public class N4 {
    public static void main(String[] args) {
//        int[] arrayInt = {1, 2};
//        int number ;
//        System.out.println("Before invoking swap");
//        System.out.println(" array is { "+ arrayInt[0]+" : "+ arrayInt[1]+ "}");
//
//        System.out.println("After inwoking swap");
//        number = arrayInt[0];
//        arrayInt[0] = arrayInt[1];
//        arrayInt[1] = number;
//        System.out.println(" array is { "+ arrayInt[0]+" : "+ arrayInt[1]+ "}");

        int temp = 0;
        double[] arrayDouble = {1, 9, 4.5, 6.6, 5.7, -4.5};

        for (int i =0; i< arrayDouble.length; i++){
            for (int j = i+1; j<arrayDouble.length; j++){
                if (arrayDouble[i]> arrayDouble[j]){

                    temp = (int) arrayDouble[i];
                    arrayDouble[i] = arrayDouble[j];
                    arrayDouble[j] = temp;
                }
            }
            }
        }
    }

