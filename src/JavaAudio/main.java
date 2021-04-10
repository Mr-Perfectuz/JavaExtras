package JavaAudio;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] number = {1, 2, 3};
        double [] arrayList = new double[10];
//        Arrays.stream(arrayList).average();
//
//        System.out.println(arrayList.toString());


        for (int i =0; i< arrayList.length; i++){
            arrayList[i] = i;
            System.out.println(i);
        }

        double[] doubleList = new double[3];
        doubleList[0] = 1.8;


    }
}
