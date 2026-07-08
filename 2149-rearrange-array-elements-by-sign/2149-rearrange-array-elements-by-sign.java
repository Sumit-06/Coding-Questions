class Solution {
    public int[] rearrangeArray(int[] nums) {
        int eve = 0;
        int odd = 1;
        int [] ans = new int[nums.length];
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i] > 0){
                ans[eve] = nums[i];
                eve +=2;
            }
            if(nums[i] < 0){
                ans[odd] = nums[i];
                odd +=2;
            }
        }
        return ans;
    }
}