package Array;

public class ElementAtIndex {
    public static void main(String[] args) {
        int []array={10,20,30,40};
        int el=0;
        int index=2;

        for (int i=0;i< array.length;i++){
            if (index==i){
                el=array[i];
                break;
            }
        }
        System.out.println("Element at "+ index +" is "+el);
    }
}

