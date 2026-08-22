class Solution {
    public int search(int[] nums, int target) {
        return zoey(nums, target);
    }

    public static int zoey(int[] arr,int target){

        int k = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                k++;
            }
            else if(arr[i-1]>arr[i]){
                break;
            }
        }

        int lo = 0;
        int hi = k;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            }
            else{
                lo= mid+1;
            }
        }

        int lo2 = k+1;
        int hi2 = arr.length-1;
        while(lo2<=hi2){
            int mid2 = (lo2+hi2)/2;
            if(arr[mid2] == target){
                return mid2;
            }
            else if(arr[mid2] > target){
                hi2 = mid2-1;
            }
            else{
                lo2= mid2+1;
            }
    }
    return -1;
    }
}