class Solution {
    public int[] twoSum(int[]arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <high){
            if(arr[low] + arr[high] == target){
                return new int []{low+1, high+1};
            }
            if((arr[low] + arr[high]) > target){
                high --;
            }
            else{
                low ++;
            }
        }
        return new int []{-1,-1};
    }
}