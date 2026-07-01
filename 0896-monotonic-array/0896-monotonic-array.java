class Solution {
    public boolean isMonotonic(int[] nums) {
        return mono(nums);
    }

    	public static boolean mono(int[] arr) {
		boolean inc = true;
		boolean dec = true;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				dec = false;
			}
			if(arr[i] < arr[i-1]) {
				inc = false;
			}
		}
		return inc || dec;
	}
}