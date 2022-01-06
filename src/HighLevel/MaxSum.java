package HighLevel;
//Kadane algorithm:We have to find maximum Sub array
//
public class MaxSum {
    public static void main(String[] args) {
        int array[] = {10, -4, 6, -8, 5};
        int maxSum = maxSubArray(array);
        System.out.println(maxSum);

    }
     static int maxSubArray(int[]array){
        int maxSum=0;
        int currentSum=0;
        for (int i=0;i<array.length;i++){
            currentSum = currentSum+array[i];
            if (currentSum >maxSum){
                maxSum=currentSum;
            }
            if (currentSum <0){
                currentSum=0;
            }
        }
        return maxSum;

     }



}

