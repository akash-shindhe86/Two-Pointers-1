// Time Complexity : O(n) for two pointers. O(n2) for brute force.
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I used the same logic Jaspinder explained. 

class Solution {
    public int maxAreaBruteForce(int[] height) {
        int max = 0;
        for(int i =0;i < height.length; i++){
            for(int j = i + 1;j < height.length; j++){
                int width = j - i;
                int heigth = Math.min(height[i],height[j]);
                max = Math.max(max, width * heigth);
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
       int max = 0;
       int l = 0, r = height.length - 1;

       while (l < r){
        int width = r - l;
        int heigth = Math.min(height[l], height[r]);
        max = Math.max(max, width * heigth);
        if(height[l] <= height[r]){
            l++;
        }else{
            r--;
        }
       }
       return max;
    }
}