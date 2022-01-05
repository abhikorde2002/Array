import java.util.Arrays;

public class InsertAtIndex {
    public static void main(String[] args)
    {

        int n = 10;
        int i;
        int arr[] = {10,20,40,50,60 };
        int element = 30;
        int index = 2;
        System.out.println("Key is "+element+", At index "+index);
        System.out.println("\nArray be for Insert :"+ Arrays.toString(arr));

        int newarr[] = new int[arr.length + 1];
        for (i = 0; i < newarr.length; i++) {
            if (i < index)
                newarr[i] = arr[i];
            else if (i == index)
                newarr[i] = element;
            else
                newarr[i] = arr[i-1];
        }
        System.out.println("\nArray after Inserting element at Index: "+(Arrays.toString(newarr)));
    }

}
