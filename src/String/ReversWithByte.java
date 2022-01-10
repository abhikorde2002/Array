package String;

import java.nio.charset.StandardCharsets;

public class ReversWithByte {
    public static void main(String[] args) {
    String s1="Abhi001";
        System.out.println(rev(s1));
    }

    static String rev(String s1){
        byte []s1Byte = s1.getBytes(StandardCharsets.UTF_8);
        byte [] result = new byte[s1Byte.length];

        for (int i=0;i< s1Byte.length;i++){
                result[i]=s1Byte[s1Byte.length-1-i];
        }
        return new String(result);
    }

}
