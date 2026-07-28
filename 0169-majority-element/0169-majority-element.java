class Solution {
    public int majorityElement(int[] nums) {
        return minn(nums);
    }

    public static int minn(int[] arr){
        Arrays.sort(arr);
        int ans = arr[arr.length/2];
        return ans;
    }
}