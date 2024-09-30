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