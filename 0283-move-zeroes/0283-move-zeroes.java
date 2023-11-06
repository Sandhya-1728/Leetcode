class Solution {
    public void moveZeroes(int[] nums) {
        int dt=-1;
        while(++dt<nums.length && nums[dt]!=0);
        int c=dt;
        while(++c<nums.length){
            if(nums[c]!=0){
                nums[dt++]=nums[c];
            }
        }
        while(dt<nums.length){
            nums[dt++]=0;
        }
    }
}