// import java.util.ArrayList;
// import java.util.List;

// public class PermutationSequence {
//     public static void main(String[] args) {
//         String ans = getPermutation(3, 3);
//         System.out.println(ans);
        
//     }

//     public static String getPermutation(int n, int k) {
//         int fact = 1;
//         List<Integer> numbers = new ArrayList<>();
//         for (int i = 1; i < n; i++) {
//             fact = fact * i;
//             numbers.add(i);
//         }

//         numbers.add(n);
//         String ans = "";
//         k = k - 1;

//         while (true) {
//             ans = ans + numbers.get(k / fact);
//             numbers.remove(k / fact);
//             if (numbers.size() == 0) {
//                 break;
//             }
//             k = k % fact;
//             fact = fact / numbers.size();
//         }
//         return ans;
//     }
  
// }

import java.util.ArrayList;

/**
 * PermutationSequence
 */
import java.util.Arrays;

public class PermutationSequence {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<int[]> res = new ArrayList<>();
        permute(arr, res, 0, arr.length - 1);

        for (int[] permutation : res) {
            System.out.println(Arrays.toString(permutation));
        }
    }

    static void swap(int[] nums, int l, int i) {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }

    public static void permute(int[] numarr, ArrayList<int[]> aList, int index, int len) {
        if (index == len) {
            aList.add(numarr.clone()); // Add a copy of the array to avoid mutation issues
            return;
        }
        for (int i = index; i <= len; i++) {
            swap(numarr, index, i);
            permute(numarr, aList, index + 1, len);
            swap(numarr, index, i); // Backtrack
        }
    }
}
