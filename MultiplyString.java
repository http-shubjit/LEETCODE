import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1);

        BigInteger bigNum2 = new BigInteger(num2);

        BigInteger result = bigNum1.multiply(bigNum2);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        String num2 = scan.next();
        String result = multiply(num1, num2);
        System.out.println(result);
        
    }
    
}
