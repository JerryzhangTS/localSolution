package leetCode;

import java.util.*;

public class letterCombination {
    static List<String> letterCombinations(String digits){
        if(digits.isEmpty()){
           return Collections.emptyList();
        }
        Map<Character,String> letterMap = new HashMap<>();
        letterMap.put('2',"abc");
        letterMap.put('3',"def");
        letterMap.put('4',"ghi");
        letterMap.put('5',"jkl");
        letterMap.put('6',"mno");
        letterMap.put('7',"pqrs");
        letterMap.put('8',"tuv");
        letterMap.put('9',"wxyz");
        List<String> letterCombinationStrList = new ArrayList<>();
        String firstStr = letterMap.get(digits.charAt(0));
       for(int i=0;i<firstStr.length();i++){
           letterCombinationStrList.add(""+firstStr.charAt(i));
       }
        for(int i=1;i<digits.length();i++){
            letterCombination2(letterCombinationStrList,digits.charAt(i),letterMap);
        }
        return letterCombinationStrList;
    }

    static void letterCombination2(List<String> listStr,Character digit2,Map<Character,String> letterMap){
        if(!letterMap.containsKey(digit2)){
            return;
        }
        List<String> combinationStrList = new ArrayList<>();
        List<String> removeStrList = new ArrayList<>();
        for (String str:listStr){
            removeStrList.add(str);
            String combinationStr = letterMap.get(digit2);
            for(int i=0;i<combinationStr.length();i++){
                combinationStrList.add(str+combinationStr.charAt(i));
            }
        }
        listStr.removeAll(removeStrList);
        listStr.addAll(combinationStrList);

    }
}
