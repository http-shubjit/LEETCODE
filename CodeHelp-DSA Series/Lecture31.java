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


public class Lecture31 {
public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 5, 6 };
    int len = arr.length ;
    int res = getSum(arr,  len);
    System.out.println(res);
}

private static int getSum(int[] arr, int len) {

if(len<=0)
return 0;
return ( arr[len - 1]+getSum(arr, len-1) );

}
    
}