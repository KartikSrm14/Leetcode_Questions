class Solution {
    public int findNumbers(int[] nums) {
        return zoo(nums);
    }

    public static int zoo(int[] arr){
        int even = 0;
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            int count = 0;
            while(n>0){
                count++;
                n=n/10;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}