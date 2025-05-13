class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
