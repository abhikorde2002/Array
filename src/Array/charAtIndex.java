package Array;

public class charAtIndex {
    public static void main(String[] args) {
        char []array={'A','b','c','W'};
        char ch =' ';
        int Index=3;
        for (int i=0;i< array.length;i++){
            if (Index==i){
                ch=array[i];
                break;
            }
        }
        System.out.println("Character at "+ Index + " is "+ ch);
    }
}
