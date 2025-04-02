package weHelpCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        /*
        // 10. 用前一個有效值填滿空字串
        System.out.println(Arrays.toString(ffill(new String[]{"", "a", "", "", "c"})));
        System.out.println(Arrays.toString(ffill(new String[]{"a", "b", "", "c", ""})));
        System.out.println(Arrays.toString(ffill(new String[]{"", "", "a"})));
         */

        /*
        // 11. 找到目標數字所在的索引位置
        System.out.println(findIndex(new int[]{3, 2, 1, 5, 10}, 1));
        System.out.println(findIndex(new int[]{5, 2, 3}, 4));
        System.out.println(findIndex(new int[]{-5, 2, -5, 1, 3}, -5));
         */

        /*
        // 12. 找到目標數字所在的多個索引位置
        System.out.println(Arrays.toString(findIndexes(new int[]{3, 2, 1, 5, 10}, 1)));
        System.out.println(Arrays.toString(findIndexes(new int[]{5, 2, 3}, 4)));
        System.out.println(Arrays.toString(findIndexes(new int[]{-5, 2, -5, 1, -5}, -5)));
         */

        /*
        // 13. 翻轉一個字串
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("abcd"));
        System.out.println(reverseString("Good Job"));
         */

        /*
        // 14. 整數陣列 / 列表中，兩兩相乘的最大值
        System.out.println(findMaxProduct(new int[]{2, -1, 0}));
        System.out.println(findMaxProduct(new int[]{-2, -10, 1, 2}));
        System.out.println(findMaxProduct(new int[]{-3, 1, 9, 4, 5}));
         */

        /*
        // 15. 檢查輸入的密碼是否合乎規範
        System.out.println(checkPassword("abcD"));
        System.out.println(checkPassword("aBcdefg8$"));
        System.out.println(checkPassword("12345678"));
         */

        /*
        // 16. 偶數測試
        System.out.println(checkEven(0));
        System.out.println(checkEven(-7));
        System.out.println(checkEven(102));
         */

        /*
        // 17. 質數測試
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(75));
         */

        /*
        // 18. 將數字用固定小數位數的格式輸出
        System.out.println(formatFloat(0));
        System.out.println(formatFloat(5.4658));
        System.out.println(formatFloat(-3.123));
        System.out.println(formatFloat(100.1));
         */

        /*
        // 19. 計算有幾個英文單字
        System.out.println(countWords("Today is a good day"));
        System.out.println(countWords(" My name is John"));
        System.out.println(countWords(" Good "));
        System.out.println(countWords(" "));
         */

        System.out.println(checkArithmeticSequence(new int[]{3, 2, 1}));
        System.out.println(checkArithmeticSequence(new int[]{0, 0, 0, 0}));
        System.out.println(checkArithmeticSequence(new int[]{-17, -13, -9, -5}));
        System.out.println(checkArithmeticSequence(new int[]{1, 3, 6}));

    }

    /**
     * 20. 檢查是否為等差數列
     * 輸入包含至少三個整數的陣列 / 列表，你的函式能判斷其中的整數是否形成一個等差數列。若是，回傳真，若否，回傳假。
     *
     * 輸入範例一：[3, 2, 1]
     * 回傳：真
     *
     * 輸入範例二：[0, 0, 0, 0]
     * 回傳：真
     *
     * 輸入範例一：[-17, -13, -9, -5]
     * 回傳：真
     *
     * 輸入範例一：[1, 3, 6]
     * 回傳：假
     */
    public static boolean checkArithmeticSequence(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            return false;
        }

        int differ = nums[1] - nums[0];

        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] != differ) {
                return false;
            }
        }

        return true;
    }

    /**
     * 19. 計算有幾個英文單字
     * 輸入一個只包含英文字和空白的字串，你的函式能找出這個字串中有幾個英文單字。
     *
     * 不考慮英文單字是否真的存在，且假設英文單字間用一個空白隔開，字串的前後有可能包含零到多個空白。
     *
     * 輸入範例一："Today is a good day"
     * 回傳：5
     *
     * 輸入範例二：" My name is John"
     * 回傳：4
     *
     * 輸入範例一：" Good "
     * 回傳：1
     *
     * 輸入範例一：" "
     * 回傳：0
     */
    public static int countWords(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

//        String[] strs = str.split(" ");
//        int i = 0;
//        for (String s : strs) {
//            if (!s.isBlank()) {
//                i++;
//            }
//        }

        String[] strs = str.trim().split("\\s+");
        return strs.length;
    }

    /**
     * 18. 將數字用固定小數位數的格式輸出
     * 輸入一個數字，可能是整數或浮點數，你的函式必須將這個數字轉換為固定顯示 2 個小數位數的字串格式。
     *
     * 若輸入的數字超過 2 個小數位數，則以四捨五入處理。
     *
     * 輸入範例：0
     * 回傳：0.00
     *
     * 輸入範例：5.4658
     * 回傳：5.47
     *
     * 輸入範例：-3.123
     * 回傳：-3.12
     *
     * 輸入範例：100.1
     * 回傳：100.10
     */
    public static String formatFloat(double n) {
        return String.format("%2f", n);
    }

    /**
     * 17. 質數測試
     * 輸入一個正整數，若輸入的正整數是質數，回傳真；否則，回傳假。
     * <p>
     * 質數定義：在大於 1 的正整數中，除了 1 和該數自身外，無法被其他正整數整除的數。1 本身非質數。
     * <p>
     * 輸入範例：1
     * 回傳：假
     * <p>
     * 輸入範例：2
     * 回傳：真
     * <p>
     * 輸入範例：75
     * 回傳：假
     */
    public static boolean checkPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        if (n == 2) {
//            return true;
//        }
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 16. 偶數測試
     * 輸入一個整數，若輸入的整數是偶數，回傳真；否則，回傳假。
     * <p>
     * 輸入範例一：0
     * 回傳：真
     * <p>
     * 輸入範例二：-7
     * 回傳：假
     * <p>
     * 輸入範例一：102
     * 回傳：真
     */
    public static boolean checkEven(int n) {
        if (n % 2 == 0) {
            return true;
        }

        return false;
    }

    /**
     * 15. 檢查輸入的密碼是否合乎規範
     * 輸入一個字串代表密碼，你的函式能檢查輸入的字串是否合乎以下規範：
     * <p>
     * 只能包含大小寫英文字母、數字、以及以下特殊符號 ! @ # $ %
     * 至少要包含一個大寫和一個小寫字母
     * 至少要包含一個數字
     * 至少要包含一個特殊符號
     * 必須大於等於 8 個字元、小於等於 16 個字元。
     * 若輸入的密碼符合規範，回傳真值，不符合規範，則回傳假值。
     * <p>
     * 輸入範例一：abcD
     * 回傳：假
     * <p>
     * 輸入範例二：aBcdefg8$
     * 回傳：真
     * <p>
     * 輸入範例一：12345678
     * 回傳：假
     */
    public static boolean checkPassword(String str) {
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%])[a-zA-Z\\d!@#$%]{8,16}";

        if (!str.matches(regex)) {
            return false;
        }

        return true;
    }

    /**
     * 14. 整數陣列 / 列表中，兩兩相乘的最大值
     * 輸入一個至少包含兩個整數的陣列 / 列表，其中可能包含重複的數字if，你的函式能算出並回傳兩兩數字相乘後最大的乘積。
     * <p>
     * 輸入範例一：[2, -1, 0]
     * 回傳：0
     * <p>
     * 輸入範例二：[-2, -10, 1, 2]
     * 回傳：20
     * <p>
     * 輸入範例一：[3, 1, 9, 4, 5]
     * 回傳：45
     */
    public static int findMaxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            }
            if (max1 > num && num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            if (min1 < num && num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }

    /**
     * 13. 翻轉一個字串
     * 輸入一個字串，你的函式能夠翻轉這個字串。
     * <p>
     * 輸入範例一：Hello
     * 回傳：olleH
     * <p>
     * 輸入範例二：abcd
     * 回傳：dcba
     * <p>
     * 輸入範例一：Good Job
     * 回傳：boJ dooG
     */
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * 12. 找到目標數字所在的多個索引位置
     * 輸入一個整數陣列 / 列表和要找的目標數字，你的函式能找到並回傳目標數字所在的零到多個索引位置。
     * <p>
     * 回傳包含多個索引位置的陣列 / 列表，由小到大排列，若目標數字不存在於陣列 / 列表中，回傳空陣列 / 空列表。
     * <p>
     * 輸入範例一：[3, 2, 1, 5, 10]、目標數字 1
     * 回傳：[2]
     * <p>
     * 輸入範例二：[5, 2, 3]、目標數字 4
     * 回傳：[]
     * <p>
     * 輸入範例一：[-5, 2, -5, 1, -5]，目標數字 -5
     * 回傳：[0, 2, 4]
     */
    public static int[] findIndexes(int[] nums, int target) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indexes.add(i);
            }
        }

        if (indexes.isEmpty()) {
            return new int[]{};
        }

        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }

        return result;
    }

    /**
     * 11. 找到目標數字所在的索引位置
     * 輸入一個整數陣列 / 列表和要找的目標數字，你的函式能找到並回傳目標數字所在的索引位置。
     * <p>
     * 若該數字不存在於陣列 / 列表中，回傳 -1；若該數字重複出現多次，以第一個出現的位置為準。
     * <p>
     * 輸入範例一：[3, 2, 1, 5, 10]、目標數字 1
     * 回傳：2
     * <p>
     * 輸入範例二：[5, 2, 3]、目標數字 4
     * 回傳：-1
     * <p>
     * 輸入範例一：[-5, 2, -5, 1, 3]，目標數字 -5
     * 回傳：0
     */
    public static int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 10. 用前一個有效值填滿空字串
     * 輸入一個可能包含空字串的字串陣列 / 列表，你的函式能把陣列 / 列表中的空字串用前一個有效值 ( 非空字串 ) 取代。若沒有前一個有效值，則保持空字串不變。
     * <p>
     * 輸入範例一：["", "a", "", "", "c"]
     * 回傳：["", "a", "a", "a", "c"]
     * <p>
     * 輸入範例二：["a", "b", "", "c", ""]
     * 回傳：["a", "b", "b", "c", "c"]
     * <p>
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
     * <p>
     * 輸入範例一：["Hello", "World", ""]、以及預設值 "test"
     * 回傳：["Hello", "World", "test"]
     * <p>
     * 輸入範例二：["", "ok", ""]、以及預設值 "failed"
     * 回傳：["failed", "ok", "failed"]
     * <p>
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
     * <p>
     * 輸入範例一：最小 2、最大 8、公差 2，計算 2+4+6+8 的總和
     * 回傳：20
     * <p>
     * 輸入範例二：最小 -2、最大 3、公差 1，計算 (-2)+(-1)+0+1+2+3 的總和
     * 回傳：3
     * <p>
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
     * <p>
     * 輸入範例一：[3, 5, -4, 2]
     * 回傳：3,5,-4,2
     * <p>
     * 輸入範例二：[]
     * 回傳：空字串
     * <p>
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
////                sb.append(nums[nums.length-1]);
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
     * <p>
     * 輸入範例一：6 和 4
     * 回傳：12
     * <p>
     * 輸入範例二：5 和 16
     * 回傳：80
     * <p>
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
     * <p>
     * 輸入範例一：6 和 4
     * 回傳：2
     * <p>
     * 輸入範例二：5 和 16
     * 回傳：1
     * <p>
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
     * <p>
     * 輸入範例一：[1, 3, 3, 2, 5, -2]
     * 回傳：3
     * <p>
     * 輸入範例二：[-5, -10, -8, 1, -1]
     * 回傳：-1
     * <p>
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
     * <p>
     * 輸入範例一：[1, 3, 3, 2, 5, -2]
     * 回傳：5
     * <p>
     * 輸入範例二：[-5, -10, -8, -1, -2]
     * 回傳：-1
     * <p>
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
     * <p>
     * 輸入的金額必須是 100 的倍數。
     * 輸入的金額必須大於等於 100。
     * 輸入的金額必須小於等於 100000。
     * 若輸入的金額符合規範，回傳真值，不符合規範，則回傳假值。
     * <p>
     * 輸入範例：30
     * 回傳：假
     * <p>
     * 輸入範例：2000
     * 回傳：真
     * <p>
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
     * <p>
     * 輸入範例一：https://test.com/
     * 回傳：真
     * <p>
     * 輸入範例二：test.com
     * 回傳：假
     * <p>
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
