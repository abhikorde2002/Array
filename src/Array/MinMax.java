package Array;

public class MinMax {
    public static void main(String[] args) {
        int []array={20,50,18,30};
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
        int min=array[0];
        for (int i=0;i< array.length;i++){
            if(array[i]<min){
              min=array[i];
            }
        }
        System.out.println(min);
    }
}
