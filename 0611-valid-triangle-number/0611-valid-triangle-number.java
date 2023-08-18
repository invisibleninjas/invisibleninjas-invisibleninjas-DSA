class Solution {
    public int triangleNumber(int[] nums) {
        int Count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int c = n -1; c >= 2; c--){
            int a = 0;
            int b = c -1;
            while(a<b){
                if(nums[a] + nums[b] > nums[c]){
                    Count = Count +(b-a);
                    b--;
                }
                else{
                    a++;
                }
            }
            
        }
        return Count;
        
    }
}