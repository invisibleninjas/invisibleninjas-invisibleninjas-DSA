class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int a[] = new int[n];
        Arrays.fill (a,1);  // All array elements will be 1
        for(int i = 1; i < n; i++){ // forward Pass
            if(ratings[i] > ratings[i-1]){
                a[i] = a[i-1] + 1;
            }

        }
        for( int i = n-2; i>=0; i--){ // Backward Pass
            if(ratings[i] > ratings[i+1]){
                a[i] = Math.max(a[i], a[i+1]+1);
            }
        }
        int sum = 0;
        for(int i =0; i<n; i++){
            sum = sum +a[i];
        }
        return sum;
    }
}