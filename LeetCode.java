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
//         System.out.println(res);
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

//Ugly Number-II

// //Initialization
// uglyNumbers: []
// index2: 0
// index3: 0
// index5: 0
// next2: 2 (1 * 2)
// next3: 3 (1 * 3)
// next5: 5 (1 * 5)
// Iteration Steps
// Iteration 1 (i = 1)
// nextUgly: min(2, 3, 5) = 2
// Update uglyNumbers: [1, 2]
// Update pointers:
// Since nextUgly is next2, increment index2 to 1.
// Update next2: uglyNumbers[index2] * 2 = 4
// Iteration 2 (i = 2)
// nextUgly: min(4, 3, 5) = 3
// Update uglyNumbers: [1, 2, 3]
// Update pointers:
// Since nextUgly is next3, increment index3 to 1.
// Update next3: uglyNumbers[index3] * 3 = 6
// Iteration 3 (i = 3)
// nextUgly: min(4, 6, 5) = 4
// Update uglyNumbers: [1, 2, 3, 4]
// Update pointers:
// Since nextUgly is next2, increment index2 to 2.
// Update next2: uglyNumbers[index2] * 2 = 6
// Iteration 4 (i = 4)
// nextUgly: min(6, 6, 5) = 5
// Update uglyNumbers: [1, 2, 3, 4, 5]
// Update pointers:
// Since nextUgly is next5, increment index5 to 1.
// Update next5: uglyNumbers[index5] * 5 = 10
// Iteration 5 (i = 5)
// nextUgly: min(6, 6, 10) = 6
// Update uglyNumbers: [1, 2, 3, 4, 5, 6]
// Update pointers:
// Since both nextUgly values are from next2 and next3:
// Increment index2 to 3, update next2:
// uglyNumbers[index2] * 2 = 8
// Increment index3 to 2, update next3:
// uglyNumbers[index3] * 3 = 9
// Iteration 6 (i =6)
// nextUgly: min(8 ,9 ,10) =8
// Update uglyNumbers : [1 ,2 ,3 ,4 ,5 ,6 ,8]
// Update pointers:
// Since nextUgly is from next2:
// Increment index2 to '4', update next2:
// uglyNumbers[index2] * 2 =10
// Iteration7 (i=7)
// nextUgly: min(10 ,9 ,10) =9
// Update uglyNumbers : [1 ,2 ,3 ,4 ,5 ,6 ,8 ,9]
// Update pointers:
// Since nextUgly is from next3:
// Increment index3 to '3', update next3:
// uglyNumbers[index3] * 3=12
// Iteration8 (i=8)
// nextUgly: min(10 ,12 ,10) =10
// Update uglyNumbers : [1 ,2 ,3 ,4 ,5 ,6 ,8 ,9 ,10]
// Update pointers:
// Since nextUgly is from next5:
// Increment index5 to '2', update next5:
// uglyNumbers[index5] *5=15
// Iteration9 (i=9)
// nextUgly: min(12 ,12 ,15) =12
// Update uglyNumbers : [1 ,2 ,3 ,4 ,5 ,6 ,8 ,9 ,10 ,12]
// Update pointers:
// Since nextUgly is from next3:
// Increment index3 to '4', update next3:
// uglyNumbers[index3]*3=15
// Final Output
// After completing all iterations up to n=10:
// The final array of ugly numbers is:
// text
// [1, 
// 2,
// 3,
// 4,
// 5,
// 6,
// 8,
// 9,
// 10,
// 12]

// Thus the output for the function call with n=10 would be:
// java
// return uglyNumbers[9]; // returns the value '12'

// The tenth ugly number is therefore 12.


// class Solution {
//     public static void main(String[] args) {
//         int n = 10;

//  int[] uglyNumbers = new int[n];
//         uglyNumbers[0] = 1; // The first ugly number is 1

//         // Initialize pointers for multiples of 2, 3, and 5
//         int index2 = 0, index3 = 0, index5 = 0;

//         // Next multiples
//         int next2 = 2, next3 = 3, next5 = 5;

//         // Iterate to find the next ugly numbers
//         for (int i = 1; i < n; i++) {
//             // Choose the smallest among next multiples
//             int nextUgly = Math.min(next2, Math.min(next3, next5));
//             uglyNumbers[i] = nextUgly;

//             // Update pointers and next multiples accordingly
//             if (nextUgly == next2) {
//                 index2++;
//                 next2 = uglyNumbers[index2] * 2;
//             }
//             if (nextUgly == next3) {
//                 index3++;
//                 next3 = uglyNumbers[index3] * 3;
//             }
//             if (nextUgly == next5) {
//                 index5++;
//                 next5 = uglyNumbers[index5] * 5;
//             }
//         }
//     }
// }

class Solution {
    public static void main(String[] args) {
        int result = bulbSwitch(3);
    }
   
    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}