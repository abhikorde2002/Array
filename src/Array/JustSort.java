package Array;

import java.util.Arrays;

public class JustSort {
    public static void main(String[] args) {
        int a[]={-5,4,-3,-4,-2,2};

        for (int i=0;i< a.length;i++){
            for (int j=i+1;j< a.length;j++){
                if (a[i]>a[j]){
                    int tem = a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
