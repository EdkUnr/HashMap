import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Заданный список чисел
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        // Заданный список слов
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        // Печать только нечетных чисел
        System.out.println("Нечетные числа:");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        // Печать уникальных четных чисел в порядке возрастания
        System.out.println("\nУникальные четные числа в порядке возрастания:");
        Set<Integer> uniqueEvenNums = new HashSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNums.add(num);
            }
        }
        List<Integer> sortedUniqueEvenNums = new ArrayList<>(uniqueEvenNums);
        sortedUniqueEvenNums.sort(null);
        for (int num : sortedUniqueEvenNums) {
            System.out.println(num);
        }

        // Печать всех уникальных слов
        System.out.println("\nУникальные слова:");
        Set<String> uniqueWords = new HashSet<>(strings);
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Печать количества дублей для каждого уникального слова
        System.out.println("\nКоличество дублей для каждого уникального слова:");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(count);
        }
    }
}
