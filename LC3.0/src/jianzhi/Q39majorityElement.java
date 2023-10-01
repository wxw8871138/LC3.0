package jianzhi;

public class Q39majorityElement {
    public int majorityElement(int[] nums) {
        int res = 0;
        int votes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                res = nums[i];
            }
            if (res == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return res;
    }
}