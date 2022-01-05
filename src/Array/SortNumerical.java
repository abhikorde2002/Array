package Array;

import java.util.Arrays;

public class SortNumerical {
    public static void main(String[] args) {
        int []array={10,20,12,0};
        String[]array1={"python","Sarina","Chaitale","Ayush","Abhi"};


        System.out.println("Original array: "+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sort :"+Arrays.toString(array));
        System.out.println("Original array: "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("After sort :"+Arrays.toString(array1));

    }

}
