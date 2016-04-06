/**
 * Created by Гость on 22.01.2016.
 */
public class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;

        System.out.println("Lenght of strOb1: " + strOb1.length()); // get the lenght of string's object
        System.out.println("The symbol with index 3 in strOb2: " + strOb2.charAt(3)); // get a symbol of string's object
        if(strOb1.equals(strOb2)) { // compare two strings
            System.out.println("strOb1 == strOb2");
        }
        else {
            System.out.println("strOb1 != strOb2");
        }
        if(strOb1.equals(strOb3)) {
            System.out.println("strOb1 == strOb3");
        }
        else {
            System.out.println("strOb1 != strOb3");
        }



    }
}
