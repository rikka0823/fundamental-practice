package weHelpCoding;

import java.util.Arrays;

// https://wehelp.tw/coding
public class WeHelpCoding {

    public static void main(String[] args) {
        /*
        // 1. 檢查字串是否以 https:// 開頭
        System.out.println(checkHTTPS("https://test.com/"));
        System.out.println(checkHTTPS("test.com"));
        System.out.println(checkHTTPS("HTTPs://test.com/"));
         */

        /*
        // 2. 檢查輸入的領取金額是否合乎規範
        System.out.println(checkMoney(30));
        System.out.println(checkMoney(2000));
        System.out.println(checkMoney(6150));
         */

        /*
        // 3. 找到最大的整數
        System.out.println(findMax(new int[]{1, 3, 3, 2, 5, -2}));
        System.out.println(findMax(new int[]{-5, -10, -8, -1, -2}));
        System.out.println(findMax(new int[]{0, 2, 2}));
         */

        /*
        // 4. 找到第二大的整數
        System.out.println(findSecond(new int[]{1, 3, 3, 2, 5, -2}));
        System.out.println(findSecond(new int[]{-5, -10, -8, 1, -1}));
        System.out.println(findSecond(new int[]{0, 2}));
        System.out.println(findSecond(new int[]{5, 5, 3, 2}));
         */

        /*
        // 5. 找到最大公因數
        System.out.println(findGCD(6, 4));
        System.out.println(findGCD(5, 16));
        System.out.println(findGCD(12, 6));
         */

    }

    /**
     * 5. 找到最大公因數
     * 輸入兩個正整數，你的函式能找到並回傳這兩個正整數的最大公因數。
     *
     * 輸入範例一：6 和 4
     * 回傳：2
     *
     * 輸入範例二：5 和 16
     * 回傳：1
     *
     * 輸入範例一：12 和 6
     * 回傳：6
     */
    public static int findGCD(int n1, int n2) {
        if (n2 > n1) {
            int temp;
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        int GCD = 1;
        if (n1 % n2 == 0) {
            return n2;
        }
        for (int i = 2; i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
            }
        }

        return GCD;
    }

    /**
     * 4. 找到第二大的整數
     * 輸入包含至少兩個不同整數的陣列 / 列表，找到並回傳其中第二大的整數。
     *
     * 輸入範例一：[1, 3, 3, 2, 5, -2]
     * 回傳：3
     *
     * 輸入範例二：[-5, -10, -8, 1, -1]
     * 回傳：-1
     *
     * 輸入範例一：[0, 2]
     * 回傳：0
     */
    public static int findSecond(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length - 2];

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                second = max;
                max = num;
            }

            if (max > num && num > second) {
                second = num;
            }
        }

        return second;
    }

    /**
     * 3. 找到最大的整數
     * 輸入包含至少一個整數的陣列 / 列表，找到並回傳其中最大的整數。
     *
     * 輸入範例一：[1, 3, 3, 2, 5, -2]
     * 回傳：5
     *
     * 輸入範例二：[-5, -10, -8, -1, -2]
     * 回傳：-1
     *
     * 輸入範例一：[0, 2, 2]
     * 回傳：2
     */
    public static int findMax(int[] nums) {
        // O(n log n)
//        Arrays.sort(nums);
//
//        return nums[nums.length - 1];

        // O(n)
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    /**
     * 2. 檢查輸入的領取金額是否合乎規範
     * 輸入一個正整數代表想要從 ATM 機領取的金額，你的函式能檢查輸入的金額是否合乎以下規範：
     *
     * 輸入的金額必須是 100 的倍數。
     * 輸入的金額必須大於等於 100。
     * 輸入的金額必須小於等於 100000。
     * 若輸入的金額符合規範，回傳真值，不符合規範，則回傳假值。
     *
     * 輸入範例：30
     * 回傳：假
     *
     * 輸入範例：2000
     * 回傳：真
     *
     * 輸入範例：6150
     * 回傳：假
     */
    public static boolean checkMoney(int amount) {
//        if (amount < 100 || amount > 100000) {
//            return false;
//        }
//
//        if (amount % 100 != 0) {
//            return false;
//        }
//
//        return true;

         return amount >= 100 && amount <= 100000 && amount % 100 == 0;
    }

    /**
     * 1. 檢查字串是否以 https:// 開頭
     * 輸入一個字串，你的函式能檢查該字串是否以 https:// 開頭，不考慮大小寫。若是以 https:// 開頭，回傳真值，否則回傳假值。
     *
     * 輸入範例一：https://test.com/
     * 回傳：真
     *
     * 輸入範例二：test.com
     * 回傳：假
     *
     * 輸入範例一：HTTPs://test.com/
     * 回傳：真
     */
    public static boolean checkHTTPS(String str) {
        if (str == null || str.isBlank()) {
            return false;
        }

       return str.toLowerCase().startsWith("https://");
    }
}
