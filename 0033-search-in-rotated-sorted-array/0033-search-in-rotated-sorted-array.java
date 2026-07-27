class Solution {
    public int search(int[] nums, int target) {
        return zoey(nums,target);
    }

    public static int zoey(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}