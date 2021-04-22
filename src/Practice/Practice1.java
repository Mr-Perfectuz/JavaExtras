package Practice;

public class Practice1 {
    public static void main(String[] args){

        double[] arrayList = new double[5];

        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }

        double max = arrayList[0];
        int indexOfmax = 0;

        for (int i = 0; i < arrayList.length; i++){
            if (arrayList[i] > max)
                max = arrayList[i];
                indexOfmax = i;
        }

        System.out.println("\nlargest element is "+ max);
        System.out.println("\nIndex of the largest element is "+ indexOfmax);
    }
}
