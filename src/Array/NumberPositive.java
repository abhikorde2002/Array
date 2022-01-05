package Array;

import java.util.Scanner;

public class NumberPositive {
    public static void main(String[] args) {
        int[] array=new int[5];

        System.out.println("Enter the Array element :");
        Scanner scanner1=new Scanner(System.in);
        for (int i= 0;i< array.length;i++){
            array[i]=scanner1.nextInt();
        }
        String number;
        System.out.println("Enter the choice :");
        Scanner scanner = new Scanner(System.in);
        number = scanner.next();

        switch (number) {
            case "Positive":
            System.out.println("Positive number are:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    System.out.println(array[i]);
                }
            }
            break;
            case "Negative":
            System.out.println("Negative number are:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    System.out.println(array[i]);
                }
            }
            break;
            case "Even":

            System.out.println("Even number is :");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.println(array[i]);
                }
            }
            break;
            case "Odd":
                System.out.println("Odd number is :");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1) {
                    System.out.println(array[i]);
                }
            }
            break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Thanks for coming");
    }

}