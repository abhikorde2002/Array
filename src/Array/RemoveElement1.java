package Array;

public class RemoveElement1 {
    public static void main(String[] args) {
        int[]array={10,20,30,40};
        int key=10;
        int[]result=new int[array.length-1];
        for (int i=0,j=0;i<= array.length-1;i++){
            if (key==array[i]){
             j++;
             continue;
            }
            result[i-j]=array[i];
        }

        for (int a:result){
            System.out.println(a);
        }
    }
}
