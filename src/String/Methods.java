package String;

public class Methods {
    public static void main(String[] args) {
        String literal="Hello world";
        String newKeyword=new String("I am Abhishek korde");
        String literal1="Hello world44";

        System.out.println("length of literal string iS : "+literal.length());//Length
        System.out.println(literal.equals(literal1));//It will check Equality between two string .

        System.out.println(literal.charAt(4));//It returns char value for the particular index

        System.out.println(literal.indexOf('w'));//It returns the specified char value index.

        for (int i=literal.length()-1;i>=0;i--){
            System.out.print(literal.charAt(i));
        }
        System.out.println("\n Compare to :"+literal.compareTo(literal1));//It return positive or negative value.

        literal=literal.concat("Its Itachi Uchiha");//Adding two string together.
        System.out.println(literal);

        System.out.println(literal.contains("world"));

        System.out.println(literal.endsWith("a"));
        //if this string ends with a given suffix.
        // It returns true if this string ends with the given suffix;
        // else returns false.
    }
}
