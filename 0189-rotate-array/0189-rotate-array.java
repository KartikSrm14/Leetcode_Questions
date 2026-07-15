class Solution {
    public void rotate(int[] nums, int k) {
        rot(nums,k);
    }

    public static void rot(int[] arr,int k){
        k = k%arr.length;
        fuc(arr,0,arr.length-1);
        fuc(arr,0,k-1);
        fuc(arr,k,arr.length-1);
        }

        public static void fuc(int[] arr, int i, int j){
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
