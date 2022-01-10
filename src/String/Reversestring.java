package String;

public class Reversestring {
    public static void main(String[] args) {
        String s1 ="Abhishek";
        System.out.println("Original String :" +s1);
        System.out.print("After revers :");
        System.out.println(reverse(s1));
    }

    static String reverse(String s1){
        String n="";
        for (int i=0;i<s1.length();i++){
           char  ch =s1.charAt(i);
           n=ch+n;
        }

      return n;
    }




}
