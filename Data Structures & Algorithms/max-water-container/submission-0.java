class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxA=0;
        int a=0;
       while(left<right){
        int l = Math.min(heights[left], heights[right]);
        int b = right - left;
         a = l * b;
        maxA = Math.max(maxA, a);
        if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
       
       }
            return maxA;
    }
    }

