package dsa;

import java.util.*;
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
        // groupWordsByFirstLetterIgnoreCase
        System.out.println(groupWordsByFirstLetterIgnoreCase(Arrays.asList("Apple", "apricot", "Banana", "berry", "Cherry", "cranberry", "Avocado")));
         */

        /*
        // saveWordPositions
        System.out.println(saveWordPositions(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"}));
         */

        /*
        // EvenMultiplicationTable
        printEvenMultiplicationTable();
         */

        // compressString
        System.out.println(compressString("aaabbccccd"));
        System.out.println(compressString("abcd"));
        System.out.println(compressString("aabb"));
        System.out.println(compressString("AAaa"));

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
     * 將清單中每個字串根據**字串首字母（忽略大小寫）**分類，存入一個 Map，
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
