package Array;

import java.util.Arrays;

public class PositiveSort {
    public static void main(String[] args) {
      int array[]={-1,-5,2,-4,5};
      int index=0;
      int temp[]=new int[array.length-1];

      for (int i=0;i< array.length-1;i++){
          if (array[i]>0){
              temp[index++]=array[i];
          }
      }
      for (int i=0;i< array.length-1;i++){
          if (array[i]<0){
              temp[index++]=array[i];
          }
      }
      for (int i=0;i< array.length-1;i++){
          array[i]=temp[i];
        System.out.print(array[i]);
      }
    }
}
