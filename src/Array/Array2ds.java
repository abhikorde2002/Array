package Array;

import java.util.Scanner;

public class Array2ds {
    public static void main(String[] args) {
        int [][]array=new int[2][3];
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Print array : ");
        for (int i=0;i< array.length;i++){
            sum=0;
            for (int j=0;j<array[i].length;j++) {
                sum = sum + array[i][j];
            }
                System.out.print(sum+" ");


        }

    }
}
