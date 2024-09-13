// //Recurrsion

//** 1: factorial
// public class Lecture31 {
//     public static void main(String[] args) {
//         int n=5;
//         int res = factorial(n);
//         System.out.println(res);

//   }

//   private static int factorial(int n) {
//        if(n==0)
//         return 1;
//         return n * factorial(n - 1);

//     }

// }

//** 2: x^n

// public class Lecture31 {

//     public static void main(String[] args) {

//         int res = square(5, 3);
//         System.out.println(res);

//     }

//     private static int square(int x, int n) {

//         if(n==0)
//             return 1;

//         return x * square(x, n - 1);
//     }
// }

//** 3: print 0-n ussing recurssion

// public class Lecture31 {
//     public static void main(String[] args) {

//         int n = 5;
//         print(n);
// }

// private static void print(int n) {
//         if(n<0)
//         return;
//         else
//         {
//         System.out.println(n);
//         n--;
//         print(n);
//         }   

//     }

// }

//**  4: Reach at home

// public class Lecture31 {

//   public static void main(String[] args) {
//       int src = 0;
//       int dest = 10;
//       reachHome(src, dest);
//   }

//   private static void reachHome(int src, int dest) {
//    if(src==dest)
//        return;
// else
// {
//     src++;
//     System.out.println("km is :" + src);
//     reachHome(src, dest);

// }

// }  
// }

//** Fibonacci series 

// public class Lecture31 {

//     public static void main(String[] args) {

//         int nthTerm = 5;
//         int num = fibonacci(nthTerm);
//         System.out.println(num);
//     }

//     private static int fibonacci(int n) {

//         if(n==0)
//         return n ;
//        if(n==1)
//         return 1;
//     int res = fibonacci(n - 1) + fibonacci(n - 2);
//     System.out.println(res);
//     return res;

//     }
// }

//** Find a array is sorted or not using recurssion

// public class Lecture31 {

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5};
//         int len = arr.length - 1;
//         boolean res = isSorted(arr,  len);
//         System.out.println(res);

//     }

//     private static boolean isSorted(int[] arr, int len) {
// boolean ans=false;   
// if(len<=0 )
// return true;
// if(arr[len]>=arr[len-1] )
// ans=isSorted(arr, len-1);

// return ans;

//     }
// }

//** array sum using recurssion

// public class Lecture31 {
// public static void main(String[] args) {
//     int[] arr = { 1, 2, 4, 5, 6 };
//     int len = arr.length ;
//     int res = getSum(arr,  len);
//     System.out.println(res);
// }

// private static int getSum(int[] arr, int len) {

// if(len<=0)
// return 0;
// return ( arr[len - 1]+getSum(arr, len-1) );

// }

// }

//** find elemment using recurssion

// public class Lecture31 {

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         int key = 10;
//         int len = 5;
//         boolean res = searchKey(arr, key, len);
//         System.out.println(res);

//     }

//     private static boolean searchKey(int[] arr, int key, int len) {

//         if (len <= 0)
//             return false;
//         if(key==arr[len-1])
//             return true;
//         else
//             return searchKey(arr, key, len - 1);

//     }

// }

//** Binary search Using Recurssion

// public class Lecture31 {

//     public static void main(String[] args) {
//     int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
//     int s=0;
//     int e = arr.length-1;
//     int key = 1;
//     boolean res = isFound(arr, s,  e, key);
//        System.out.println(res);
//    }

//    private static boolean isFound(int[] arr, int s, int e,int key) {
//        int m = (s + e) / 2;
//        if (s > e)
//         return false;
//        if(arr[m]==key)
//            return true;
//        if(arr[m]<key)
//        {
//         s=m+1;
//        return isFound(arr, s, e, key);
//        }
//        else if(arr[m]>key)
//        {
//            e = m - 1;
//            return isFound(arr, s, e, key);
//        }
//       else
//           return false;

//     } 
// }

//**  reverse a string using recursion

// public class Lecture31 {

//     public static void main(String[] args) {
//         String string = "shubhajit";
//         String[] arrStrings = string.split("");
//         int start = 0;
//         int end = arrStrings.length - 1;

//         String ans = reverseString(arrStrings, start, end);
//         System.out.println(ans);
//     }

//     private static String reverseString(String[] arrStrings, int start, int end) {

//         if (start > end) {

//             return String.join("", arrStrings);

//         } else {
//             String temp = arrStrings[start];
//             arrStrings[start] = arrStrings[end];
//             arrStrings[end] = temp;
//             start++;
//             end--;
//             return reverseString(arrStrings, start, end);

//         }
//     }

// }


//** power of a number(x^n);

// public class Lecture31 {

//     public static void main(String[] args) {
//         int base = 2;
//         int pow = 4;
//         int res = square(base, pow);
//         System.out.println(res);

        
//     }

//     private static int square(int base, int pow) {
//        if(pow==0)
//            return 1;
//         if(pow ==1)
//             return base;

//     int ans = square(base, pow/2);
        
// if(pow%2 == 0)
//    return ans * ans;
// else
//     return ans*ans*base;

//     }
// }


//** Bublesort using recurssion

// public class Lecture31 {
//     public static void main(String[] args) {
//         int[] arr = { 2, 1, 3, 5, 4, 0 };
//         int len = arr.length;
//         sortedArray(arr, len);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//     }

//     private static void sortedArray(int[] arr, int len) {
//         if (len == 0 || len == 1)
//             return;
//         for (int i = 0; i < len - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 int temp = arr[i + 1];
//                 arr[i + 1] = arr[i];
//                 arr[i] = temp;
//             }
//         }

//         sortedArray(arr, len - 1);

//     }

// }



///** Today Ganesh Puja 




//** Graphical Representaion of how the code execute


// powerset({1, 2, 3}, [], [], 0)        // Start with index 0
//     ├── powerset({1, 2, 3}, [], [], 1) // Exclude 1
//     │   ├── powerset({1, 2, 3}, [], [], 2) // Exclude 2
//     │   │   ├── powerset({1, 2, 3}, [], [], 3) // Exclude 3
//     │   │   │   └── (Base case: add [] to ans)
//     │   │   └── powerset({1, 2, 3}, [], [3], 3) // Include 3
//     │   │       └── (Base case: add [3] to ans)
//     │   └── powerset({1, 2, 3}, [], [2], 2) // Include 2
//     │       ├── powerset({1, 2, 3}, [], [2], 3) // Exclude 3
//     │       │   └── (Base case: add [2] to ans)
//     │       └── powerset({1, 2, 3}, [], [2, 3], 3) // Include 3
//     │           └── (Base case: add [2, 3] to ans)
//     └── powerset({1, 2, 3}, [], [1], 1) // Include 1
//         ├── powerset({1, 2, 3}, [], [1], 2) // Exclude 2
//         │   ├── powerset({1, 2, 3}, [], [1], 3) // Exclude 3
//         │   │   └── (Base case: add [1] to ans)
//         │   └── powerset({1, 2, 3}, [], [1, 3], 3) // Include 3
//         │       └── (Base case: add [1, 3] to ans)
//         └── powerset({1, 2, 3}, [], [1, 2], 2) // Include 2
//             ├── powerset({1, 2, 3}, [], [1, 2], 3) // Exclude 3
//             │   └── (Base case: add [1, 2] to ans)
//             └── powerset({1, 2, 3}, [], [1, 2, 3], 3) // Include 3
//                 └── (Base case: add [1, 2, 3] to ans)


//** Powerset of Integer array

// import java.util.ArrayList;

// public class Lecture31 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3 };
//         int index = 0;

//         ArrayList<ArrayList<Integer>> res = powerset(arr, new ArrayList<>(), new ArrayList<>(), index);
//         System.out.println(res);
//     }

//     private static ArrayList<ArrayList<Integer>> powerset(int[] arr, ArrayList<ArrayList<Integer>> ans,
//             ArrayList<Integer> output, int index) {
//         // Base case: if index is greater than or equal to the array length
//         if (index >= arr.length) {
//             ans.add(new ArrayList<>(output)); // Add a copy of the current subset
//             return ans;
//         }

//         // Exclude the current element
//         powerset(arr, ans, output, index + 1);

//         // Include the current element
//         int element = arr[index];
//         output.add(element); // Add the current element to the subset
//         powerset(arr, ans, output, index + 1); // Recur with the next index

//         // Backtrack: remove the last added element to explore other subsets
//         output.remove(output.size() - 1);

//         return ans; 
//     }
// }

//**  SUbsequence of a string

// import java.util.*;
// class GFG {

//     static List<String> al = new ArrayList<>();

   
//     public static void main(String[] args)
//     {
//         String s = "abc";
//         findsubsequences(s, ""); // Calling a function
//         System.out.println(al);
//     }

//     private static void findsubsequences(String s,
//                                          String ans)
//     {
//         if (s.length() == 0) {
//             al.add(ans);
//             return;
//         }


//         findsubsequences(s.substring(1), ans + s.charAt(0));

        
//         findsubsequences(s.substring(1), ans);
//     }
// }



//** Phone Keypad problem

// import java.util.ArrayList;

// public class Lecture31 {

//     public static void main(String[] args) {

//         String digits = "23";

//         ArrayList ans = new ArrayList<String>();
//         ArrayList output = new ArrayList<String>();
//         int index = 0;
//         String[] mapping = {
//                 "", // 0
//                 "", // 1
//                 "ABC", // 2
//                 "DEF", // 3
//                 "GHI", // 4
//                 "JKL", // 5
//                 "MNO", // 6
//                 "PQRS", // 7
//                 "TUV", // 8
//                 "WXYZ" // 9
//         };

//         ArrayList res = new ArrayList<String>();
//         res = solve(index, digits, ans, mapping, output);
//         System.out.println(res);      
//     }

//     private static ArrayList solve(int index, String digits, ArrayList ans, String[] mapping, ArrayList output) {
       
//         if(index>=digits.length())
//         {
//             ans.add(String.join("", output));
//             return ans;
//         }
    
//         int numb = digits.charAt(index) - '0';
//         String value = mapping[numb];
       

//         for (int i = 0; i < value.length(); i++) {
//             output.add(value.charAt(i)+"");
//             solve(index + 1, digits, ans, mapping, output);
//             output.remove(output.size()-1);
  
//         }
//         return ans;
//     }
// }


//Permutation of a string


// import java.util.ArrayList;

// public class Lecture31 {

//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3 };
//         ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//         solve(nums, 0, new ArrayList<>(), res);
//         System.out.println(res);
//     }

//     private static void solve(int[] nums, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> ans) {
       
//         if (index == nums.length) {
//             ans.add(new ArrayList<>(current)); 
//             return;
//         }

//         for (int i = index; i < nums.length; i++) {
//             swap(nums, index, i);
//             current.add(nums[index]); 

//             solve(nums, index + 1, current, ans);

//             current.remove(current.size() - 1);
//             swap(nums, index, i); 
//         }
//     }

//     private static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }


//** Uniquepath 

// public class Lecture31 {
//     static int numberOfPaths(int m, int n) {
       
//         int dp[][] = new int[m][n];

        
//         for (int i = 0; i < m; i++)
//             dp[i][0] = 1;

      
//         for (int j = 0; j < n; j++)
//             dp[0][j] = 1;

        
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++)

               
//                 dp[i][j] = dp[i - 1][j]
//                         + dp[i][j - 1]; // + dp[i-1][j-1];
//         }
//         return dp[m - 1][n - 1];
//     }

    
//     public static void main(String args[]) {
//         System.out.println(numberOfPaths(3, 3));
//     }
    
// }

//** Or
// public class Lecture31 {

//     static int numberOfPaths(int m, int n) {
//         // If either given row number is first or
//         // given column number is first
//         if (m == 1 || n == 1)
//             return 1;

       
//         return numberOfPaths(m - 1, n)
//                 + numberOfPaths(m, n - 1);
        
//     }

//     public static void main(String args[]) {
//         System.out.println(numberOfPaths(3, 3));
//     }   
// }

//** Rat in a Maze Problem
// import java.util.ArrayList;
// import java.util.Vector;

// public class Lecture31 {

//     public static void main(String[] args) {
//         int[][] maze = {
//                 { 1, 0, 0, 0 },
//                 { 1, 1, 0, 1 },
//                 { 1, 1, 0, 0 },
//                 { 0, 1, 1, 1 }
//         };

//         int srx = 0; // Start row
//         int sry = 0; // Start column

//         Vector<String> ans = new Vector<>();
//         int[][] visited = new int[maze.length][maze[0].length];

        
//         if (maze[srx][sry] == 1) {
//             findPath(maze, visited, srx, sry, new ArrayList<String>(), ans);
//         }

//         System.out.println(ans);
//     }

//     private static void findPath(int[][] maze, int[][] visited, int srx, int sry, ArrayList<String> path,
//             Vector<String> ans) {
        
//         if (srx == (maze.length - 1) && sry == (maze[0].length - 1)) {
//             ans.add(String.join("", path)); 
//             return;
//         }

        
//         visited[srx][sry] = 1;

//         // For Down
//         int newx = srx + 1;
//         int newy = sry;
//         if (isSafe(newx, newy, visited, maze)) {
//             path.add("D");
//             findPath(maze, visited, newx, newy, path, ans);
//             path.remove(path.size() - 1);
//         }

//         // For Left
//         newx = srx;
//         newy = sry - 1;
//         if (isSafe(newx, newy, visited, maze)) {
//             path.add("L");
//             findPath(maze, visited, newx, newy, path, ans);
//             path.remove(path.size() - 1);
//         }

//         // For Right
//         newx = srx;
//         newy = sry + 1;
//         if (isSafe(newx, newy, visited, maze)) {
//             path.add("R");
//             findPath(maze, visited, newx, newy, path, ans);
//             path.remove(path.size() - 1);
//         }

//         // For Up
//         newx = srx - 1;
//         newy = sry;
//         if (isSafe(newx, newy, visited, maze)) {
//             path.add("U");
//             findPath(maze, visited, newx, newy, path, ans);
//             path.remove(path.size() - 1);
//         }

        
//         visited[srx][sry] = 0;
//     }

//     private static boolean isSafe(int newx, int newy, int[][] visited, int[][] maze) {
//         return (newx >= 0 && newx < maze.length) && (newy >= 0 && newy < maze[0].length)
//                 && visited[newx][newy] == 0 && maze[newx][newy] == 1;
//     }
// }


//**  Plus one

// class Solution {
//     public int[] plusOne(int[] digits) {
//         for (int i = (digits.length - 1); i >= 0; i--) {
//             if ((digits[i] + 1) != 10) {
//                 digits[i] += 1;
//                 return digits;
//             }
//             digits[i] = 0;
//         }
//         int[] output = new int[digits.length + 1];
//         output[0] = 1;
//         return output;
//     }
// }



//Bit addition
// class Solution {
//     public String addBinary(String a, String b) {
//         StringBuilder ret = new StringBuilder(); 
//         int carry = 0;
//         int i = a.length() - 1;
//         int j = b.length() - 1;

       
//         while (i >= 0 || j >= 0 || carry == 1) {
//             if (i >= 0) {
//                 carry += a.charAt(i) - '0'; 
//                 i--;
//             }
//             if (j >= 0) {
//                 carry += b.charAt(j) - '0'; 
//                 j--;
//             }
//             ret.append(carry % 2); 
//             carry /= 2; 
//         }
        
//         return ret.reverse().toString(); 
//     }
// }




// FIndBinary trees 
// numTrees(3)
// |
// |-- numTrees(0) * numTrees(2)  (i=1)
// |   |
// |   |-- numTrees(0)  --> returns 1
// |   |
// |   |-- numTrees(2)
// |       |
// |       |-- numTrees(0) * numTrees(1)  (i=1)
// |       |   |
// |       |   |-- numTrees(0) --> returns 1
// |       |   |
// |       |   |-- numTrees(1) --> returns 1
// |       |
// |       |-- numTrees(1) * numTrees(0)  (i=2)
// |           |
// |           |-- numTrees(1) --> returns 1
// |           |
// |           |-- numTrees(0) --> returns 1
// |
// |-- numTrees(1) * numTrees(1)  (i=2)
// |   |
// |   |-- numTrees(1) --> returns 1
// |   |
// |   |-- numTrees(1) --> returns 1
// |
// |-- numTrees(2) * numTrees(0)  (i=3)
// |   |
// |   |-- numTrees(2)
// |   |   |
// |   |   |-- numTrees(0) * numTrees(1)  (i=1)
// |   |   |   |
// |   |   |   |-- numTrees(0) --> returns 1
// |   |   |   |
// |   |   |   |-- numTrees(1) --> returns 1
// |   |   |
// |   |   |-- numTrees(1) * numTrees(0)  (i=2)
// |   |       |
// |   |       |-- numTrees(1) --> returns 1
// |   |       |
// |   |       |-- numTrees(0) --> returns 1
// |   |
// |   |-- numTrees(0) --> returns 1


class Solution {
    public int numTrees(int n) {

        if (n <= 1)
            return 1;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans + numTrees(i - 1) * numTrees(n - i);
        }
        return ans;

    }
}