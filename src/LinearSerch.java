public class LinearSerch {
    public static void main(String[] args) {
        int []array={10,30,20,50};
        int key=50;
        boolean flag=false;
        for (int i=0;i< array.length;i++){
            if (key==array[i]){
                flag=true;
            }
        }
        System.out.println((flag)?"key found":"key not found");
    }
}
