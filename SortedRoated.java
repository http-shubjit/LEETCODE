public class SortedRoated {
    

    public static void main(String[] args) {

        int[] arr = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        int key = 6;
        int p = pivot(arr);
        int res = find(arr, p, key);
       System.out.println(res);

    }
    

    private static int find(int[] arr, int p, int key) {
        if (key >= arr[p] && key <= arr[(arr.length - 1)])
            return binarySearch(arr, p, arr.length - 1, key);
        else
            return binarySearch(arr, 0, p - 1, key);
    }


    private static int binarySearch(int[] arr, int i, int j, int key) {
        int s = i;
        int e = j;
        int k = key;
        while (s<=e) 
        {
            int m = (s + e) / 2;
            if (arr[m] == k)
                return m;
            else if (arr[m] > k)
                e = m - 1;

            else if (arr[m] < k)
                s = m + 1;

        }
        return -1;
        
        
    }

    private static int pivot(int[] arr) {
       
int s=0;
int e=arr.length-1;

while (s < e) {
    int m=(s+e)/2;

    if(arr[m]>=arr[0])
        s = m + 1;
else
    e = m;
    
}
return s;
    }
}
