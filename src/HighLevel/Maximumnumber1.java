package HighLevel;

public class Maximumnumber1 {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        int max=array[0];
        int index=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
                index++;
            }
        }
        System.out.println(max+ "is the maximum number at index" +index);
    }
}
