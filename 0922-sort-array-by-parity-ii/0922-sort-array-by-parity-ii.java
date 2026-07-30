class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0, right = 1;

        while(left < nums.length && right < nums.length) {
            while(left < nums.length && nums[left] % 2 == 0) {
                left += 2;
            }

            while(right < nums.length && nums[right] %2 != 0) {
                right += 2;
            }

            if(left < nums.length && right < nums.length) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left += 2; 
                right += 2;
            }
        }

        return nums;
    }
}