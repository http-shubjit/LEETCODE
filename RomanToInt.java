// Input: s = "III"
// Output: 3
// Explanation: III = 3.

public class RomanToInt {
   
    
    public static void main(String[] args) {
        String input = "III";
        String[] inputarr = input.split(""); 
        String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        int result = 0;
        for (int i = 0; i < inputarr.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                 if(inputarr[i].equals(symbol[j]))
                     result += values[j]; 
            }   
    }    
    System.out.println(result);
        
    }
    
}
