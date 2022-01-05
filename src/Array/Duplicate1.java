package Array;

import java.util.Arrays;

import static Array.SortBubble.printArray;

public class Duplicate1 {
    public static void main(String[] args) {
        int []array={10,20,10,20,11};
        boolean flag=false;
        Arrays.sort(array);

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length-1;j++){
                if (array[j]==array[j+1]){
                    flag=true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(flag?"Duplicate":"Not duplicate");
    }
}
