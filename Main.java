import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a = "Astronomers!";
        String b = "NO-MORE-STARS";
        System.out.println(areAnagrams(a, b));

    }

    public static boolean areAnagrams(String a, String b) {
        Map<Integer, Integer> letters = new HashMap<>();

        a.toUpperCase().codePoints().filter(Character::isUpperCase)
            .forEach(c -> letters.put(c,letters.getOrDefault(c, 0) + 1));

        b.toUpperCase().codePoints().filter(Character::isUpperCase)
            .forEach( c -> letters.put(c, letters.getOrDefault(c, 0) - 1));

        return !letters.values().stream().anyMatch(c -> c > 0);
    }

}
