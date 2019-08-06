package hbcu.stay.ready;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String isPalindrome(String input) {
        HashMap<String, Integer> dictionary = new HashMap();
        String[] strList = input.split("");
        int oddCount = 0;
        String ans = "";

        for (String letter : strList) {
            if (!dictionary.containsKey(letter)) {
                dictionary.put(letter, 1);
            } else {
                dictionary.put(letter, dictionary.get(letter) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            if (entry.getValue() % 2 == 1)
                oddCount++;
        }

        if (oddCount > 1){
            ans = "NO";}
        else{
            ans = "YES";}

        return ans;
    }

    public static String reverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }

    public static String sortString(String input) {

        char[] tempArray = input.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);

    }
}
