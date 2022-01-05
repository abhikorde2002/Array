package Array;

public class RemoveElement {
    public static void main(String[] args) {
        int []array={10,20,30,40};
        int key=20;
        int index=0;

        int []result=new int[array.length-1];

        for (int i=0;i<array.length;i++){
            if (key==array[i]){
                index=i;
                break;
            }
            result[i]=array[i];
        }
        for (int i=index;i< result.length;i++){
            result[i]=array[i+1];
        }
        for (int a:result) {
            System.out.println(a);
        }
    }
}
