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


public class Lecture31 {
    public static void main(String[] args) {
    
        int n = 5;
        print(n);
}

private static void print(int n) {
        if(n<0)
        return;
        else
        {
        System.out.println(n);
        n--;
        print(n);
        }   
        
    }
    
}