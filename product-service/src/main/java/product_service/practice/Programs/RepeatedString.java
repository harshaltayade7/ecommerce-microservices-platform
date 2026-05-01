package product_service.practice.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedString {
    String inputString;

    public RepeatedString(String inputString) {
        this.inputString = inputString;
    }

    public Character firstRepeatedCharacter() {
        Set<Character> seen = new HashSet<>();
        for(char c : inputString.toCharArray()) {
            if(seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return  null;
    }

    public Character lastRepeatedCharacter() {
        Set<Character> seen = new HashSet<>();
        for(int i= inputString.length()-1; i>=0; i--) {
            char c = inputString.charAt(i);
            if(seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return null;
    }

    public Map<Character , Integer> getRepeatedCharacters() {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return freq.entrySet().stream().filter(s-> s.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
