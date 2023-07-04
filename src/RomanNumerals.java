import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public String intToRoman(int n) {

        // Map of roman numerals and their integer values
        Map<Integer, String> romans = new LinkedHashMap<>();

        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");

        StringBuilder result = new StringBuilder();

        // Iterate through the map, appending the roman numeral to the result string
        for (int key : romans.keySet()) {
            while (n >= key) {
                result.append(romans.get(key));
                n -= key;
            }
        }

        return result.toString();
    }

    public int romanToInt(String s) {

        // Map of roman numerals and their integer values
        Map<Character, Integer> integers = new HashMap<>();

        integers.put('I', 1);
        integers.put('V', 5);
        integers.put('X', 10);
        integers.put('L', 50);
        integers.put('C', 100);
        integers.put('D', 500);
        integers.put('M', 1000);

        int result = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {

            // If the current roman numeral is less than the next, subtract it from the result
            if ((i + 1 < s.length()) && (integers.get(s.charAt(i)) < integers.get(s.charAt(i+1)))) {
                result -= integers.get(s.charAt(i));
                // Otherwise, add it to the result
            } else {
                result += integers.get(s.charAt(i));
            }
        }
        return result;
    }
}