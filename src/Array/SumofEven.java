package Array;
//
public class SumofEven {
    public static void main(String[] args) {
        int sum=1;
        int sum1=1;
        int []array={10,22,3,5};
        System.out.println("Sum of even number is:");
        for (int i=0;i< array.length;i++){
            if (array[i]%2==0){
                sum=sum*array[i];
            }
        }
        System.out.println(sum);

        System.out.println("Sum of Odd number is:");
        for (int i=0;i< array.length;i++){
            if (array[i]%2==1){
                sum1=sum1*array[i];
            }
        }
                System.out.println(sum1);
    }

}
