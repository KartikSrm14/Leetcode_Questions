class Solution {
    public int maxProfit(int[] prices) {
        return stock(prices);
    }

    	public static int stock(int[] arr) {
		int min = arr[0];
        int max =0;
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(arr[i] - min > max){
                max = arr[i] - min;
            }
        }
        return max; 
	}
}