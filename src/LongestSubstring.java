import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int len = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
                len = len + 1;
            }
            else {
                len = len - 1;
                map.remove(c);
            }
            if ( longest < len) {
                longest = len;
            }
        }
        return longest;
    }
}
