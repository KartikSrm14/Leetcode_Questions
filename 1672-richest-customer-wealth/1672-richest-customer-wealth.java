class Solution {
    public int maximumWealth(int[][] accounts) {
        return zoo(accounts);
    }

    public static int zoo(int[][] arr){
        int max_wealth = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            max_wealth = Math.max(sum,max_wealth);
        }
        return max_wealth;
    }
}