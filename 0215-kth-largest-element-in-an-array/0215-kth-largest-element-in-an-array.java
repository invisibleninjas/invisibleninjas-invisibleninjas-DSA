class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        int size = nums.length;
        for(int i = 0; i<size; i++){
            minheap.add(nums[i]);
            if(minheap.size()>k){
                minheap.remove();
            }
        }
        return minheap.peek();
    }
}