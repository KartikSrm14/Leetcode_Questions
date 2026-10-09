class Solution {
    public int splitArray(int[] nums, int k) {
        return split(nums,k);
    }

    public static int split(int[] arr, int k){
        int start = 0 ;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        //binary search 
        while(start<end){
            //try for the middle as potential ans
            int mid = (start+end)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    //you can't add this in this subarray , make new one 
                    //say you add this num in the new subarray,then sum = num

                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }

        return end; // here start == end
    }
}