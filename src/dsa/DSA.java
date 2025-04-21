package dsa;

import java.util.*;

public class DSA {

    public static void main(String[] args) {
        /*
        // 找出陣列中最常出現的元素
        System.out.println(findMode(new int[]{1, 2, 2, 3, 3, 3, 4}));
         */

        /*
        // 找出陣列中出現次數最多的前 K 個元素
        System.out.println(findKMostFrequentElements(new int[]{1, 1, 1, 2, 2, 3}, 2));
         */

        // 找出陣列中出現次數最多的元素並計算其出現次數
        System.out.println(getElementWithHighestFrequency(new int[]{4, 5, 6, 4, 5, 5}));

        /*
        // bubbleSort
        int[] nums = new int[]{5, 4, 3, 2, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
         */

        /*
        // selectionSort
        int[] nums = new int[]{5, 4, 3, 2, 1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
         */
    }

    public static void selectionSort(int[] nums) {
        for (int k = 0; k < nums.length - 1; k++) {
            int j = k;
            for (int i = k + 1; i < nums.length; i++) {
                if (nums[i] < nums[j]) {
                    j = i;
                }
            }

            if (j != k) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void bubbleSort(int[] nums) {
        for (int j = nums.length - 1; j > 0; j--) {
            boolean flag = false;
            for (int i = 0; i < j; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    /**
     * 找出陣列中出現次數最多的元素並計算其出現次數
     * 題目描述：
     *
     * 給定一個整數陣列 nums，找出其中出現次數最多的元素，並返回這個元素的值以及它出現的次數。
     *
     * 範例：
     *
     * 輸入: nums = [4, 5, 6, 4, 5, 5]
     * 輸出: 5 出現次數: 3
     */
    public static Map<Integer, Integer> getElementWithHighestFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

//        int maxCount = -1;
//        int maxKey = Integer.MIN_VALUE;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int count = entry.getValue();
//            if (count > maxCount) {
//                maxCount = count;
//                maxKey = entry.getKey();
//            }
//        }
//
//        return Map.of(maxKey, maxCount);

        int maxCount = Collections.max(map.values());
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count == maxCount) {
                result.put(entry.getKey(), count);
            }
        }

        return result;
    }

    /**
     * 找出陣列中出現次數最多的前 K 個元素
     * 題目描述：
     *
     * 給定一個整數陣列 nums 和一個整數 k，返回陣列中出現次數最多的 k 個元素，按出現次數降序排列。如果有多個元素出現次數相同，則可以按數字大小排序。
     *
     * 範例：
     *
     * 輸入: nums = [1, 1, 1, 2, 2, 3], k = 2
     * 輸出: [1, 2]
     *
     * 提示：
     *
     * k 小於或等於 nums 的長度。
     *
     * 你可以假設 nums 不會為空。
     */
    public static List<Integer> findKMostFrequentElements(int[] nums, int k) {
        if (k > nums.length || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> {
            int i = entry2.getValue().compareTo(entry1.getValue());
            if (i != 0) {
                return i;
            }
            return Integer.compare(entry1.getKey(), entry2.getKey());
        });

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(entryList.get(i).getKey());
        }

        return list;
    }

    /**
     * 找出陣列中最常出現的元素
     * 題目描述：
     *
     * 給定一個整數陣列 nums，找出其中出現次數最多的元素。如果有多個元素的出現次數相同，則返回其中任意一個。
     *
     * 範例：
     *
     * 輸入: nums = [1, 2, 2, 3, 3, 3, 4]
     * 輸出: 3
     *
     * 提示：
     *
     * 你可以假設陣列至少有一個元素。
     */
    public static int findMode(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException();
        }

        int mode = Integer.MIN_VALUE;
        int maxCount = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            int count = map.get(num);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        return mode;
    }
}
