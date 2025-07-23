package leetCode;

public class LeetCode {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }


    /**
     * 53. Maximum Subarray
     * <p>
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     * <p>
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * <p>
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     * Explanation: The subarray [1] has the largest sum 1.
     * <p>
     * Example 3:
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     * <p>
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        /*
        int res = nums[0];
        for (int j = 0; j < nums.length; j++) {
            int sum = 0;
            for (int i = j; i < nums.length; i++) {
                sum += nums[i];
//                if (sum > res) {
//                    res = sum;
//                }
                res = Math.max(res, sum);
            }
        }

        return res;
         */

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
