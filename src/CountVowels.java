import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(countVowels(input));
    }

    public static String countVowels(String input) {
        List<String> vowels = Arrays.asList("a","e","i","o","u");
        String[] chars = input.toLowerCase().split("");
        Map<String, Integer> vowelCount = new HashMap<>();
        for (String c: vowels) {
            vowelCount.put(c, 0);
        }
        for (String c: chars) {
            if (vowels.contains(c)) {
                int count = vowelCount.get(c) + 1;
                vowelCount.put(c, count);
            }
        }

        return String.format("Vowel count:\na = %d\ne = %d\ni = %d\no = %d\nu = %d",
                vowelCount.get("a"),vowelCount.get("e"),vowelCount.get("i"),vowelCount.get("o"),vowelCount.get("u"));
    }
}
