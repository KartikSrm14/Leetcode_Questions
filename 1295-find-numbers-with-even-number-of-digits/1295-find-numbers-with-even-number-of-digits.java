class Solution {
    public int findNumbers(int[] nums) {
        return number(nums);
    }

    public static int number(int[] arr){
        int total_even =0;
        for(int i=0; i<arr.length; i++){
            int count =0;
            while(arr[i]>0){
            int rem = arr[i] % 10;
            count++;
            arr[i] = arr[i]/10;
        }
        if(count%2 ==0){
            total_even++;
        }
        }
        return total_even;
    }
}