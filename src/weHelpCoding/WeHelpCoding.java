package weHelpCoding;

import java.util.*;
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

        /*
        // 20. 檢查是否為等差數列
        System.out.println(checkArithmeticSequence(new int[]{3, 2, 1}));
        System.out.println(checkArithmeticSequence(new int[]{0, 0, 0, 0}));
        System.out.println(checkArithmeticSequence(new int[]{-17, -13, -9, -5}));
        System.out.println(checkArithmeticSequence(new int[]{1, 3, 6}));
         */

        /*
        // 21. 最大連續 0 的數量
        System.out.println(findMaxZero(new int[]{1, 1, 1}));
        System.out.println(findMaxZero(new int[]{0, 0, 0, 0, 1, 0}));
        System.out.println(findMaxZero(new int[]{0, 1, 0, 0, 0, 1, 0, 1}));
         */

        /*
        // 22. 平方根，四捨五入取整數
        System.out.println(sqrt(9));
        System.out.println(sqrt(12));
        System.out.println(sqrt(15));
         */

        /*
        // 23. 總秒數轉換為日、時、分、秒
        System.out.println(Arrays.toString(convertSeconds(0)));
        System.out.println(Arrays.toString(convertSeconds(65)));
        System.out.println(Arrays.toString(convertSeconds(7500)));
        System.out.println(Arrays.toString(convertSeconds(100000)));
         */

        /*
        // 24. Stack &#x5806;&#x758A;&#x7684;&#x57FA;&#x672C;&#x64CD;&#x4F5C;
        System.out.println(Arrays.toString(processStackOperations("push 5,push 4,pop")));
        System.out.println(Arrays.toString(processStackOperations("pop,push 1,push -3,push 5,pop,push 10")));
        System.out.println(Arrays.toString(processStackOperations("push 3,push -2,pop,pop,pop")));
         */

        /*
        // 25. Queue 佇列的基本操作
        System.out.println(processQueueOperations("enq 5,enq 4,deq"));
        System.out.println(processQueueOperations("deq,enq 1,enq -3,enq 5,deq,enq 10"));
        System.out.println(processQueueOperations("enq 3,enq -2,deq,deq,deq"));
         */

        /*
        // 26. 檢查整數是否落在某個區間
        System.out.println(isInside(5, 10 ,8));
        System.out.println(isInside(-5, 5, -6));
        System.out.println(isInside(2, 100 , 2));
         */

        /*
        // 27. 檢查兩個區間是否重疊
        System.out.println(isOverlapping(new int[]{5, 10}, new int[]{9, 11}));
        System.out.println(isOverlapping(new int[]{-5, 5}, new int[]{8, 10}));
        System.out.println(isOverlapping(new int[]{-5, 5}, new  int[]{-6, -5}));
         */

        /*
        // 28. 撲克牌比點數大小
        System.out.println(comparePokerFigure("K", "3"));
        System.out.println(comparePokerFigure("J", "Q"));
        System.out.println(comparePokerFigure("2", "A"));
        System.out.println(comparePokerFigure("10", "10"));
         */

        /*
        // 29. 撲克牌比點數、花色大小
        System.out.println(comparePokerCard("KC", "3H"));
        System.out.println(comparePokerCard("JS", "QS"));
        System.out.println(comparePokerCard("2S", "2D"));
        System.out.println(comparePokerCard("10C", "10H"));
         */

        // 30. 二十四小時的推移
        System.out.println(addHours(2, 5));
        System.out.println(addHours(16, 10));
        System.out.println(addHours(1, -5));
        System.out.println(addHours(3, -30));
        System.out.println(addHours(23, 100));


    }

    /**
     * 30. 二十四小時的推移
     * 二十四小時的表示法中，整數 0 ~ 23 代表一天內的小時數。
     *
     * 輸入一個 0 ~ 23 之間的整數，代表目前的小時數；以及一個任意整數，代表小時數的推移量。你的函式能夠計算並回傳經過推移後的小時數 ( 使用二十四小時表示法 )。
     *
     * 輸入範例：2、5
     * 回傳：7
     *
     * 輸入範例：16、10
     * 回傳：2
     *
     * 輸入範例：1、-5
     * 回傳：20
     *
     * 輸入範例：3、-30
     * 回傳：21
     *
     * 輸入範例：23、100
     * 回傳：3
     */
    public static int addHours(int current, int offset) {
        int totalHours = current + offset;

        int time = totalHours % 24;

        if (time < 0) {
            time += 24;
        }

        return time;
    }

    /**
     * 29. 撲克牌比點數、花色大小
     * 假設在一個撲克牌遊戲中，點數由小到大的排序是 2、3、4、...、10、J、Q、K、A。若點數相同，則考慮花色，花色由小到大的排序是 C ( 梅花 )、D ( 方塊 )、H ( 紅心 )、S ( 黑桃 )。
     *
     * 輸入兩個字串，依序代表兩張撲克牌的點數和花色，你的函式可以判斷是否第一張比第二張大，若是，回傳真；否則，回傳假。
     *
     * 輸入範例："KC"、"3H"
     * 回傳：真
     *
     * 輸入範例："JS"、"QS"
     * 回傳：假
     *
     * 輸入範例："2S"、"2D"
     * 回傳：真
     *
     * 輸入範例："10C"、"10H"
     * 回傳：假
     */
    public static boolean comparePokerCard(String c1, String c2) {
        Map<String, Integer> cards = new HashMap<>();
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("4", 4);
        cards.put("5", 5);
        cards.put("6", 6);
        cards.put("7", 7);
        cards.put("8", 8);
        cards.put("9", 9);
        cards.put("10", 10);
        cards.put("J", 11);
        cards.put("Q", 12);
        cards.put("K", 13);
        cards.put("A", 14);

        Map<String, Integer> colors = new HashMap<>();
        colors.put("C", 15);
        colors.put("D", 16);
        colors.put("H", 17);
        colors.put("S", 18);

        String c1Number = c1.substring(0, c1.length() - 1);
        String c2Number = c2.substring(0, c2.length() - 1);
        String c1Color = String.valueOf(c1.charAt(c1.length() - 1));
        String c2Color = String.valueOf(c2.charAt(c2.length() - 1));

        if (cards.get(c1Number) > cards.get(c2Number)) {
            return true;
        }

        if (cards.get(c1Number) == cards.get(c2Number) &&
                colors.get(c1Color) > colors.get(c2Color)) {
            return true;
        }

        return  false;
    }

    /**
     * 28. 撲克牌比點數大小
     * 假設在一個撲克牌遊戲中，不考慮花色，點數由小到大的排序是 2、3、4、...、10、J、Q、K、A。
     *
     * 輸入兩個字串，依序代表兩張撲克牌的點數，你的函式可以判斷是否第一張比第二張大，若是，回傳真；否則，回傳假。
     *
     * 輸入範例："K"、"3"
     * 回傳：真
     *
     * 輸入範例："J"、"Q"
     * 回傳：假
     *
     * 輸入範例："2"、"A"
     * 回傳：假
     *
     * 輸入範例："10"、"10"
     * 回傳：假
     */
    public static boolean comparePokerFigure(String f1, String f2) {
        Map<String, Integer> cards = new HashMap<>();
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("4", 4);
        cards.put("5", 5);
        cards.put("6", 6);
        cards.put("7", 7);
        cards.put("8", 8);
        cards.put("9", 9);
        cards.put("10", 10);
        cards.put("J", 11);
        cards.put("Q", 12);
        cards.put("K", 13);
        cards.put("A", 14);

        return cards.get(f1) > cards.get(f2);
    }

    /**
     * 27. 檢查兩個區間是否重疊
     * 輸入兩個陣列 / 列表，分別代表兩個整數區間的最小值和最大值 [min1, max1] 和 [min2, max2]，你的函式能判斷兩個整數區間是否重疊，包含最小或最大值落在同一個整數的狀況。
     *
     * 可以假設每個區間的最大值一定大於最小值。
     *
     * 輸入範例：[5, 10]，[9, 11]
     * 回傳：真
     *
     * 輸入範例：[-5, 5]，[8, 10]
     * 回傳：假
     *
     * 輸入範例：[-5, 5]，[-6, -5]
     * 回傳：真
     */
    public static boolean isOverlapping(int[] range1, int[] range2) {
        int min1 = range1[0];
        int max1 = range1[1];
        int min2 = range2[0];
        int max2 = range2[1];

       return !(max2 < min1 || min2 > max1);
    }

    /**
     * 26. 檢查整數是否落在某個區間
     * 輸入一個整數區間的最小值和最大值，以及要檢查的目標數，你的函式能判斷目標數是否落在最小值和最大值的中間，包含最小和最大值。
     *
     * 可以假設輸入的最大值一定大於最小值。
     *
     * 輸入範例：最小 5，最大 10，目標 8
     * 回傳：真
     *
     * 輸入範例：最小 -5，最大 5，目標 -6
     * 回傳：假
     *
     * 輸入範例：最小 2，最大 100，目標 2
     * 回傳：真
     */
    public static boolean isInside(int min, int max, int target) {
//        if (min > max) {
//            int temp = min;
//            min = max;
//            max = temp;
//        }
//
//        if (!(target >= min && target <= max)) {
//            return false;
//        }
//
//        return true;

        return target >= min && target <= max;
    }

    /**
     * 25. Queue 佇列的基本操作
     * Queue 佇列是一種基礎資料結構，我們使用陣列 / 列表來實作時，定義 Enq (Enqueue) 操作，代表將資料放到陣列 / 列表的尾巴；定義 Deq (Dequeue) 操作，代表將資料從陣列 / 列表的前面取出。
     *
     * 輸入一個逗號隔開的字串，每個欄位代表一個操作，若是 Enq (Enqueue) 操作，會空一格後表示要操作的整數資料。你的函式必須使用陣列 / 列表實作一個 Queue，回傳經過輸入的操作之後產生的最終結果。
     *
     * 請注意最後放進 Queue 中的資料是整數的型態。
     *
     * 輸入範例："enq 5,enq 4,deq"
     * 回傳：[4]
     *
     * 輸入範例："deq,enq 1,enq -3,enq 5,deq,enq 10"
     * 回傳：[-3, 5, 10]
     *
     * 輸入範例："enq 3,enq -2,deq,deq,deq"
     * 回傳：[]
     */
    public static List<Integer> processQueueOperations(String ops) {
        String[] strs = ops.split(",");
        Deque<Integer> deque = new ArrayDeque<>();

        for (String str : strs) {
            if (str.trim().startsWith("enq")) {
                deque.add(Integer.parseInt(str.substring(3).trim()));
            }

            if (!deque.isEmpty() && str.trim().equals("deq")) {
                deque.remove();
            }
        }

        return new ArrayList<>(deque);
    }

    /**
     * 24. Stack 堆疊的基本操作
     * Stack 堆疊是一種基礎資料結構，我們使用陣列 / 列表來實作時，定義 Push 操作，代表將資料放到陣列 / 列表的尾巴；定義 Pop 操作，代表將資料從陣列 / 列表的尾巴取出。
     *
     * 輸入一個逗號隔開的字串，每個欄位代表一個操作，若是 Push 操作，會空一格後表示要操作的整數資料。你的函式必須使用陣列 / 列表實作一個 Stack，回傳經過輸入的操作之後產生的最終結果。
     *
     * 請注意最後放進 Stack 中的資料是整數的型態。
     *
     * 輸入範例："push 5,push 4,pop"
     * 回傳：[5]
     *
     * 輸入範例："pop,push 1,push -3,push 5,pop,push 10"
     * 回傳：[1, -3, 10]
     *
     * 輸入範例："push 3,push -2,pop,pop,pop"
     * 回傳：[]
     */
    public static int[] processStackOperations(String ops) {
        String[] strs = ops.split(",");
        Stack<Integer> stack = new Stack<>();

        for (String str : strs) {
            if (str.trim().startsWith("push")) {
                stack.push(Integer.parseInt(str.substring(4).trim()));
            }

            if (!stack.isEmpty() && str.trim().equals("pop")) {
                stack.pop();
            }
        }

        int[] array = stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return array;
    }

    /**
     * 23. 總秒數轉換為日、時、分、秒
     * 輸入一個非負整數代表一段時間的總秒數，請將這個總秒數轉換為：日、時、分、秒，四個欄位，按照順序用陣列 / 列表的格式輸出。
     *
     * 輸入範例：0
     * 回傳：[0, 0, 0, 0]
     *
     * 輸入範例：65
     * 回傳：[0, 0, 1, 5]
     *
     * 輸入範例：7500
     * 回傳：[0, 2, 5, 0]
     *
     * 輸入範例：100000
     * 回傳：[1, 3, 46, 40]
     */
    public static int[] convertSeconds(int sec) {
        int i = 5 / sec;
        if (sec < 0) {
            return null;
        }

        int secondsInDay = 24 * 60 * 60;
        int secondsInHour = 60 * 60;
        int secondsInMinute = 60;

        int days = sec / secondsInDay;
        int remainMinutes = sec % secondsInDay;

        int hours = remainMinutes / secondsInHour;
        remainMinutes %= secondsInHour;

        int minutes = remainMinutes / secondsInMinute;

        int secs = remainMinutes % secondsInMinute;

        return new int[]{days, hours, minutes, secs};
    }

    /**
     * 22. 平方根，四捨五入取整數
     * 輸入一個正整數，你的函式可以計算這個正整數的平方根，但請四捨五入到整數的部份。
     *
     * 輸入範例二：9
     * 回傳：3
     *
     * 輸入範例一：12
     * 回傳：12
     *
     * 輸入範例一：15
     * 回傳：4
     */
    public static int sqrt(int n) {
//        return Integer.parseInt(String.format("%.0f", Math.sqrt(n)));
        return (int) Math.round(Math.sqrt(n));
    }

    /**
     * 21. 最大連續 0 的數量
     * 輸入一個只包含 0 和 1 的陣列 / 列表，你的函式要找出並回傳最大連續 0 的數量。
     *
     * 輸入範例二：[1, 1, 1]
     * 回傳：0
     *
     * 輸入範例一：[0, 0, 0, 0, 1, 0]
     * 回傳：4
     *
     * 輸入範例一：[0, 1, 0, 0, 0, 1, 0, 1]
     * 回傳：3
     */
    public static int findMaxZero(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
               count++;
            }

            if (nums[i] != 0) {
//                if (count > maxCount) {
//                    maxCount = count;
//                }
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

//        if (count > maxCount) {
//            maxCount = count;
//        }
        maxCount = Math.max(maxCount, count);


        return maxCount;
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
        return String.format("%.2f", n);
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
