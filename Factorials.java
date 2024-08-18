import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            Factorial(nums[i]);
        }
        
    }

    public static void Factorial(int num) {
     int result=1;
     while (num > 0) {
         result = result * num;
         num--;
     }
        System.out.println(result);
    }
}
