import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency_1 {
    public static void main(String[] args) {
        String s = "tree";
        String bruteForceAnswer = bruteForceSortCharactersByFrequency(s);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterSortCharactersByFrequency(s);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalSortCharactersByFrequency(s);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static String bruteForceSortCharactersByFrequency(String s) {
        String str = "There is no brute Force for this Problem.";
        return str;
    }

    public static String betterSortCharactersByFrequency(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int lengthofString = s.length();
        for (int i = 0; i < lengthofString; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch , 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    /*
    TC : O(n log n) ---> Due to the sorting step.
    SC : O(n) ---> Due to storage of the HashMap, List, and final string.
    */

    public static String optimalSortCharactersByFrequency(String s) {
        String str = "The Optimal Version can be solved using Bucket Sort Algorithm.";
        return str;
    }
    /*
    TC : O() --->
    SC : O() --->
    */

}
