package Array;

import java.util.Scanner;

public class Findkey {
    //Its linear search by the way.

    public static void main(String[] args) {
        int len;

        //Enter the length of array.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        len=scanner.nextInt();


        //Enter the array element .
        int []array=new int[len];
        System.out.println("Enter the array element :");
        for (int i=0;i<len;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the key :");
        int key=scanner.nextInt();

        boolean flag=false;

        for (int i=0;i<len;i++){
            if (key==array[i]){
                flag=true;
            }

        }
            System.out.println((flag)?"key found":"key not found");


    }
}
