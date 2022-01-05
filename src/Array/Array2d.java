package Array;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int [][]array=new int[2][3];

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Array Element :");
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.print("Printing Array");
        for (int i=0;i< array.length;i++){
            System.out.println("Row"+i);
            for (int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
