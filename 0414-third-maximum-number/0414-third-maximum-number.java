class Solution {
    public int thirdMax(int[] nums) {
        return third(nums);
    }
    public static int third(int[] arr) {
        Arrays.sort(arr);
		int largest = arr[arr.length-1];
		int count = 1;
		int previous = largest;
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i] != previous) {
				count++;
			}
			if(count==3) {
				return arr[i];
			}
			previous = arr[i];
			
		}
		return largest;
		
	}
}