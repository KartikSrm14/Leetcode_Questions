class Solution {
    public int search(int[] nums, int target) {
        return zoey(nums,target);
    }

    public static int zoey(int[] arr,int target){
        int peak = pivot(arr);
        int ans = BS(arr,target,0,peak);
        if(ans!=-1){
            return ans;
        }
        return BS(arr,target,peak+1,arr.length-1);
    }

    public static int pivot(int[] arr){
        int lo = 0 ;
        int hi = arr.length-1;
        while(lo<= hi){
            int mid = (lo+hi)/2;
            //4 cases
            if(mid < hi && arr[mid]>arr[mid+1]){
                return mid;
            } 
            if(mid > lo && arr[mid]<arr[mid-1]){
                return mid-1;
            } 
            if(arr[mid] <= arr[lo]){
                hi = mid-1;
            }  
            else{
                lo = mid+1;
            }
    }
    return -1;
    }

    public static int BS(int[] arr,int target,int lo,int hi){
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
}




