class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return maxi(nums);
    }

    public static int maxi(int[] arr){
        int max = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                max++;
                ans = Math.max(ans,max);

            }
            else{
                max= 0;
            }
        }
        return ans;
    }
}