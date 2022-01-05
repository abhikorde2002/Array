package HighLevel;

public class MaximumIndex {
    public static void main(String[] args) {
        int []array={10,20,30,40,50};
        int min=array[0];
        int index=0;
        for (int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
                index++;
            }
        }
        System.out.println(min+"is the minimum value at "+index);
    }
}
