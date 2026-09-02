class Solution {
    public int maxArea(int[] height) {
        int areamax= 0 ;
        int left =0 , right = height.length-1;
        while(left < right){
             
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;
           
            areamax = Math.max(area, areamax);
            if(height[left]< height[right]){ left++;
            }
            else if(height[left] > height[right]){ 
                
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return areamax;
    }
}