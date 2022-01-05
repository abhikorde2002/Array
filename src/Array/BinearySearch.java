package Array;

public class BinearySearch {
    public static void main(String[] args) {
        int []array={10,20,30,40};
        int key=40;

        int mid,low ,high;
        low=0;
        high= array.length-1;
        mid=(low+high)/2;
        boolean flag=false;

        while (low<high){
            if (key<array[mid]){
                high=mid;
                mid=(low+high)/2;
            }
            if (key>array[mid]){
                low=mid;
                mid=(low+high)/2;
            }
            if (key==array[mid]){
                flag=true;
                break;
            }

        }
        System.out.println((flag)?"KeyFound":"KeyNotFound");

    }
}
