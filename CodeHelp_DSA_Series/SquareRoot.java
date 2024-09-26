//Square Roota Of A number Using Binary Search;


public class SquareRoot {
    public static void main(String[] args) {
        int num = 90;
        int res = findSquareRoot(num);
        double exactres = findExactSquareRoot(num, res);
        System.out.println(exactres);
        
    }

    private static double findExactSquareRoot(int num, int res) {
        double factor = 1;
        double exactresult = res;
        for (int i = 0; i < 2; i++) {
            factor = factor / 10;
            for (double j = res; j * j < num; j = j + factor) {
                exactresult = j;
                

            }

        }
        return exactresult;
        
    }

    static int findSquareRoot(int num) {
        if (num == 0 || num == 1) {
            return num; 
        }
        int start = 2;
        int end = num;
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            int square = mid * mid;
            if(square==num)
                return mid;
            else if(square>num)
                end = mid - 1;
            else if (square < num) {
                ans = mid;
                start = mid + 1;
            }            
            
        }
        return ans;


    }
    
}
