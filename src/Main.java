import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 3, 2, 1, 2, 6, 4, 1, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task1(nums);
        task2Var1(nums);
        task2Var2(nums);
        task3(strings);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2Var1(List<Integer> nums) {
        Set<Integer> even = new TreeSet<>(List.of());
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println(even);
    }

    public static void task2Var2(List<Integer> nums) {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + " ");
                prevNum = num;
            }
        }
        System.out.println();
    }

    public static void task3(List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(List.of());
        uniqueWords.addAll(strings);
        System.out.println(uniqueWords);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> counts = new HashMap<>();
        for (String string : strings) {
            if (counts.containsKey(string)) {
                counts.put(string, counts.get(string) + 1);
            } else {
                counts.put(string, 1);
            }
        }
        for (int num : counts.values()) {
            System.out.print(num + " ");
        }
    }

}