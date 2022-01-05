package HighLevel;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7};
        int n=7;
        MissingNumber missingNumber=new MissingNumber();
        System.out.println(missingNumber.MissingNumber(arr, n));
    }
    int MissingNumber(int arr[], int n)
    {
        int givensum=0;
        int totalsum = n*(n+1)/2;

        for(int i =0 ; i<n-2; i++ )
            givensum = givensum+arr[i];

        return totalsum-givensum;

    }
}
