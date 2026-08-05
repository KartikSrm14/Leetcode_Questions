class Solution {
    public int searchInsert(int[] nums, int target) {
        return zoo(nums,target);
    }

    public static int zoo(int[] arr,int x){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return lo;

    }
}