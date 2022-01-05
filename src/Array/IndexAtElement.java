package Array;

public class IndexAtElement {
    public static void main(String[] args) {
        int []array={10,20,30,40};
        int el=20;
        int Index=0;

        for (int i=0;i< array.length;i++){
            if (el==array[i]){
                System.out.println(i);
                Index=i;
                break;
            }
        }
        System.out.println("Index At "+ el + " is " +Index);
    }
}
