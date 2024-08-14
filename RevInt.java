//Reverse Integer
// Input: x = 123
// Output: 321
public class RevInt {
    public static void main(String[] args) {
        int x = 123;
        int reverse=0;
        while (x != 0) {
            int rem = x % 10;
            reverse = (reverse * 10) + rem;
            x = x / 10;

        }
        System.out.println(reverse);
    }
    
}
