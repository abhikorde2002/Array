package Array;

public class SortBubble {
    public static void main(String[] args) {


        int[] array = {10, 11, 455, 654, 525, 20, 15, 5};

        printArray(array);
     //   bubbleSort(array);
        onlySort(array);
    }


    static void onlySort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            printArray(array);
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                }
            }
        }


    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n");
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("Comparision no. " + j );
                printArray(arr);
            }
            System.out.println("pass no " + (i + 1));
//            printArray(arr);
        }
    }
}
