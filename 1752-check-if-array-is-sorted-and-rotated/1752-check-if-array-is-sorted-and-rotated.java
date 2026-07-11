class Solution {
    public boolean check(int[] nums) {
        return sort(nums);
    }

    public static boolean sort(int[] arr){
        int n = arr.length;
        int[] brr = arr.clone();
        Arrays.sort(brr);

        for(int x=0; x<n; x++){
        boolean same = true;
        for(int i=0; i<n; i++){
            if(brr[i] != arr[(i+x)%n]){
                same = false;
                break;
            }

        }
        if(same){
            return true;
        }
        }
        return false;
    }
}