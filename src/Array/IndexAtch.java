package Array;

public class IndexAtch {
    public static void main(String[] args) {
        char []array={'A','b','c','d'};
        char ch='c';
        int index=0;

        for (int i=0;i< array.length;i++){
            if (ch==array[i]){
                index=i;
                break;
            }
        }
        System.out.println("Index of "+ ch +" is " +index);
    }
}
