package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RomaNumber {
    static String intToRoman(int num) {
        HashMap<Integer, String> unitMap = new HashMap<>();
        unitMap.put(1, "I");unitMap.put(4, "IV");
        unitMap.put(5, "V");unitMap.put(9, "IX");
        unitMap.put(10, "X");unitMap.put(40, "XL");
        unitMap.put(50, "L");unitMap.put(90, "XC");
        unitMap.put(100, "C");unitMap.put(400, "CD");
        unitMap.put(500, "D");unitMap.put(900, "CM");unitMap.put(1000, "M");
        int[] unitValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder results = new StringBuilder();
        int unitIndex = 0;
        while (num > 0) {
            if (num >= unitValue[unitIndex]) {
                num -= unitValue[unitIndex];
                results.append(unitMap.get(unitValue[unitIndex]));
            } else {
                unitIndex++;
            }
        }
        return results.toString();
    }

    static int romanToInt(String s) {
        HashMap<String,Integer> valueMap=new HashMap<>();
        valueMap.put("I",1);valueMap.put("IV",4);
        valueMap.put("V",5);valueMap.put("IX",9);
        valueMap.put("X",10);valueMap.put("XL",40);
        valueMap.put("L",50);valueMap.put("XC",90);
        valueMap.put("C",100);valueMap.put("CD",400);
        valueMap.put("D",500);valueMap.put("CM",900);valueMap.put("M",1000);
        Set<Character>  duplicateSet = new HashSet<>();
        duplicateSet.add('I');duplicateSet.add('X');duplicateSet.add('C');
        int len = s.length();
        s=s+"0";
        int result=0;
        for(int i=0;i<len;i++){
            if(duplicateSet.contains(s.charAt(i)) && valueMap.containsKey(s.substring(i,i+2))){
                result+=valueMap.get(s.substring(i,i+2));
                i++;
            }else {
                result+=valueMap.get(s.substring(i,i+1));
            }
        }
        return result;
    }
}
