class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return zoey(image);
    }

    public static int[][] zoey(int[][] arr){

        for(int i=0; i<arr.length; i++){
            int st = 0;
            int end = arr[i].length-1;
            for(int j=0; j<arr[i].length; j++){
                // int st = 0;
                // int end = arr[i].length-1;
                while(st<end){
                    int temp = arr[i][st];
                    arr[i][st] = arr[i][end];
                    arr[i][end] = temp;
                    st++;
                    end--;
                }

                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }
                else if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}