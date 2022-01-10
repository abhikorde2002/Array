package String;

public class Simplesort {
    public static void main(String[] args) {
       String str="I Am ABhishek";
        char []ch= str.toCharArray();
        char temp;

        int i=0;

        while (i<ch.length){
            int j=i+1;
            while (j<=ch.length-1){
                if (ch[j]<ch[i]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
                j+=1;
            }
            i+=1;
        }
        System.out.println(ch);
    }


}
