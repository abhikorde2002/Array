package HighLevel;

import java.util.Arrays;

public class MissingNumber1 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int n=7;
        MissingNumber1 missingNumber1=new MissingNumber1();
        System.out.println(missingNumber1.MissingNumber(arr, n));
    }
    int MissingNumber(int arr[], int n)
    {
        int count =1;
        Arrays.sort(arr);
        for(int i =0 ; i<n-1 ; i++)
        {
            if(arr[i]!=count)
                break;
            count++;
        }

        return count;
    }
}
