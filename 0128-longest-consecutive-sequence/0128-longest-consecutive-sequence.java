class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>HashSet = new HashSet<Integer>();
        for(int i = 0;i<nums.length; i++)
        {
            HashSet.add(nums[i]);
        }
        int answer = 0;
        for(int i = 0; i<nums.length; i++){
            if(!HashSet.contains(nums[i] - 1))
            {
                int temp = nums[i];
                int currentlength = 1;
                while(HashSet.contains(temp + 1))
                {
                    currentlength ++;
                    temp ++;
                }
                answer = Math.max(answer,currentlength);
            }
        }
        return answer;
        
    }
}