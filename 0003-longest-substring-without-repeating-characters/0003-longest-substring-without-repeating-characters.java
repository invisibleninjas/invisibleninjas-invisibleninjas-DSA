class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int start = -1;
        char s1[] = s.toCharArray();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0; i<s1.length;i++){
            if(!map.containsKey(s1[i])){
                map.put(s1[i],-1);
            }
            start = Math.max(start,map.get(s1[i]));
            map.put(s1[i],i);
            ans = Math.max(ans,i-start);
        }
        return ans;
        
    }
}