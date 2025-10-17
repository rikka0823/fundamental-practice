package dsa;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DSA {

    public static void main(String[] args) {
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

        /*
        // 找出陣列中最常出現的元素
        System.out.println(findMode(new int[]{1, 2, 2, 3, 3, 3, 4}));
         */

        /*
        // 找出陣列中出現次數最多的前 K 個元素
        System.out.println(findKMostFrequentElements(new int[]{1, 1, 1, 2, 2, 3}, 2));
         */

        /*
        // 找出陣列中出現次數最多的元素並計算其出現次數
        System.out.println(getElementWithHighestFrequency(new int[]{4, 5, 6, 4, 5, 5}));
         */

        /*
        // 找出陣列中出現次數最多的元素並移除它
        System.out.println(removeMostFrequentElement(new int[]{1, 1, 2, 2, 2, 3}));
         */

        /*
        // 找出陣列中出現次數最多的元素的索引
        System.out.println(indexOfMostFrequentElement(new int[]{1, 3, 3, 2, 3, 1}));
         */

        /*
        // 找出出現次數最多的元素，並計算其出現次數差
        System.out.println(findMostFrequentElementDiff(new int[]{1, 1, 2, 3, 3, 3}));
         */

        /*
        // solid / outline triangle
        printTriangle();
         */

        /*
        // 合併兩個已排序的數字列表
        System.out.println(mergeSortedLists(List.of(1, 2, 5), List.of(2, 4, 6)));
         */

        /*
        // 移除重複並排序字串（不區分大小寫）
        System.out.println(toLowercaseSortedList(List.of("Banana", "apple", "Orange", "banana", "APPLE")));
         */

        /*
        // 找出出現次數最多的字串（頻率最高）
        System.out.println(mostFrequentWord(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple")));
        System.out.println(mostFrequentWord(Arrays.asList("cat", "dog", "dog", "cat", "mouse")));
        System.out.println(mostFrequentWord(Arrays.asList("zzz", "aaa", "zzz", "aaa")));
         */

        /*
        // findMostFrequentElement
        System.out.println(findMostFrequentElement(Arrays.asList(3, 1, 4, 4, 2, 1, 4)));
        System.out.println(findMostFrequentElement(Arrays.asList(1, 1, 4, 4, 2, 1, 4)));
         */

        /*
        // 找出缺少的整數
        System.out.println(findMissingNumbers(Arrays.asList(1, 2, 4, 6)));
        System.out.println(findMissingNumbers(Arrays.asList(1, 2, 3, 4, 5)));
         */

        /*
        // 找出重複出現的元素
        System.out.println(findDuplicates(Arrays.asList(1, 2, 3, 2, 4, 5, 1, 1)));
        System.out.println(findDuplicates(Arrays.asList(5, 6, 7, 8)));
         */

        /*
        // 找出第一個重複出現的數字
        System.out.println(findFirstDuplicate(Arrays.asList(4, 1, 3, 2, 5, 3, 2)));
        System.out.println(findFirstDuplicate(Arrays.asList(1, 2, 3, 4)));
         */

        /*
        // 找出第一個只出現一次的數字
        System.out.println(findFirstUnique(Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2)));
        System.out.println(findFirstUnique(Arrays.asList(1, 2, 2, 1)));
         */

        /*
        // 刪除 List 中的重複元素
        System.out.println(removeDuplicatesPreserveOrder(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape")));
         */

        /*
        // 整數 List 中找出所有偶數，並排序回傳
        System.out.println(getSortedEvenNumbers(Arrays.asList(5, 2, 8, 1, 3, 10, 6)));
         */

        /*
        // 找出大於平均值的數字
        System.out.println(filterGreaterThanAverage(Arrays.asList(10, 20, 30, 40, 50)));
         */

        /*
        // 依字首分組並統計數量（不區分大小寫）
        System.out.println(countByFirstLetter(Arrays.asList("apple", "banana", "Avocado", "Blueberry", "123", "", null, "apricot")));
         */

        /*
        // 找交集
        System.out.println(getIntersection("Alice,Bob,Charlie,diana", "bob,Diana,Edward"));
         */

        /*
        // 將清單中每個字串根據字串首字母分類
        System.out.println(groupWordsByFirstLetterIgnoreCase(Arrays.asList("Apple", "apricot", "Banana", "berry", "Cherry", "cranberry", "Avocado")));
         */

        /*
        // 接收一個字串陣列，儲存每個單字出現的位置索引。
        System.out.println(saveWordPositions(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"}));
         */

        /*
        // 九九乘法表（條件過濾版）
        printEvenMultiplicationTable();
         */

        /*
        // 統計學生成績
        List<Map<String, Object>> studentScoreList = List.of(
                Map.of("name", "Alice", "score", 90),
                Map.of("name", "Bob", "score", 80),
                Map.of("name", "alice", "score", 70),
                Map.of("name", "Bob", "score", 85),
                Map.of("name", "Charlie", "score", 60)
        );
        System.out.println(computeAverageScores(studentScoreList));
         */

        /*
        // 找出最常出現的字串（Java Stream）
        System.out.println(mostFrequentWordByStream(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple")));
         */

        /*
        // 移除清單中出現次數超過 K 次的元素
        System.out.println(removeElementsAppearingMoreThanKTimes(Arrays.asList(1,2,3,1,2,1,2,3), 2));
        System.out.println(removeElementsAppearingMoreThanKTimes(Arrays.asList(5,5,5,5,5), 3));
        System.out.println(removeElementsAppearingMoreThanKTimes(Arrays.asList(10,20,10,30,40,10,20), 2));
         */

        /*
        // 找出最多出現的字串對組合
        System.out.println(mostFrequentBigram(new String[]{"the", "quick", "brown", "fox", "quick", "brown", "fox"}));
        System.out.println(mostFrequentBigram(new String[]{"a", "b", "a", "b", "a", "b"}));
         */

        /*
        // Filter Words Containing a Substring
        System.out.println(filterWordsContainingKeyword(Arrays.asList("Apple", "banana", "application", "grape", "Pineapple"), "app"));
        System.out.println(filterWordsContainingKeyword(Arrays.asList("Dog", "Cat", "mouse", "MoUsepad"), "mouse"));
        System.out.println(filterWordsContainingKeyword(Arrays.asList("", " ", "abc", "ABC"), "a"));
        System.out.println(filterWordsContainingKeyword(new ArrayList<>(), "a"));
        System.out.println(filterWordsContainingKeyword(Arrays.asList("test", "Test", "TEST"), "TeSt"));
         */

        /*
        // 移除相鄰重複字元
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
         */

        /*
        // Join Unique Lowercase Words
        System.out.println(joinUniqueLowercaseWords(new String[]{"Apple", "", "Banana", "apple", "banana", "CHERRY"}, "-"));
        System.out.println(joinUniqueLowercaseWords(new String[]{"JAVA", null, "Python", "", "python", "Go"}, ","));
        System.out.println(joinUniqueLowercaseWords(new String[]{"", "", "ONLY", null}, "|"));
         */

        /*
        // 擷取訂單編號
        System.out.println(extractOrderId("Thank you for your purchase. Order ID: AB1234. We will process it soon."));
        System.out.println(extractOrderId("Order received. Your Order ID: XY789 is now being processed."));
        System.out.println(extractOrderId("Reminder: Order ID: 2023XYZ Please make the payment."));
         */

        /*
        // 檢查字串開頭與結尾是否相同
        System.out.println(isSameStartAndEnd("abxxxxab"));
        System.out.println(isSameStartAndEnd("ab1234ba"));
        System.out.println(isSameStartAndEnd("hellohl"));
        System.out.println(isSameStartAndEnd("abab"));
        System.out.println(isSameStartAndEnd("a"));
         */

        /*
        // 轉換字串中的數字字樣成數字符號
        System.out.println(convertNumberWords("I have one apple and two bananas"));
        System.out.println(convertNumberWords("zero is not included"));
        System.out.println(convertNumberWords("fivefourthreesix"));
        System.out.println(convertNumberWords("no number here"));
         */

        /*
        // 計算每個字出現次數
        System.out.println(countWords(List.of("apple", "banana", "apple", "orange", "banana", "apple")));
         */

        /*
        // sortWordsByFrequency
        System.out.println(sortWordsByFrequency(List.of("apple", "banana", "apple", "orange", "banana", "apple", "orange")));
        System.out.println(sortWordsByFrequency(List.of("dog", "cat", "cat", "dog", "dog", "rabbit")));
         */

        /*
        // countCharacters
        System.out.println(countCharacters("Hello, World!"));
         */

        System.out.println(reverseWords("Hello World"));
    }

    /**
     * 題目：反轉字串中的每個單詞
     *
     * 描述：
     * 給定一個字符串 s，其中包含由空格分隔的單詞。請寫一個 Java 函數來反轉字符串中的每個單詞，但保持單詞的順序不變。
     *
     * 例如：
     * 輸入："Hello World"
     * 輸出："olleH dlroW"
     *
     * 額外要求：
     * 不可以使用內建的 reverse() 方法或其他輔助庫。
     * 請編寫 reverseWords(String s) 方法，並對其進行測試。
     *
     * 提示：
     * 你需要逐一反轉每個單詞。
     * 可以使用 split(" ") 方法將字符串分割成單詞數組，然後反轉每個單詞。
     */
    public static String reverseWords(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException();
        }

        String[] strings = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < strings.length; j++) {
            for (int i = strings[j].length() - 1; i >= 0; i--) {
                sb.append(strings[j].charAt(i));
            }
            if (j < strings.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    /**
     * 題目：統計字串中每個字元出現的次數
     *
     * 題目描述：
     * 請你寫一個 Java 類別 CharCounter，它有一個靜態方法：
     * 此方法會接收一個字串 input，回傳一個 Map，其中包含每個字元（不區分大小寫）的出現次數。
     * 忽略所有非英文字母（a-z, A-Z 以外的字元不計入統計）。
     * 統計時大小寫視為相同字母（例如 'A' 和 'a' 視為同一個字母）。
     * 回傳的 Map 中的 key 為轉換成小寫後的字母。
     *
     * "Hello, World!"
     * ->{d=1, e=1, h=1, l=3, o=2, r=1, w=1}
     */
    public static Map<Character, Integer> countCharacters(String input) {
        if (input == null || input.isBlank()) {
            return new HashMap<>();
        }

        /*
        Map<Character, Integer> map = new TreeMap<>();
        Pattern pattern = Pattern.compile("[A-Za-z]");
        String str = input.toLowerCase();
        for (char c : str.toCharArray()) {
            if (pattern.matcher(String.valueOf(c)).matches()) {
                map.merge(c, 1, Integer::sum);
            }
        }\
         */

        Map<Character, Integer> map = new TreeMap<>();
        String str = input.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.merge(c, 1, Integer::sum);
            }
        }

        return map;
    }

    /**
     * 題目：按頻率排序字串
     * 此方法接收一個字串的 List<String>，然後返回一個 按頻率降序排列 的字串 List。如果有多個字串出現相同的次數，則按字典順序排序。
     *
     * 實作要求：
     * 使用 Map 來記錄每個字串的出現次數。
     * 使用 List 來存放最終的結果，並將字串按照頻率降序排列。如果頻率相同，則按照字典順序排列。
     * 結果中字串的順序應該符合要求。
     *
     * List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple", "orange");
     *
     * sortWordsByFrequency(input)
     * // 輸出: ["apple", "banana", "orange"]
     *
     * List<String> input2 = List.of("dog", "cat", "cat", "dog", "dog", "rabbit");
     *
     * sortWordsByFrequency(input2)
     * // 輸出: ["dog", "cat", "rabbit"]
     *
     * 限制與要求：
     * 不能直接使用排序方法（例如：Collections.sort()），需要手動處理排序。
     * 必須先使用 Map 記錄頻率，再進行排序。
     * 頻率相同的字串需要按字典順序排列。
     */
    public static List<String> sortWordsByFrequency(List<String> words) {
        if (words == null || words.isEmpty()) {
            return new ArrayList<>();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(
                Comparator.comparing(Map.Entry<String, Integer>::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey)
        );

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entryMap : list) {
            res.add(entryMap.getKey());
        }

        return res;
    }

    /**
     * 題目：計算每個字出現次數
     *
     * 此方法接收一個字串的 List<String>，例如：["apple", "banana", "apple", "orange", "banana", "apple"]
     * 請回傳一個 Map<String, Integer>，其中 key 是字串，value 是它出現的次數。
     *
     * List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple");
     *
     * 回傳：
     * {
     *   "apple" : 3,
     *   "banana": 2,
     *   "orange": 1
     * }
     *
     * 限制與要求：
     * 必須使用 Map 來記錄結果
     * 使用 if 判斷 key 是否已存在
     * 不可以使用 Map.merge() 或 Map.getOrDefault()（if-else）
     * 大小寫視為不同（"Apple" 和 "apple" 視為兩個字）
     */
    public static Map<String, Integer> countWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer value = map.get(word);
            if (value == null) {
                map.put(word, 1);
            } else {
                map.put(word, value + 1);
            }
        }

        return map;
    }

    /**
     * 題目：轉換字串中的數字字樣成數字符號
     *
     * 此方法接收一個字串 str，其中可能包含英文的數字字樣（像是 "one", "two", ..., "nine"），請將它們替換成對應的數字字符（'1' ~ '9'），然後回傳轉換後的字串。
     *
     *convertNumberWords("I have one apple and two bananas")
     * → "I have 1 apple and 2 bananas"
     *
     * convertNumberWords("zero is not included")
     * → "zero is not included"  // 不處理 zero
     *
     * convertNumberWords("fivefourthreesix")
     * → "5436"
     *
     * convertNumberWords("no number here")
     * → "no number here"
     *
     */
    public static String convertNumberWords(String str) {
        if (str == null || str.isBlank()) {
            return "";
        }

        Map<String, String> map = Map.of(
                "one", "1",
                "two", "2",
                "three", "3",
                "four", "4",
                "five", "5",
                "six", "6",
                "seven", "7",
                "eight", "8",
                "nine", "9"
                );

        for (String num : map.keySet()) {
            str = str.replace(num, map.get(num));
        }

        return str;
    }

    /**
     * 題目：檢查字串開頭與結尾是否相同
     *
     * 接收一個字串 str，如果該字串長度大於等於2，且開頭的兩個字元與結尾的兩個字元相同，則回傳 true，否則回傳 false。
     *
     * isSameStartAndEnd("abxxxxab") → true
     * isSameStartAndEnd("ab1234ba") → false
     * isSameStartAndEnd("hellohl")  → false
     * isSameStartAndEnd("abab")     → true
     * isSameStartAndEnd("a")        → false  // 長度不夠
     */
    public static boolean isSameStartAndEnd(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 題目：擷取訂單編號
     * <p>
     * 題目描述：
     * 請撰寫一個 Java 方法 extractOrderId(String message)，從傳入的訊息中擷取訂單編號。
     * 每段訊息都包含一個訂單編號，格式為 "Order ID: XXXX"，其中 XXXX 是由英文字母與數字組成的訂單編號。
     * <p>
     * input1 = "Thank you for your purchase. Order ID: AB1234. We will process it soon."
     * input2 = "Order received. Your Order ID: XY789 is now being processed."
     * input3 = "Reminder: Order ID: 2023XYZ. Please make the payment."
     * <p>
     * output1 = "AB1234"
     * output2 = "XY789"
     * output3 = "2023XYZ"
     * <p>
     * 如果找不到訂單編號，請回傳 null。
     * 請處理前後可能有不同的標點符號（如 .、,、空格等）。
     * 不可使用正規表達式
     *
     */
    public static String extractOrderId(String message) {
        String orderId;
        String keyWord = "Order ID: ";

        int startIndex = message.indexOf(keyWord);
        if (startIndex == -1) {
            return null;
        }

        startIndex += keyWord.length();
        int endIndex = message.length();
        int endIndexOfSpace = message.indexOf(" ", startIndex);
        int endIndexOfDot = message.indexOf(".", startIndex);
        int endInxOfComma = message.indexOf(",", startIndex);

        if (endIndexOfSpace == -1 && endIndexOfDot == -1 && endInxOfComma == -1) {
            return message.substring(startIndex, endIndex);
        }

        if (endIndexOfDot != -1 && endIndexOfDot != message.length() -1) {
            endIndex = endIndexOfDot;
        } else if (endInxOfComma != -1) {
            endIndex = endInxOfComma;
        } else {
            endIndex = endIndexOfSpace;
        }

        orderId = message.substring(startIndex, endIndex);

        return orderId;
    }

    /**
     * 題目：Join Unique Lowercase Words
     * <p>
     * 給定一個字串陣列 words 和一個分隔符號字串 delimiter，請實作一個方法，回傳以下處理後的結果：
     * 1.移除陣列中的空字串（""）。
     * 2.將所有字串轉為小寫。
     * 3.移除重複的字串（保留第一次出現的順序）。
     * 4.用 delimiter 將結果合併成一個字串（使用 String.join()）。
     * <p>
     * Input: words = ["Apple", "", "Banana", "apple", "banana", "CHERRY"], delimiter = "-"
     * Output: "apple-banana-cherry"
     * <p>
     * Input: words = ["JAVA", "java", "Python", "", "python", "Go"], delimiter = ","
     * Output: "java,python,go"
     * <p>
     * Input: words = ["", "", "ONLY"], delimiter = "|"
     * Output: "only"
     *
     */
    public static String joinUniqueLowercaseWords(String[] words, String delimiter) {
        if (words == null || words.length == 0 || delimiter == null) {
            throw new IllegalArgumentException();
        }

        Set<String> newWords = new LinkedHashSet<>();

        for (String word : words) {
            if (word != null && !word.isBlank()) {
                newWords.add(word.toLowerCase());
            }
        }

        return String.join(delimiter, newWords);
    }

    /**
     * 題目：移除相鄰重複字元
     * <p>
     * 給定一個只包含小寫字母的字串 s，當字串中有兩個相鄰且相同的字元時，將這兩個字元刪除，並重複這個操作直到無法刪除為止。
     * 請你回傳最終剩下的字串。如果最後字串為空，則回傳空字串 ""。
     * <p>
     * Input: "abbaca"
     * Output: "ca"
     * Explanation:
     * "abbaca" → "a**bb**aca" → "aaca" → "a**a**ca" → "ca"
     * <p>
     * Input: "azxxzy"
     * Output: "ay"
     * Explanation:
     * "azxxzy" → "az**xx**zy" → "azzy" → "a**zz**y" → "ay"
     *
     */
    public static String removeDuplicates(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException();
        }

        Stack<Character> resStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!resStack.isEmpty() && resStack.peek() == c) {
                resStack.pop();
            } else {
                resStack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for (char c : resStack) {
            res.append(c);
        }

        return res.toString();
    }

    /**
     * 題目：Filter Words Containing a Substring
     * <p>
     * 給定一個字串陣列 words 和一個關鍵字 keyword，請使用 Java Stream API 過濾出所有包含 keyword 的字串（不區分大小寫），並回傳一個新的 List<String>，結果需按照原本輸入的順序保留。
     * <p>
     * 輸入：
     * List<String> words：一個包含多個字串的列表。
     * String keyword：要搜尋的子字串。
     * <p>
     * Input:
     * words = ["Apple", "banana", "application", "grape", "Pineapple"]
     * keyword = "app"
     * Output:
     * ["Apple", "application", "Pineapple"]
     * <p>
     * ["Dog", "Cat", "mouse", "MoUsepad"], keyword = "mouse" → ["mouse", "MoUsepad"]
     * ["", " ", "abc", "ABC"], keyword = "a" → ["abc", "ABC"]
     * [], keyword = "a" → []
     * ["test", "Test", "TEST"], keyword = "TeSt" → ["test", "Test", "TEST"]
     *
     */
    public static List<String> filterWordsContainingKeyword(List<String> words, String keyword) {
        if (words == null || keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return words.stream()
                .filter(word -> word.toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * 題目：找出最多出現的字串對組合
     * <p>
     * 給定一個字串陣列 words，請找出在這些字串中，**兩兩相鄰字串組合（bigram）**中出現頻率最高的組合。
     * <p>
     * 一個「字串組合」定義為 words[i] + " " + words[i+1]。請找出所有出現次數最多的組合，若有多個，請回傳字典序最小的一個。
     * <p>
     * 輸入格式：
     * words 是一個字串陣列，長度範圍為 2 <= len(words) <= 10^5
     * <p>
     * 每個字串長度為 1 <= len(words[i]) <= 20
     * <p>
     * 所有字串皆只包含小寫英文字母 'a' 到 'z'
     * <p>
     * 範例：
     * Input: words = ["the", "quick", "brown", "fox", "quick", "brown", "fox"]
     * Output: "quick brown"
     */
    public static String mostFrequentBigram(String[] words) {
        if (words == null || words.length == 0) {
            throw new IllegalArgumentException();
        }

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            String key = words[i] + " " + words[i + 1];
            map.merge(key, 1, Integer::sum);
        }

        String res = null;
        int frequent = 0;
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > frequent) {
                frequent = value;
                res = key;
            }
        }

        return res;
    }

    /**
     * 題目：移除清單中出現次數超過 K 次的元素
     * <p>
     * 給定一個整數清單 nums 和一個整數 k，請你移除所有在清單中出現次數超過 k 次的元素，並回傳處理後的新清單，保持原來的順序。
     * <p>
     * 輸入參數：
     * nums: 一個整數清單（1 <= nums.length <= 10^4, 每個數字範圍為 -10^4 <= nums[i] <= 10^4）
     * <p>
     * k: 一個整數，代表最大允許的重複次數（1 <= k <= 10^4）
     * <p>
     * 輸出：
     * 一個新的 List<Integer>，移除了所有出現超過 k 次的數字，並保留剩下的數字的原順序。
     * <p>
     * Input: nums = [1,2,3,1,2,1,2,3], k = 2
     * Output: [3,3]
     * <p>
     * 解釋：
     * - 1 出現了 3 次 → 超過 k = 2 → 移除所有的 1
     * - 2 出現了 3 次 → 超過 k = 2 → 移除所有的 2
     * - 3 出現了 2 次 → 保留
     */
    public static List<Integer> removeElementsAppearingMoreThanKTimes(List<Integer> nums, int k) {
        if (nums == null || k < 0 || nums.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
//            if (map.get(num) > k) {
//                continue;
//            }
//            res.add(num);
            if (map.get(num) <= k) {
                res.add(num);
            }
        }

        return res;
    }

    /**
     * 題目：找出最常出現的字串（Java Stream）
     * 給定一個 List<String>，其中包含一些重複的字串，請使用 Java Stream API，找出出現次數最多的字串。
     * <p>
     * 若有多個字串出現次數相同，請回傳字典順序最小的那一個。
     * 輸入：
     * List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
     * <p>
     * 輸出：
     * apple
     * <p>
     * 限制條件：
     * 必須使用 Java Stream API 處理（不能用 for 迴圈）。
     */
    public static String mostFrequentWordByStream(List<String> words) {
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(
                Comparator.comparing(Map.Entry<String, Integer>::getValue)
                        .reversed()
                        .thenComparing(Map.Entry<String, Integer>::getKey)
        );

        return sortedList.get(0).getKey();
    }

    /**
     * 題目：統計學生成績
     * 說明：
     * 請你寫一段 Java 程式，讀入一組學生的成績資料，使用 Map<String, List<Integer>> 結構儲存每位學生的成績，並計算每位學生的平均分數，最後輸出結果。
     * <p>
     * 輸入資料格式；
     * [
     * {"name": "Alice", "score": 90},
     * {"name": "Bob", "score": 80},
     * {"name": "Alice", "score": 70},
     * {"name": "Bob", "score": 85},
     * {"name": "Charlie", "score": 60}
     * ]
     * <p>
     * 輸出：
     * 計算並印出每個學生的平均成績。
     * 學生名稱不重複區分大小寫（"alice" 與 "Alice" 為同一人）。
     * 輸出學生時依照平均成績從高到低排序。
     */
    public static Map<String, Double> computeAverageScores(List<Map<String, Object>> studentScoreList) {
        if (studentScoreList == null || studentScoreList.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Map<String, List<Integer>> scoresMap = new HashMap<>();
        for (Map<String, Object> studentScore : studentScoreList) {
            String key = (String) studentScore.get("name");
            String name = key.substring(0, 1).toUpperCase() + key.substring(1).toLowerCase();
            int score = (Integer) studentScore.get("score");
            scoresMap.computeIfAbsent(name, k -> new ArrayList<>()).add(score);
        }

        Map<String, Double> res = new HashMap<>();
        for (Map.Entry<String, List<Integer>> listEntry : scoresMap.entrySet()) {
            int sum = 0;
            for (int score : listEntry.getValue()) {
                sum += score;
            }
            Double average = (double) sum / listEntry.getValue().size();
            res.put(listEntry.getKey(), average);
        }

        List<Map.Entry<String, Double>> list = new ArrayList<>(res.entrySet());
//        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        list.sort(Comparator.comparing(Map.Entry<String, Double>::getValue).reversed());
        Map<String, Double> sortedRes = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : list) {
            sortedRes.put(entry.getKey(), entry.getValue());
        }

        return sortedRes;
    }

    /**
     * 題目：字串壓縮器（String Compressor）
     * 請撰寫一個 Java 方法 compressString(String input)，這個方法會壓縮連續重複出現的字元。例如：
     * <p>
     * "aaabbccccd" → "a3b2c4d1"
     * <p>
     * "abcd" → "a1b1c1d1"
     * <p>
     * "aabb" → "a2b2"
     * <p>
     * 要求：
     * 若壓縮後的字串長度沒有變短，請回傳原本的字串。
     * 大小寫視為不同字元（例如 'A' 和 'a' 不一樣）
     * <p>
     * compressString("aaabbccccd") → "a3b2c4d1"
     * compressString("abcd") → "abcd"   // 因為壓縮後是 "a1b1c1d1"，比原字串長
     * compressString("aabb") → "a2b2"
     * compressString("AAaa") → "A2a2"
     * 。
     */
    public static String compressString(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1))
                        .append(count);
                count = 1;
            }
        }
        sb.append(input.charAt(input.length() - 1))
                .append(count);

        if (sb.length() > input.length()) {
            return input;
        }

        return sb.toString();
    }

    /**
     * 題目：九九乘法表（條件過濾版）
     * 列印出 1 到 9 的九九乘法表，但只印出乘積為 偶數 的項目。
     */
    public static void printEvenMultiplicationTable() {
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                if (j * i % 2 == 0) {
                    System.out.print(j + " x " + i + " = " + j * i + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * 題目：
     * 請設計一個方法，接收一個字串陣列，儲存每個單字出現的位置索引。
     * <p>
     * 範例：
     * String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
     * 輸出:
     * apple -> [0, 2, 5]
     * banana -> [1, 4]
     * orange -> [3]
     */
    public static Map<String, List<Integer>> saveWordPositions(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.computeIfAbsent(strs[i], k -> new ArrayList<>()).add(i);
        }

        return map;
    }

    /**
     * 題目：
     * 接收一個字串清單 words。
     * 將清單中每個字串根據字串首字母（忽略大小寫）**分類，存入一個 Map，
     * Key 是字串首字母（小寫字元），
     * Value 是該首字母對應的所有字串集合（Set），
     * 集合內字串要保持原始大小寫。
     * 回傳這個 Map。
     * <p>
     * 輸入：
     * ["Apple", "apricot", "Banana", "berry", "Cherry", "cranberry", "Avocado"]
     * <p>
     * 輸出：
     * {
     * 'a' : ["Apple", "apricot", "Avocado"],
     * 'b' : ["Banana", "berry"],
     * 'c' : ["Cherry", "cranberry"]
     * }
     */
    public static Map<Character, Set<String>> groupWordsByFirstLetterIgnoreCase(List<String> words) {
        Map<Character, Set<String>> map = new LinkedHashMap<>();
//        Set<Character> set = new TreeSet<>();
//
//        for (String word : words) {
//            set.add(word.toLowerCase().charAt(0));
//        }
//
//        for (char c : set) {
//            Set<String> values = new LinkedHashSet<>();
//            for (String word : words) {
//                if (c == word.toLowerCase().charAt(0)) {
//                    values.add(word);
//                }
//            }
//            map.put(c, values);
//        }

        for (String word : words) {
            map.computeIfAbsent(word.toLowerCase().charAt(0), k -> new LinkedHashSet<>()).add(word);
        }

        return map;
    }

    /**
     * 題目：找交集
     * 從兩組學生名單，找出兩位老師課程都選修的學生（交集），並印出學生名單（依照字母順序）。
     * <p>
     * 讀入兩個學生名單（每組資料用逗號分隔，學生名字不重複，英文名字，不區分大小寫但輸出需統一轉為小寫）。
     * 印出交集的學生名單，依照字母排序後印出。
     * <p>
     * A 的學生名單：
     * Alice,Bob,Charlie,diana
     * <p>
     * 老師 B 的學生名單：
     * bob,Diana,Edward
     * <p>
     * 輸出:
     * [bob, diana]
     */
    public static Set<String> getIntersection(String name1, String name2) {
        if (name1 == null || name1.isBlank() || name2 == null || name2.isBlank()) {
            throw new IllegalArgumentException();
        }

        Set<String> set1 = new TreeSet<>(Arrays.asList(name1.toLowerCase().split(",")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(name2.toLowerCase().split(",")));
//        Set<String> res = new TreeSet<>();
//
//        for (String str : set1) {
//            if (!set2.contains(str)) {
//                res.add(str);
//            }
//        }

//        return res;

        set1.retainAll(set2);

        return set1;
    }

    /**
     * 題目：依字首分組並統計數量（不區分大小寫）
     * 描述：
     * 請寫一個方法，接收一個 List<String>，回傳一個 Map<Character, Integer>，統計每個「開頭字母（a-z）」開頭的字串有幾個（不區分大小寫）。
     * <p>
     * 忽略開頭不是英文字母的字串（例如數字、符號）
     * <p>
     * 忽略 null 或空字串
     * <p>
     * 統一以小寫英文字母當作 key
     * <p>
     * 輸入：
     * ["apple", "banana", "Avocado", "Blueberry", "123", "", null, "apricot"]
     * <p>
     * 輸出：
     * {a=3, b=2}
     */
    public static Map<Character, Integer> countByFirstLetter(List<String> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Map<Character, Integer> map = new HashMap<>();
        for (String str : input) {
            if (str != null && !str.isBlank()) {
                char c = str.toLowerCase().charAt(0);
                if (c >= 'a' && c <= 'z') {
                    map.merge(c, 1, Integer::sum);
                }
            }
        }

        return map;
    }

    /**
     * 題目：找出大於平均值的數字
     * 描述：
     * 請寫一個方法，接收一個 List<Integer>，回傳一個新的 List<Integer>，其中包含所有大於平均值的整數（平均值為浮點數，取所有數字的總和除以個數）。
     * <p>
     * 輸入：
     * [10, 20, 30, 40, 50]
     * 平均值為 30，輸出：
     * [40, 50]
     */
    public static List<Integer> filterGreaterThanAverage(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        double average = (double) sum / input.size();

        List<Integer> list = new ArrayList<>();
        for (int i : input) {
            if (i > average) {
                list.add(i);
            }
        }

        return list;
    }

    /**
     * 題目：從整數 List 中找出所有偶數，並排序回傳
     * 描述：
     * 請寫一個方法，接收一個 List<Integer>，回傳一個新的 List<Integer>，其中包含原始 List 中所有的偶數，並且按照從小到大的順序排序。
     * 輸入：
     * [5, 2, 8, 1, 3, 10, 6]
     * 輸出：
     * [2, 6, 8, 10]
     */
    public static List<Integer> getSortedEvenNumbers(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<Integer> list;
//        for (int num : input) {
//            if (num % 2 == 0) {
//                list.add(num);
//            }
//        }
//
//        Collections.sort(list);

        list = input.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        return list;
    }

    /**
     * 題目：刪除 List 中的重複元素
     * 描述：
     * 給定一個 ArrayList<String>，其中包含一些可能重複的字串，請寫一個方法，回傳一個不包含重複元素的新 ArrayList<String>，且保留原本的元素順序（第一次出現的順序）。
     * 輸入：
     * ["apple", "banana", "apple", "orange", "banana", "grape"]
     * 輸出：
     * ["apple", "banana", "orange", "grape"]：
     */
    public static List<String> removeDuplicatesPreserveOrder(List<String> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

//        List<String> list = new ArrayList<>();
//        for (String str : input) {
//            if (!list.contains(str)) {
//                list.add(str);
//            }
//        }

        return new ArrayList<>(new LinkedHashSet<>(input));
    }

    /**
     * 題目：找出第一個只出現一次的數字
     * 請實作一個方法 findFirstUnique，給定一個 List<Integer>，找出第一個只出現一次的數字，並回傳它。如果所有數字都重複，請回傳 -1。
     * <p>
     * 輸入： [4, 5, 1, 2, 0, 4, 1, 2]
     * 輸出： 5
     * <p>
     * 輸入： [1, 2, 2, 1]
     * 輸出： -1
     * <p>
     * 限制條件：
     * 可使用 Map 或 Set
     * 請保留「原始順序」
     * 若無唯一數字，回傳 -1
     */
    public static int findFirstUnique(List<Integer> nums) {
        int res = -1;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        for (int key : map.keySet()) {
            if (map.get(key).equals(1)) {
                return key;
            }
        }

        return res;
    }

    /**
     * 題目：找出第一個重複出現的數字
     * 請實作一個方法 findFirstDuplicate，輸入一個 List<Integer>，找出第一個出現兩次的數字，並回傳它。
     * 輸入： [4, 1, 3, 2, 5, 3, 2]
     * 輸出： 3   // 3 是第一個「第二次出現」的數字
     * <p>
     * 輸入： [1, 2, 3, 4]
     * 輸出： -1  // 沒有任何重複
     * <p>
     * 限制條件：
     * 不可使用 Map
     * 可使用 Set
     * 若沒有重複，請回傳 -1
     */
    public static int findFirstDuplicate(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }

        return -1;
    }

    /**
     * 題目：找出重複出現的元素
     * 請實作一個方法 findDuplicates，給定一個 List<Integer>，請回傳其中所有出現過兩次以上的數字（順序不限、不重複列出）。
     * 範例 1：
     * 輸入： [1, 2, 3, 2, 4, 5, 1, 1]
     * 輸出： [1, 2]
     * <p>
     * 範例 2：
     * 輸入： [5, 6, 7, 8]
     * 輸出： []
     * <p>
     * 限制條件：
     * 回傳的 list 不需排序
     * 不可使用 Map
     * 可使用 Set
     */
    public static List<Integer> findDuplicates(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException();
        }

//        int count = 0;
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.size(); i++) {
//            for (int j = i + 1; j < nums.size(); j++) {
//                if (nums.get(i).equals(nums.get(j))) {
//                    count++;
//                }
//
//                if (count == 1) {
//                    set.add(nums.get(i));
//                    count = 0;
//                    break;
//                }
//            }
//        }
//
//        return new ArrayList<>(set);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums) {
            if (!set1.add(num)) {
                set2.add(num);
            }
        }

        return new ArrayList<>(set2);
    }

    /**
     * 題目：找出缺少的整數
     * 請實作一個方法 findMissingNumbers，輸入為一個遞增排序但有缺漏的 List<Integer>，內容包含 1 到 n（n 是最大數字），但中間可能漏了一些數字。
     * <p>
     * 請找出所有缺少的整數，並以 List<Integer> 回傳，數字需由小到大排序。
     * 輸入： [1, 2, 4, 6]
     * 輸出： [3, 5]
     * <p>
     * 輸入： [1, 2, 3, 4, 5]
     * 輸出： []
     */
    public static List<Integer> findMissingNumbers(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // O(n^2)
//        List<Integer> res = new ArrayList<>();
//        int max = Collections.max(nums);
//
//        for (int i = 1; i <= max; i++) {
//            if (!nums.contains(i)) {
//                res.add(i);
//            }
//        }

        // O(n)
//        List<Integer> res = new ArrayList<>();
//        int i = 1;
//        int index = 0;
//
//        while (i <= nums.get(nums.size() - 1)) {
//            if (index < nums.size() && nums.get(index).equals(i)) {
//                index++;
//            } else {
//                res.add(i);
//            }
//            i++;
//        }

        // O(n)
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>(nums);
        for (int i = 1; i <= Collections.max(nums); i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

    /**
     * 題目：
     * 給定一個 List<Integer>，請編寫一個方法來找出並返回這個列表中出現頻率最高的元素。如果有多個元素頻率相同，請返回其中最小的元素。你不能使用額外的資料結構來儲存頻率。
     * 輸入：
     * List<Integer> nums = Arrays.asList(3, 1, 4, 4, 2, 1, 4);
     * 輸出：
     * 4
     * 要求：
     * 不允許使用 Map 或其他額外的資料結構來儲存頻率。
     * 必須使用 List 本身的功能來解決問題。
     */
    public static int findMostFrequentElement(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int mode = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int j = 0; j < nums.size(); j++) {
            int current = nums.get(j);
            int count = 0;

            for (int num : nums) {
                if (num == current) {
                    count++;
                }
            }

            if (count > maxCount || (current < mode && count == maxCount)) {
                maxCount = count;
                mode = current;
            }
        }

        return mode;
    }

    /**
     * 找出出現次數最多的字串（頻率最高）
     * 給定一個 List<String>，請找出出現次數最多的字串。如果有多個字串的出現次數相同，請回傳字典序最小的那一個字串。
     * 輸入：
     * ["apple", "banana", "apple", "orange", "banana", "apple"]
     * 輸出：
     * "apple"
     */
    public static String mostFrequentWord(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        int maxCount = 0;
        String mostFrequentWord = null;
        for (String word : map.keySet()) {
            int count = map.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        return mostFrequentWord;
    }

    /**
     * 移除重複並排序字串（不區分大小寫）
     * 請實作一個方法 processList(List<String> input)，輸入是一個字串清單。請你完成以下任務：
     * <p>
     * 移除重複的字串，不區分大小寫（例如 "Apple" 和 "apple" 視為相同）。
     * <p>
     * 將結果以字典順序（不區分大小寫）排序。
     * <p>
     * 若大小寫版本都存在，優先保留小寫版本。
     * <p>
     * 若某個字只出現一次，無論原本是大寫還是小寫，請將其轉為小寫加入結果。
     * <p>
     * 回傳一個處理後的新清單，不可修改原始輸入 List。
     * <p>
     * 限制條件
     * 輸入 List 長度範圍：0 <= input.size() <= 10^4
     * <p>
     * 每個字串僅包含英文字母 A-Z 或 a-z
     * <p>
     * 回傳結果需全部為小寫字母，且不能有重複字串
     * <p>
     * 結果需按照字典順序（lexicographical order）排列
     * 輸入：
     * ["Banana", "apple", "Orange", "banana", "APPLE"]
     * 輸出：
     * ["apple", "banana", "orange"]
     */
    public static List<String> toLowercaseSortedList(List<String> input) {
        if (input == null || input.isEmpty()) {
            return List.of();
        }

        Set<String> set = new TreeSet<>();
        for (String str : input) {
            set.add(str.toLowerCase());
        }

        return List.of(set.toArray(new String[0]));
    }

    /**
     * 合併兩個已排序的數字列表
     * 給定兩個已經排序的整數列表 list1 和 list2，請編寫一個方法將它們合併成一個新的列表，並且保持結果列表的順序也是排序的。
     * 輸入：
     * 兩個已經排序的 List<Integer>，其中 list1 和 list2 可能有不同的長度，且每個元素都滿足 -10^6 <= element <= 10^6。
     * <p>
     * 輸出：
     * 返回一個新的 List<Integer>，該列表包含 list1 和 list2 中的所有元素，並且保持排序。
     */
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        /*
        List<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);
        Collections.sort(list);
        return list;
         */

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }

        return list;
    }

    public static void printTriangle() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("請輸入階層數: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException();
            }

            /*
            // solid
            for (int j = 1; j <= n; j++) {
                for (int k = j; k <= n - 1; k++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= j * 2 - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
             */

            // outline
//            for (int j = 1; j <= n; j++) {
//                if (j != n) {
//                    for (int k = j; k <= n - 1; k++) {
//                        System.out.print(" ");
//                    }
//
//                    for (int i = 1; i <= j * 2 - 1; i++) {
//                        if (i == 1 || i == j * 2 - 2) {
//                            System.out.print("*");
//                        }
//                        System.out.print(" ");
//                    }
//                    System.out.println();
//                }
//
//                if (j == n) {
//                    for (int i = 1; i <= j * 2 - 1; i++) {
//                        System.out.print("*");
//                    }
//                }
//            }

            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    if (j == 1 || i == n || j == i * 2 - 1) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 找出出現次數最多的元素，並計算其出現次數差
     * 題目描述：
     * <p>
     * 給定一個整數陣列 nums，找出出現次數最多的元素與出現次數最少的元素的出現次數差。
     * <p>
     * 範例：
     * <p>
     * 輸入: nums = [1, 1, 2, 3, 3, 3]
     * 輸出: 2 (3 出現了 3 次，1 出現了 2 次，差為 1)
     */
    public static int findMostFrequentElementDiff(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            maxCount = Math.max(maxCount, map.get(num));
        }

        for (int count : map.values()) {
            minCount = Math.min(minCount, count);
        }

        return maxCount - minCount;
    }

    /**
     * 找出陣列中出現次數最多的元素的索引
     * 題目描述：
     * <p>
     * 給定一個整數陣列 nums，找出出現次數最多的元素，並返回該元素第一次出現的位置索引。
     * <p>
     * 範例：
     * <p>
     * 輸入: nums = [1, 3, 3, 2, 3, 1]
     * 輸出: 1 (元素 3 最多，第一次出現的索引是 1)
     */
    public static int indexOfMostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            maxCount = Math.max(map.get(num), maxCount);
        }

        int maxKey = nums[0];
        for (int num : nums) {
            if (map.get(num) == maxCount) {
                maxKey = num;
                break;
            }
        }

        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxKey) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * 找出陣列中出現次數最多的元素並移除它
     * 題目描述：
     * <p>
     * 給定一個整數陣列 nums，找出陣列中出現次數最多的元素，然後將該元素從陣列中移除。返回處理後的陣列。
     * <p>
     * 範例：
     * <p>
     * 輸入: nums = [1, 1, 2, 2, 2, 3]
     * 輸出: [1, 1, 3]
     */
    public static List<Integer> removeMostFrequentElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;

        for (int num : nums) {
            list.add(num);
            int count = map.merge(num, 1, Integer::sum);
            maxCount = Math.max(count, maxCount);
        }

        int finalMaxCount = maxCount;
        list.removeIf(item -> map.get(item) == finalMaxCount);

        return list;
    }

    /**
     * 找出陣列中出現次數最多的元素並計算其出現次數
     * 題目描述：
     * <p>
     * 給定一個整數陣列 nums，找出其中出現次數最多的元素，並返回這個元素的值以及它出現的次數。
     * <p>
     * 範例：
     * <p>
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
     * <p>
     * 給定一個整數陣列 nums 和一個整數 k，返回陣列中出現次數最多的 k 個元素，按出現次數降序排列。如果有多個元素出現次數相同，則可以按數字大小排序。
     * <p>
     * 範例：
     * <p>
     * 輸入: nums = [1, 1, 1, 2, 2, 3], k = 2
     * 輸出: [1, 2]
     * <p>
     * 提示：
     * <p>
     * k 小於或等於 nums 的長度。
     * <p>
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
     * <p>
     * 給定一個整數陣列 nums，找出其中出現次數最多的元素。如果有多個元素的出現次數相同，則返回其中任意一個。
     * <p>
     * 範例：
     * <p>
     * 輸入: nums = [1, 2, 2, 3, 3, 3, 4]
     * 輸出: 3
     * <p>
     * 提示：
     * <p>
     * 你可以假設陣列至少有一個元素。
     */
    public static int findMode(int[] nums) {
        if (nums == null || nums.length == 0) {
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

//        int mode = nums[0];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.merge(num, 1, Integer::sum);
//            if (map.get(num) > map.get(mode)) {
//                mode = num;
//            }
//        }

        return mode;
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
}
