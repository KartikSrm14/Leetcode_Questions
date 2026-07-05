class Solution {
    public int heightChecker(int[] heights) {
        return check(heights);
    }

    public static int check(int[] arr) {
		int[] expected = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			expected[i] = arr[i]; 
		}
		Arrays.sort(expected);
		int count =0 ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != expected[i]) {
				count++;
			}
		}
		return count;
	}
}