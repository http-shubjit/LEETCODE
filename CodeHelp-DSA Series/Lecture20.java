
//Reverse array- i can 
//merge 2 array-i can
//moves zero to end- done but i will do now

public class Lecture20 {
    
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 2, 2, 0, 0 };
        int res[] = movesZeroes(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] movesZeroes(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
        if(arr[start]!=0)
        start++;
        else {
        while (arr[end]== 0) {
        end--;
        }
        if(arr[end]!=0)
        {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
       }
}
}return arr;
    }
}
