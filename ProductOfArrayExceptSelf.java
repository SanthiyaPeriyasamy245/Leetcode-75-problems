class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]left=new int[nums.length];
        left[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        int[]ans=new int[nums.length];
        int s=1;
        for(int j=nums.length-1;j>=0;j--)
        {

           ans[j]=left[j]*s;
           s=s*nums[j];
        }
        return ans;
       
    }
}