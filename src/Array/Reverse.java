package Array;

import java.util.Scanner;

//Take 5 integer input from user and store them in array.now copy all the element in an another array but in reverse order.
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []a = new int[5];
        int []b= new int[5];

        System.out.println("Enter array element :");
        for (int i=0;i< a.length;i++){
            a[i]=scanner.nextInt();
        }
        int j=0;
        for (int i= b.length-1;i>=0;i--){
            b[i]=a[j];
            j++;
        }
//        for (int array:b) {
//            System.out.print(array+" ");
//        }
       System.out.println("The value of array is :");
        for (int i=0;i< b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
