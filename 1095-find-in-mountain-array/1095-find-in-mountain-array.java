/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return zoey(target,mountainArr);
    }

    public static int zoey(int target,MountainArray arr){
        int peak_index = peak_index(arr);
        int index = agnostic_BS(arr,target,0,peak_index);
        if(index!= -1){
            return index;
        }
        return agnostic_BS(arr,target,peak_index+1,arr.length()-1);
    }

    public static int peak_index(MountainArray arr){
        int lo = 0;
        int hi = arr.length()-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                hi = mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }

    public static int agnostic_BS(MountainArray arr, int target, int lo,int hi){
        boolean IsAssen = false;
        if(arr.get(lo)<arr.get(hi)){
            IsAssen = true;
        }

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            if(IsAssen == true){
                if(arr.get(mid) < target){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
            else{
                if(arr.get(mid) < target){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
        }
        return -1;
    }
}