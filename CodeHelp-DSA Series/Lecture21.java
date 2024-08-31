
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