class Solution {
    public int[] searchRange(int[] nums, int target) {
        return zoey(nums,target);
    }

    public static int[] zoey(int[] arr,int target){
        int first = -1;
        int last = -1;
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                lo = 0;
                hi = mid-1;
                first = mid;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int midd= (low+high)/2;
            if(arr[midd]==target){
                last = midd;
                low = midd+1;
            }
            else if(arr[midd] > target){
                high = midd-1;
            }
            else{
                low = midd+1;
            }
        }

        return new int[]{first,last};
    }
}