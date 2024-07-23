class Solution {
    public int search(int[] nums, int target) {

        int first = 0;
        int last = nums.length-1;

        if(nums[last] < target){return -1;}

        int mid = (first + last)/2;
        while(first <= last){
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                first = mid+1;
            }else{
                last = mid - 1;
            }

            mid = (first+last)/2;
        }

        
        return -1;
    }
}