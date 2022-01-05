package HighLevel;

public class NumberOfPairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2};
        int n = 5;
        int k = 3;
        NumberOfPairs numberOfPairs = new NumberOfPairs();
        System.out.println(numberOfPairs.getPairsCount(arr, n, k));
    }

    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}




