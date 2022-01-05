package Array;

public class Revers1 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        for (int i=0;i< array.length/2;i++){
            int tem=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=tem;
        }
        for (int a:array) {
            System.out.println(a);
        }
    }
}
