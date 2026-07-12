class Solution {
    public int removeDuplicates(int[] nums) {
        return Duplicates(nums);
        
    }
    public static int Duplicates(int[] arr) {
		int k = 0 ;
		for (int i=0; i<arr.length; i++) {
			if(i<arr.length - 1 && arr[i]==arr[i+1]) {
				continue;
			}
			else {
				arr[k] = arr[i];
				k++;
			}
		}
		
		return k;
	}
}