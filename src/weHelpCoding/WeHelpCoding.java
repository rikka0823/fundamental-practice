package weHelpCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

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

        /*
        // 6. 找到最小公倍數
        System.out.println(findLCM(6, 4));
        System.out.println(findLCM(5, 16));
        System.out.println(findLCM(12, 6));
         */

        /*
        // 7. 將整數陣列 / 列表，轉換為逗號隔開的字串
        System.out.println(toCSVString(new int[]{3, 5, -4, 2}));
        System.out.println(toCSVString(new int[]{}));
        System.out.println(toCSVString(new  int[]{1000}));
         */

        /*
        // 8. 計算等差數列的總和
        System.out.println(sumOfArithmeticSequence(2, 8, 2));
        System.out.println(sumOfArithmeticSequence(-2, 3, 1));
        System.out.println(sumOfArithmeticSequence(10, 14, 3));
         */

        /*
        // 9. 用預設值填滿空字串
        System.out.println(Arrays.toString(fill(new String[]{"Hello", "World", ""}, "test")));
        System.out.println(Arrays.toString(fill(new String[]{"", "ok", ""}, "failed")));
        System.out.println(Arrays.toString(fill(new String[]{"no empty"}, "word")));
         */

        // 10. 用前一個有效值填滿空字串
        System.out.println(Arrays.toString(ffill(new String[]{"", "a", "", "", "c"})));
        System.out.println(Arrays.toString(ffill(new String[]{"a", "b", "", "c", ""})));
        System.out.println(Arrays.toString(ffill(new String[]{"", "", "a"})));
    }

    /**
     * 10. 用前一個有效值填滿空字串
     * 輸入一個可能包含空字串的字串陣列 / 列表，你的函式能把陣列 / 列表中的空字串用前一個有效值 ( 非空字串 ) 取代。若沒有前一個有效值，則保持空字串不變。
     *
     * 輸入範例一：["", "a", "", "", "c"]
     * 回傳：["", "a", "a", "a", "c"]
     *
     * 輸入範例二：["a", "b", "", "c", ""]
     * 回傳：["a", "b", "b", "c", "c"]
     *
     * 輸入範例一：["", "", "a"]
     * 回傳：["", "", "a"]
     */
    public static String[] ffill(String[] words) {
//        if (words == null) {
//            return null;
//        }
//
//        for (int i = 0; i < words.length - 1; i++) {
//            if (words[i + 1].isEmpty() && !words[i].isEmpty()) {
//                words[i + 1] = words[i];
//            }
//        }
//
//        return words;

        for (int i = 1; i < words.length; i++) {
            if (words[i].isEmpty() && !words[i - 1].isEmpty()) {
                words[i] = words[i - 1];
            }
        }
        return words;
    }

    /**
     * 9. 用預設值填滿空字串
     * 輸入一個可能包含空字串的字串陣列 / 列表，以及一個預設值，你的函式能把陣列 / 列表中的空字串用預設值取代。
     *
     * 輸入範例一：["Hello", "World", ""]、以及預設值 "test"
     * 回傳：["Hello", "World", "test"]
     *
     * 輸入範例二：["", "ok", ""]、以及預設值 "failed"
     * 回傳：["failed", "ok", "failed"]
     *
     * 輸入範例一：["no empty"]、以及預設值 "word"
     * 回傳：["no empty"]
     */
    public static String[] fill(String[] words, String value) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                words[i] = value;
            }
        }

        return words;
    }

    /**
     * 8. 計算等差數列的總和
     * 輸入等差數列中最小的整數、最大的整數、以及公差，計算數列中每個數字的總和。可以假設輸入的最大數字一定大於最小數字。
     *
     * 輸入範例一：最小 2、最大 8、公差 2，計算 2+4+6+8 的總和
     * 回傳：20
     *
     * 輸入範例二：最小 -2、最大 3、公差 1，計算 (-2)+(-1)+0+1+2+3 的總和
     * 回傳：3
     *
     * 輸入範例一：最小 10、最大 14、公差 3，計算 10+13 的總和
     * 回傳：23
     */
    public static int sumOfArithmeticSequence(int min, int max, int differ) {
//        if (min > max) {
//            int temp = min;
//            min = max;
//            max = temp;
//        }
//
//        int sum = 0;
//        for (int i = min; i <= max; i += differ) {
//            sum += i;
//        }
//
//        return sum;

        int n = (max - min) / differ + 1;
        return n * (min + max) / 2;
    }

    /**
     * 7. 將整數陣列 / 列表，轉換為逗號隔開的字串
     * 輸入一個整數陣列，你的函式能將其轉換為逗號隔開的單一字串。
     *
     * 輸入範例一：[3, 5, -4, 2]
     * 回傳：3,5,-4,2
     *
     * 輸入範例二：[]
     * 回傳：空字串
     *
     * 輸入範例一：[1000]
     * 回傳：1000
     */
    public static String toCSVString(int[] nums) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < nums.length; i++) {
////            if (i != nums.length - 1) {
////                sb.append(nums[i]).append(",");
////            }
////
////            if (i == nums.length -1) {
////                sb.append(nums[nums.length - 1]);
////            }
//
//            sb.append(nums[i]);
//            if (i < nums.length - 1) {
//                sb.append(",");
//            }
//        }
//
//        if (nums.length == 0) {
//            return "";
//        }
//
//        return sb.toString();

        String str = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        return str;
    }

    /**
     * 6. 找到最小公倍數
     * 輸入兩個正整數，你的函式能找到並回傳這兩個正整數的最小公倍數。
     *
     * 輸入範例一：6 和 4
     * 回傳：12
     *
     * 輸入範例二：5 和 16
     * 回傳：80
     *
     * 輸入範例一：12 和 6
     * 回傳：12
     */
    public static int findLCM(int n1, int n2) {
//        if (n1 == 0 || n2 == 0) {
//            return 0;
//        }
//
//        if (n2 > n1) {
//            int temp = n1;
//            n1 = n2;
//            n2 = temp;
//        }
//
//        if (n1 % n2 == 0) {
//            return n1;
//        }
//
//        int flag = 1;
//        for (int i = 1; i <= n2; i++) {
//            if (n1 % i == 0 & n2 % i == 0) {
//                flag = i;
//            }
//        }
//        if (flag == 1) {
//            return n1 * n2;
//        }

//        return flag * n1 / flag * n2 / flag;
//        return (n1 * n2) / flag;

        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        return Math.abs(n1 * n2) / findGCD(n1, n2);
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
//        if (n2 > n1) {
//            int temp;
//            temp = n2;
//            n2 = n1;
//            n1 = temp;
//        }
//
//        int GCD = 1;
//        if (n1 % n2 == 0) {
//            return n2;
//        }
//        for (int i = 2; i <= n2; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                GCD = i;
//            }
//        }
//
//        return GCD;

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
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
