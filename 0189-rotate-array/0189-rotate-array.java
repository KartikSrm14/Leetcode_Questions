class Solution {
    public void rotate(int[] nums, int k) {
        rot(nums,k);
    }
    public static void rot(int[] arr,int k){
        int[] ans = new int[arr.length];
        k = k%arr.length;
        int source = arr.length-k;
        for(int i=0; i<k; i++){
            ans[i]= arr[source];
            source++;
        }
        int j=0;
        for(int i=k; i<arr.length; i++){
            ans[i] = arr[j] ;
            j++;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }
}