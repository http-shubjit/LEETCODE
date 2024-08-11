// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

// Example 1:


// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.



public class AddNum {
    public static void Add(int[] l1, int[] l2) {
        int sum = 0;
        String sum1 = "";
        String sum2 = "";
        for (int i = l1.length - 1; i >= 0; i--) {
            sum1 += l1[i];
            sum2 += l2[i];
        }
        sum = Integer.parseInt(sum1) + Integer.parseInt(sum2);
        String[] sumString = Integer.toString(sum).split("");
        String revsumString = "";
        for (int i = sumString.length - 1; i >=0; i--) {
            revsumString += sumString[i];

        }
        System.out.println(revsumString);


    }
    public static void main(String[] args) {
        
        int [] l1={2,4,3};
        int[] l2 = { 5, 6, 4 };

        Add(l1,l2);

    }
    
}
