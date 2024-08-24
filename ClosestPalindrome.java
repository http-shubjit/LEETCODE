public class ClosestPalindrome {

    public static void main(String[] args) {
        int num = 123;
        int result = closestPalindrome(num);
        System.out.println(result);
    }

    static int closestPalindrome(int num) {
        int incrementCount = 0;
        int decrementCount = 0;
        int incrementNum = num;
        int decrementNum = num;

        // Find the closest palindrome greater than or equal to num
        while (!isPalindrome(incrementNum)) {
            incrementCount++;
            incrementNum++;
        }

        // Find the closest palindrome less than or equal to num
        while (!isPalindrome(decrementNum)) {
            decrementCount++;
            decrementNum--;
        }

        

        // Choose the closer palindrome
        if (incrementCount < decrementCount) {
            return incrementNum;
        } else if (decrementCount < incrementCount) {
            return decrementNum;
        } else {
            // If both counts are equal, return the smaller number
            return decrementNum < incrementNum ? decrementNum : incrementNum;
        }
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not palindromes
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }
}
