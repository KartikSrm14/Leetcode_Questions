class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return zoo(letters,target);
    }

    public static char zoo(char[] arr,char target){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target < arr[mid]){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return arr[lo % arr.length];
    }
}