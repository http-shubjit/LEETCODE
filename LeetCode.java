// class Solution {
//     public String nearestPalindromic(String n) {
//         long num = Long.parseLong(n);
//         if (num <= 1) return "0"; 
        
//         long backnum = num - 1; 
//         long frontnum = num + 1; 
        
//         while (true) {
//             if (isPalindrome(backnum)) {
//                 return Long.toString(backnum);
//             }
//             backnum--; 
            
//             if (isPalindrome(frontnum)) {
//                 return Long.toString(frontnum);
//             }
//             frontnum++; 
//         }
//     }

//     public static boolean isPalindrome(long num) {
//         long revnum = 0;
//         long onum = num;
        
//         while (num > 0) {
//             long rem = num % 10;
//             revnum = revnum * 10 + rem; 
//             num /= 10;
//         }
        
//         return revnum == onum; 
//     }

   
// }


//Perfect Squares
// Given an integer n, return the least number of perfect square numbers that sum to n.

// A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.


// Iteration 1 (i = 1, square = 1):
// For i = 1, the square is 1, and we update dp[j] where j >= square (1 in this
// case):
// dp[1] = min(dp[1], dp[1 - 1] + 1) = min(MAX, dp[0] + 1) = 1
// dp[2] = min(dp[2], dp[2 - 1] + 1) = min(MAX, dp[1] + 1) = 2
// dp[3] = min(dp[3], dp[3 - 1] + 1) = min(MAX, dp[2] + 1) = 3
// dp[4] = min(dp[4], dp[4 - 1] + 1) = min(MAX, dp[3] + 1) = 4
// dp[5] = min(dp[5], dp[5 - 1] + 1) = min(MAX, dp[4] + 1) = 5
// dp[6] = min(dp[6], dp[6 - 1] + 1) = min(MAX, dp[5] + 1) = 6
// dp[7] = min(dp[7], dp[7 - 1] + 1) = min(MAX, dp[6] + 1) = 7
// dp[8] = min(dp[8], dp[8 - 1] + 1) = min(MAX, dp[7] + 1) = 8
// dp[9] = min(dp[9], dp[9 - 1] + 1) = min(MAX, dp[8] + 1) = 9
// dp[10] = min(dp[10], dp[10 - 1] + 1) = min(MAX, dp[9] + 1) = 10
// dp[11] = min(dp[11], dp[11 - 1] + 1) = min(MAX, dp[10] + 1) = 11
// dp[12] = min(dp[12], dp[12 - 1] + 1) = min(MAX, dp[11] + 1) = 12


// Iteration 2 (i = 2, square = 4):
// For i = 2, the square is 4, and we update dp[j] where j >= square (4 in this
// case):

// java
// Copy code
// dp[4] = min(dp[4], dp[4 - 4] + 1) = min(4, dp[0] + 1) = 1
// dp[5] = min(dp[5], dp[5 - 4] + 1) = min(5, dp[1] + 1) = 2
// dp[6] = min(dp[6], dp[6 - 4] + 1) = min(6, dp[2] + 1) = 3
// dp[7] = min(dp[7], dp[7 - 4] + 1) = min(7, dp[3] + 1) = 4
// dp[8] = min(dp[8], dp[8 - 4] + 1) = min(8, dp[4] + 1) = 2
// dp[9] = min(dp[9], dp[9 - 4] + 1) = min(9, dp[5] + 1) = 3
// dp[10] = min(dp[10], dp[10 - 4] + 1) = min(10, dp[6] + 1) = 4
// dp[11] = min(dp[11], dp[11 - 4] + 1) = min(11, dp[7] + 1) = 5
// dp[12] = min(dp[12], dp[12 - 4] + 1) = min(12, dp[8] + 1) = 3

// After iteration 2 (i = 2):
// // dp[] = [0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3]


// Iteration 3 (i = 3, square = 9):
// For i = 3, the square is 9, and we update dp[j] where j >= square (9 in this case):

// java
// Copy code
// dp[9] = min(dp[9], dp[9 - 9] + 1) = min(3, dp[0] + 1) = 1
// dp[10] = min(dp[10], dp[10 - 9] + 1) = min(4, dp[1] + 1) = 2
// dp[11] = min(dp[11], dp[11 - 9] + 1) = min(5, dp[2] + 1) = 3
// dp[12] = min(dp[12], dp[12 - 9] + 1) = min(3, dp[3] + 1) = 3
// After iteration 3 (i = 3):

// dp[] = [0, 1, 2, 3, 1, 2, 3, 4, 2, 1, 2, 3, 3]

// import java.util.Arrays;

// class Solution {
//     public static void main(String[] args) {
//         int res = numSquares(12);
//     }
   
//     public static int numSquares(int n) {

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, Integer.MAX_VALUE);
//         dp[0] = 0;

//         for (int i = 1; i * i <= n; i++) {
//             int square = i * i;
//             for (int j = square; j <= n; j++) {
//                 dp[j] = Math.min(dp[j], dp[j - square] + 1);
//             }
//         }

//         return dp[n];
//     }

// }






