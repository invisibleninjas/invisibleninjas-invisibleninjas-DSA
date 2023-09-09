class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int i =0, j= arr.length - 1;
        while(j-i+1>k){
            if(Math.abs(x - arr[i]) > Math.abs(x - arr[j])){
                i++;
            }
            else if(Math.abs(x-arr[i]) <= Math.abs(x - arr[j])){
                j--;
            }
        }
        for(k = i; k<=j; k++){
            ans.add(arr[k]);
        }
        return ans;
    }
        
    
}