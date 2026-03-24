class Solution {
    public int maxArea(int[] height) {
        int maximum_Area = 0;
        int l =0;
        int r = height.length-1;
        while(l<r)
        {
            int currentarea = Math.min(height[l],height[r])*(r-l);
            maximum_Area = Math.max(maximum_Area,currentarea);
            if(height[l] < height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maximum_Area;
    }
}