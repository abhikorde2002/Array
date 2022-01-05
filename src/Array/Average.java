package Array;

public class Average {
    public static void main(String[] args) {
        int []array={10,20,30,40};
        int sum=0;

        for (int i=0;i< array.length;i++){
         sum=sum+array[i];
        }
        System.out.println(sum);
        double average=sum/ array.length;
        System.out.println( "Average value of array is :" +average);
            }
}
