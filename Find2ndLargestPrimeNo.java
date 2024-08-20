import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Find2ndLargestPrimeNo
 */
public class Find2ndLargestPrimeNo {
    public static int isPrime(int nums) {
        int count = 0;
        if (nums == 2 || nums == 3)
            return count++;
        for (int i = 2; i < nums / 2; i++) {
            if (nums % i == 0) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("How Many Elmenet yo want");
int n = sc.nextInt();
int[] nums = new int[n];
for (int i = 0; i < n; i++) {
    nums[i] = sc.nextInt();
}
Arrays.sort(nums);
int secondprimeno=0;
int secondprimenoCount = 0;

for (int i = nums.length - 1; i >= 0; i--) {
    int cresult = isPrime(nums[i]);
    if (cresult <= 1) {
        secondprimeno = nums[i];
        secondprimenoCount++;
    }
    if (secondprimenoCount == 2) {
        secondprimeno = nums[i];
        break;
    }

}
if (secondprimeno != 0) {
    System.out.println("The second largest prime number is: " + secondprimeno);
} else {
    System.out.println("There are not enough prime numbers in the array.");
}

    }

    
}