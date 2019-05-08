import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>();
        for(String banString : banned){
            set.add(banString);
        }

        Map<String, Integer> map= new HashMap<>();

        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();

        for(String word : paragraph.split(" ")){
            if(!set.contains(word)){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }

        String mostCommon = "";
        for(String key : map.keySet()){
            if(mostCommon.equals("") || map.get(key) > map.get(mostCommon)){
                mostCommon = key;
            }
        }
        return mostCommon;

    }

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
    }
}
