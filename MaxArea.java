
//** finding maxarea
public class MaxArea {
    public static void main(String[] args) {
    
    int[] height = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int maxArea = 0;
    int left = 0;
    int minArea=0;
    int right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
        minArea = Math.min(maxArea, (right - left) * Math.min(height[left], height[right]));
        if (height[left] < height[right])
            left++;
        else
            right--;
    }
    System.out.println("minArea :"+minArea);
    System.out.println("maxArea :"+maxArea);
}
    
}