package Practice;
public class Main {
    public static  void main(String[] args){

//        int sum =0;
//        char grade = 'B';
//        switch (grade){
//            case 'A': sum +=100;
//            case 'B': sum +=50;
//            case 'C': sum +=30;
//            case 'D': sum +=10;
//        }
//
//        System.out.println(sum);

//        int intVar = 10;
//        char charVar = 'A';
//        double doubleVar = 5.7;
//        String strVar = "A";

//        for (int i =1; i<=9; i++){
//            for (int j=2; j<=9; j++ ){
//                System.out.printf("%-2d * %-2d = %-3d  ", j, i, (j*i));
//            }
//            System.out.println();
//        }

//        for (int i =2; i<=9; i++){
//            for (int j=1; j<=9; j++ ){
//                System.out.printf("%-2d * %-2d = %-3d  ", i, j, (j*i));
//
//            }
//            System.out.println();
//        }


        int max = 0;
        int[] arr = {1, 5, 3, 9, 2};

        max = arr[0];
        for (int i =0; i < arr.length; i ++){
            if (arr[i] > max)
                max = arr[i];
        }


        System.out.println("max: "+ max);

    }
}
