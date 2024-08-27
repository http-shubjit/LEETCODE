
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

    public void Sort(int[] arr) {
        
    }


}

class MergeSort {

    public void Sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Sort'");
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
        int[] sortinser = insertionsort.Sort(arr);
        for (int i = 0; i < sortinser.length; i++) {
        System.out.println(sortinser[i]);
        }
        // quicksort.Sort(arr);
        // mergesort.Sort(arr);

}
}

