//find peak element using binary search

public class Peak {
 
    public static void main(String[] args) {
        
        int[] arr = { 0, 4, 3, 5, 2 };
        int result = findPeak(arr);
        System.out.println(result);
    }

    private static int findPeak(int[] arr) {
      
        int s = 0;
        int e = arr.length - 1;
        int m ;
        while (s < e) {
            m = (s + e) / 2;
            if (arr[m] < arr[m + 1])
                s = m + 1;
            else
                e = m;
        }
        return arr[s];
    }
}
