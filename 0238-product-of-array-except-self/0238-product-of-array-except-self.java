class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int multi=1,ctzero=0;
        for (int i:nums){
            if(i==0){
                ctzero+=1;
            }else{
                multi*=i;
            }
        }
        if(ctzero==0){
            for(int i=0;i<nums.length;i++){
                res[i]=multi/nums[i];
            }
        }else if(ctzero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=multi;
                }
            }
        }    
        return res;
    }
}