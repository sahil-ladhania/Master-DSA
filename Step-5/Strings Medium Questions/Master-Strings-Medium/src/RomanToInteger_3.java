import java.util.HashMap;

public class RomanToInteger_3 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        String  bruteForceAnswer = bruteForceRomanToInteger(s);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterRomanToInteger(s);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalRomanToInteger(s);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static String bruteForceRomanToInteger(String s) {
        String str = "There is no brute force solution for this Problem.";
        return str;
    }

    public static String betterRomanToInteger(String s) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    public static int optimalRomanToInteger(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        int n = s.length();
        int integerValue = 0;
        for (int i = 0; i < n; i++) {
            int currentVal = map.get(s.charAt(i));
            if(((i+1) < n) && (currentVal < map.get(s.charAt(i+1)))){
                integerValue = integerValue - currentVal;
            }
            else{
                integerValue = integerValue + currentVal;
            }
        }
        return integerValue;
    }

}
