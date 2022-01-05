package Array;

public class Sumofarray {
    public static void main(String[] args) {
        int sum=0;
        int []array={20,10,20,10};

        for (int i=0;i< array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
