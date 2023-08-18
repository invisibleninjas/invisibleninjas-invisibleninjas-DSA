class Solution {
    public String removeStars(String s) {
        int j = 0;
        char[] arr = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(arr[i] =='*'){
                j--;
            }
            else{
                arr[j] = arr[i];
                j++;
            }
        }
        return new String(arr,0,j);
        
    }
}