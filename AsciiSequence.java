import java.util.Scanner;

/**
 * AsciiSequence
 */
public class AsciiSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int asciivalue = 0;
        char[] stringarr = string.toCharArray();
        for (char c : stringarr) {
            int value = (int)(c);
            if (asciivalue == 0) {
                asciivalue = value;
            }
            if (value < asciivalue) {
                asciivalue = value;
            }
            
        }
        System.out.println((char)(asciivalue));
        

    }
}

