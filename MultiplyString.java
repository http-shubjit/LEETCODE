import java.util.Scanner;

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        
        return Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        String num2 = scan.next();
        String result = multiply(num1, num2);
        System.out.println(result);
        
    }
    
}
