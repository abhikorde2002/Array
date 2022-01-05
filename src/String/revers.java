package String;

public class revers {
    public static void main(String[] args) {
        String str=" I AM ABHI";
        char ch;
        for (int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}
