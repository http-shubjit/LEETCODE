// //1:Pages Allocation in continious Manner
// /**
//  * Lecture15
//  */
// public class Lecture15 {

//     public static void main(String[] args) {
//         int[] pages = { 10, 20, 30, 40,50 };
//         int student = 2;
//         int s = 0;
//         int e;
//         int sum = 0;
//         for (int i = 0; i < pages.length; i++) {
//             sum += pages[i];
//         }
//         e = sum;
//         int minumpageAllocation=-1;
//         while (s <= e) {
//             int m = (s + e) / 2;
//             boolean res = isPossible(m, pages, student);
//             if (res) {
//                 minumpageAllocation = m;
//                 e = m - 1;
//             }

//             else
//                 s = m + 1;
//         }
//         System.out.println(minumpageAllocation);


//     }

//     private static boolean isPossible(int minpage, int[] pages, int student) {
//         int pageSum = 0;
//         int studentCount=1;

//         for (int i = 0; i < pages.length; i++) {
//     if(pageSum+pages[i]<=minpage)
//         pageSum += pages[i];
//     else
//     {
//         studentCount++;
//         if(studentCount>student || pages[i]>minpage)
//             return false;
//         pageSum = pages[i];
//     }
// }      
// return true;

//     }
// }


//**2 : Painters Problem




// public class Lecture15 {

//     public static void main(String[] args) {
        
//         int[] times = { 5, 5, 5, 5 };
//         int painter = 2;
//         int start = 0;
//         int end = 0;
//         for (int i = 0; i < times.length; i++) {
//             end += times[i];
//         }
//         int mid;
//         int ans=-1;
//         while (start <= end) {
//             mid = (start + end) / 2;
//             if (isPossible(times, mid, painter)) {
//                 {
//                     ans = mid;
//                     end = mid - 1;
//                 }} 
//             else
//                 start = mid + 1;
//         }
// System.out.println(ans);
//     }

//     private static boolean isPossible(int[] times, int mid, int painter) {
//         int painterCounter = 1;
//         int minimumTime = 0;
//         for (int i = 0; i < times.length; i++) {
//             minimumTime += times[i];

//             if (minimumTime > mid) {
//                 painterCounter++;
//                 if (painterCounter > painter)
//                     return false;
//                 minimumTime = times[i];
//             }

//             // if (minimumTime + times[i] <= mid) {
//             //     minimumTime += times[i];
//             // }
//             // else
//             // {
//             //     painterCounter++;
//             //     if(painterCounter>painter || times[i]>mid)
//             //         return false;
//             //     minimumTime = times[i];
//             // }

//         }
//         return true;

//     }

// }

//**Aggressive Cows Problem**/

import java.util.Arrays;

public class Lecture15 {
    public static void main(String[] args) {
        int s = 0;
        int[] stall = { 4,2,1,3,6 };
        int cows=2;
        Arrays.sort(stall);
        int sum = 0;
        for (int i = 0; i < stall.length; i++) {
            sum += stall[i];
        }
        int e = sum;
        int mid = (s + e) / 2;
        int ans = -1;
        while (s <= e) {
            mid = (s + e) / 2;
            if (isPossible(stall, cows, mid)) {
                ans = mid;
                s = mid + 1;
            }
          else
              e = mid - 1; 
}
System.out.println(ans);

}

private static boolean isPossible(int[] stall, int cows, int mid) {
    int cowsCount = 1;
    int maxStall = stall[0];
    for (int i = 0; i < stall.length; i++) {
        if (stall[i] - maxStall >= mid) {
            cowsCount++;
            if (cowsCount == cows)
                return true;
        }

    }
    return false; 
        

    }
    
}