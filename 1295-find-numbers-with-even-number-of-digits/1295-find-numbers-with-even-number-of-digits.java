class Solution {
    public int findNumbers(int[] nums) {
        return zoo(nums);
    }

    public static int zoo(int[] arr){
        int even = 0;
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            int ans = (int)(Math.log10(n))+1;
            if(ans%2==0){
                even++;
            }
        }
        return even;
    }
}


