package Array;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int len ;
        //Enter the length of array.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length :");
        len=scanner.nextInt();

        //Enter the array element.
        int []array=new int[len];
        System.out.println("Enter the array element :");
        for (int i = 0; i< len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int a:array) {
            System.out.print(a);
        }
        }
    }

