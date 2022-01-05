package Array;

import java.util.Arrays;

public class InsertAtIndex {
    //Write a Java program to insert an element (specific position) into an array.
    public static void main(String[] args) {
        int []array={10,20,30,40,50};

        int index=2;
        int  value=25;
        System.out.println("Original array is :" + Arrays.toString(array));
        for (int i=array.length-1;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=value;
        System.out.println("New Array is : " +Arrays.toString(array));
    }
}
