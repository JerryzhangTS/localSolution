package leetCode;

import java.util.*;

public class stackSolution {
    static boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        boolean result = true;
        Set<Character> leftCharacter = new HashSet<>();
        leftCharacter.add('(');
        leftCharacter.add('[');
        leftCharacter.add('{');
        Map<Character, Character> leftRightCharacterMap = new HashMap<>();
        leftRightCharacterMap.put('(', ')');
        leftRightCharacterMap.put('[', ']');
        leftRightCharacterMap.put('{', '}');
        Stack<Character> tempStr = new Stack<>();
        int index = 0;
        while (result && index < s.length()) {
            if (leftCharacter.contains(s.charAt(index))) {
                tempStr.push(s.charAt(index++));
            } else if (!tempStr.empty() && s.charAt(index) == leftRightCharacterMap.get(tempStr.pop())) {
                index++;
            } else {
                result = false;
            }
        }
        return result && tempStr.empty();
    }
}
