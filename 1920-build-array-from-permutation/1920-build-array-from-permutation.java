class Solution {
    public int[] buildArray(int[] nums) {
    return build(nums);    
    }

    public static int[] build(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

}