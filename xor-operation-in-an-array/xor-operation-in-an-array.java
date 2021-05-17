class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int [] nums = new int[n];
        for (int i = 0; i < nums.length ; i++) {

            nums[i] = start + 2 * i;
            ans = ans^nums[i];
        }
        return ans;
        
    }
}