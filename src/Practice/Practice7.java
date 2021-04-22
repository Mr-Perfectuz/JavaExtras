package Practice;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args){

                int row, col, i, j;
                float arr[][] = new float[3][4];
                Scanner scan = new Scanner(System.in);

                // enter row and column for array.
                row = 3;
                col = 4;

                // enter array elements.
                System.out.println("Enter " +(row*col)+ " array elements row by row (4 per row) : ");
                for(i=0; i<row; i++)
                {
                    for(j=0; j<col; j++)
                    {
                        arr[i][j] = scan.nextFloat();
                    }
                }

                // the 2D array is here.
                System.out.print("The Array is :\n");
                for(i=0; i<row; i++)
                {
                    for(j=0; j<col; j++)
                    {
                        System.out.print(arr[i][j]+ "  ");
                    }
                    System.out.println();
                }




    }
}
