class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return zoey(arr);
    }

    public static int zoey(int[] arr){
        int lo = 0 ; 
        int hi = arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1]){
                hi = mid;
            }
            else{
                lo = mid+1;
            }
        }
        return  lo;
    }
}