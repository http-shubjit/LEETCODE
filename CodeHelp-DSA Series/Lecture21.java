
//** 1: Rotate a Array

// public class Lecture21 {

//    public static void main(String[] args) {
      
//        int[] arr = { 1, 2, 3, 4, 5, 6 };
//        int k = 2;
//        int[] temp = new int[arr.length];

//        for (int i = 0; i < arr.length; i++) {
//            temp[((i + k) % (arr.length ))] = arr[i];
//        }

//        for (int j = 0; j < temp.length; j++) {
//            System.out.println(temp[j]);
//        }
//     }
// }

// ** 2: Rotate a Array without using second array

// public class Lecture21 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6 };
//         int n = 6;
//         int k = 2;
//         Rotateeletoleft(arr, n, k);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void Rotateeletoleft(int[] arr, int n, int k) {
//         // Reverse first n-k elements
//         Reverse(arr, 0, n - k - 1);
//         // Reverse last k elements
//         Reverse(arr, n - k, n - 1);
//         // Reverse whole array
//         Reverse(arr, 0, n - 1);
//     }

//     public static void Reverse(int[] arr, int start, int end) {
//         while (start <= end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

    
// }




//** 3: Rotate an array by d positions 


// public class Lecture21 {

//   public static void main(String[] args) {
//       int pos = 2;
//       int[] arr = { 1, 2, 3, 4, 5, 6 };
//       int[] temp = new int[arr.length];
//       int k = 0;
//       for (int i = pos; i < arr.length; i++) {
//           temp[k] = arr[i];
//           k++;
//       }
//        for (int j = 0; j < pos; j++) {
//           temp[k] = arr[j];
//           k++;
//       }
// for (int i = 0; i < temp.length; i++) {
//     System.out.println(temp[i]);
// }
//   }  
// }

//** 4:  Rotate an array by d positions without using second array


// public class Lecture21 {

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6 };
//         int rotate = 2;
        
//         for (int i = 0; i < rotate; i++) {
//             int first = arr[0];
//             for (int j = 0; j < arr.length - 1; j++) {
//                 arr[j] = arr[j + 1];
//             }
//             arr[arr.length - 1] = first;
//         }
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


//** 5: Check A Array Is rotatesorted or not



// public class Lecture21 {

//     public static void main(String[] args) {
        
//         int[] arr = { 3,4,5,1,2 };
//         boolean res = check(arr);
//         if (res) {
//             System.out.println("it is a sorted rotate array");
//         }
//         else {
//     System.out.println("not a sorted roated array");
// }
//     }

//     private static boolean check(int[] arr) {
//         int count = 0;
//         int end=arr.length-1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] >= arr[i])
//                 count++;
//         }
// if(arr[end]>arr[0])
//     count++;

   
// return count==1;

        
//     }
// }


//** 6: Add 2 Array

import java.util.ArrayList;

public class Lecture21 {
public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3,4 };
    int arr1len = arr1.length - 1;
    int[] arr2 = { 6 };
    int arr2len = arr2.length - 1;

    int carry=0;
    ArrayList reslist = new ArrayList<Integer>();
 
    while (arr1len >= 0 && arr2len >= 0) {
        int val1 = arr1[arr1len];
        int val2 = arr2[arr2len];
        int sum = val1 + val2 + carry;
        carry = sum / 10;
        int value = sum % 10;
        reslist.add(value);
        arr1len--;
        arr2len--;

    }
    while (arr1len >= 0) {
        int sum = arr1[arr1len] + carry;
        carry = sum / 10;
        int value = sum % 10;
        reslist.add(value);
        arr1len--;

    }
    while (arr2len >= 0) {

        int sum = arr1[arr2len] + carry;
        carry = sum / 10;
        int value = sum % 10;
        reslist.add(value);
        arr2len--;
    }
for (int i = reslist.size()-1; i >=0 ; i--) {
    System.out.println(reslist.get(i));
}    
}
    
}