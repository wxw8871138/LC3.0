package jianzhi;

public class Q21Exchange {
    public int[] exchange(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 == 1) {
                swap(nums, slow, fast);
                slow++;
            }
            fast++;
        }
        return nums;
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
