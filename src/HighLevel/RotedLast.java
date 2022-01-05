package HighLevel;

import java.util.Arrays;

public class RotedLast {
    public static void main(String[] args) {
        int []array={4,5,2,1,3};

        int tem=array[array.length-1];

        for (int i= array.length-1;i>=1;i--){
            array[i]=array[i-1];
        }
        array[0]=tem;
        System.out.println(Arrays.toString(array));

    }
}
