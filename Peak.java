//find peak element using binary search on rotate sorted array

public class Peak {
 
    public static void main(String[] args) {
        
        int[] arr = { 7,8,9,1,2,3,4,5,6 };
        int result = findPivot(arr);


        System.out.println("Peak Index is: "+result);
    }

    private static int findPivot(int[] arr) {
      
        int s = 0;
        int e = arr.length - 1;
        int m ;
        while (s < e) {
            m = (s + e) / 2;
            if (arr[m] > arr[m + 1])
                s = m + 1;
            else
                e = m;
        }
        return s;
    }
}
