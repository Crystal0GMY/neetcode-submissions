class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, leftMax = heights[left], rightMax = heights[right];
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(leftMax, rightMax) * (right - left));
            if (leftMax < rightMax) {
                left ++;
                if (left < right) leftMax = Math.max(leftMax, heights[left]);
                
            } else {
                right --;
                if (left < right) rightMax = Math.max(rightMax, heights[right]);
            }
        }
        return maxArea;
    }
}
