class Solution {
    public int longestConsecutive(int[] nums) {
        return logg(nums);
    }

    public static int logg(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int longest =1;
        int count =1;
        for(int i=1;i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i] == arr[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}