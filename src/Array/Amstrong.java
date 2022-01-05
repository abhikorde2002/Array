package Array;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int number;
        int sum=0;

        int i = 0;
        System.out.println("Amstrong number from 0 to 100 are: ");
        for (i=0; i <= 100 ; i++){

            number=i;

            while (number>0){
                int digits=number%10;
                sum=(sum+(digits*digits*digits));
                number=number/10;
            }
            if (sum==i){
                System.out.println(i);
            }
           sum=0;
        }
    }
}
