
// //**finding prime no using Sieve of Eratosthenes

// public class Lecture24 {
//     public static void main(String[] args) {
//         int n = 40;
//         int cnt = 0;
//         boolean[] prime = new boolean[n + 1]; 
//         for (int i = 0; i <prime.length; i++) {
//             prime[i] = true;

//         }
//         prime[0] = false;
//         prime[1]=false;
//         for (int i = 2; i < prime.length; i++) {
//             if (prime[i])
//          {
// cnt++;
// for (int j = i * 2; j < prime.length; j = j + i)
//                     prime[j] = false;
//             }

//         }
//         System.out.println(cnt);

//     }

// }

//** 2: Sieve Segment for find find above 10^6 

//** 3 :Gcd Euclid’s Algo 

// public class Lecture24 {

//     public static void main(String[] args) {

//         int a = 12;
//         int b = 24;
//         int res = gcd(a, b);
//         System.out.println(a);
//     }

//     private static int gcd(int a, int b) {
//         if(a==0)
//             return a;
//         if(b==0)
//             return b;
//         while (a != b) {
//             if (a > b)
//                 a = a - b;
//             if (b > a)
//                 b =b-a;
//         }
//         return a;
//     }
// }

//** 4:Lcm

// public class Lecture24 {

//     public static void main(String[] args) {
//         int a = 20;
//         int b = 10;
//         int lcm=a>b?a:b;
//         while ( lcm%a != 0 || lcm%b != 0) {
//             lcm++;
//         }
//         System.out.println(lcm);

//     }
// }

//** 5: Modular Arithmetics/ Fast Exponentiation

// 3^4=(3^4/2)^2:in even
// 3^3=(3^3/2)^2*3:in odd;

// we can write both odd(x^n/2)^2*x and even(x^n/2)^2) like it, so from both equation (x^n/2)^2 is common so we erite the code in way so that in case of odd we store the value in res variable 
// and multiply the xwith itself  so it will be increment x time for next iteration and divide the power with 2 then we return the res;

public class Lecture24 {

    public static void main(String[] args) {
        int base = 5;
        int pow = 2;
        int mod = 5;
        int res = 1;
        while (pow > 0) {
            //for odd
            if ((pow & 1) == 1) {
                res =( res * base);
            }
            base = (base * base);
            pow = pow / 2;

        }
        System.out.println(res);
    }
}