package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {

    public static void main(String[] args) {
        /*
        // 53. Maximum Subarray
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
         */

        // 1. Two Sum
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }


    /**
     * 1. Two Sum
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     *
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        /*
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{j, i};
                }
            }
        }
         */

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
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
