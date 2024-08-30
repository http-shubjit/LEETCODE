
class BubbleSort {

    public int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;

    }


}

class SelectionSort {

    public int[] Sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        return arr;
      
    }


}

class InsertionSort {
    public int[] Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp <= arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;

        }
        return arr;
    }


}

class QuickSort {
    public int[] Sort(int[] arr,int s,int e) {
        if (s < e) {
            int p = partiton(arr, s, e);
            Sort(arr, s, p-1);
            Sort(arr, p + 1, e);
   }
        return arr;
    

}

private int partiton(int[] arr, int s, int e) {
    int p = arr[s];
int i=s+1;
int j=e;

while (i <= j) {

    while (i <= e && arr[i] <= p) {
        i++;

    }

    while (arr[j] > p) {
        j--;

    }
    if (i < j)
        swap(arr, i, j);

}
swap(arr, s, j);
return j;
    }

private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    }
    
   

class MergeSort {

    public void Sort(int[] arr, int l, int r) {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            Sort(arr, l, m);
            Sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
   
    static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}

public class Sorting {
    public static void main(String[] args) {
 
        BubbleSort bubblesort = new BubbleSort();
        SelectionSort selectionsort = new SelectionSort();
        InsertionSort insertionsort = new InsertionSort();
        QuickSort quicksort = new QuickSort();
        MergeSort mergesort = new MergeSort();

        int[] arr = { 897, 234, 76, 453, 12, 678, 342, 555, 888, 123, 999, 54, 321, 765, 234, 987, 456, 135, 678, 543,
                210, 789, 345, 678, 111, 222, 333, 444, 555, 666, 777, 888, 999, 101, 202, 303, 404, 505, 606, 707, 808,
                909, 100, 200, 300, 400, 500, 600, 700, 800, 900, 950, 910, 870, 760, 650, 540, 430, 320, 210, 100, 990,
                880, 770, 660, 550, 440, 330, 220, 110, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666,
                555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333,
                222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999,
                888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666,
                555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333,
                222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111, 999,
                888, 777, 666, 555, 444, 333, 222, 111, 999, 888, 777, 666, 555, 444, 333, 222, 111 };

        // int[] sortboble = bubblesort.Sort(arr);
        // for (int i = 0; i < sortboble.length; i++) {
        //     System.out.println(sortboble[i]);
        // }
        // int [] sortselection=selectionsort.Sort(arr);
        // for (int i = 0; i < sortselection.length; i++) {
        //     System.out.println(sortselection[i]);
        // }
        // int[] sortinser = insertionsort.Sort(arr);
        // for (int i = 0; i < sortinser.length; i++) {
        // System.out.println(sortinser[i]);
        // }
    //    int[] sortquick=  quicksort.Sort(arr, 0, arr.length - 1);
    //    for (int i = 0; i < sortquick.length; i++) {
    //    System.out.println(sortquick[i]);
    //    } 
        mergesort.Sort(arr,0,arr.length-1);

}
}

