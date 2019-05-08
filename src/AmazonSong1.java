import java.util.ArrayList;
import java.util.HashMap;


public class AmazonSong1 {
    ArrayList<Integer> IDsOfSongs(int rideDuration, ArrayList<Integer> songDurations) {

        rideDuration = rideDuration - 30;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>(2);
        int max = 0;

        // creating a HashMap
        for (int i = 0; i < songDurations.size(); i++) {

            int current = songDurations.get(i);
            ArrayList<Integer> indices;
            indices = map.get(current) == null ? new ArrayList<>() : map.get(current);
            indices.add(i);
            map.put(current, indices);
        }

        // Iterating through list of songs
        for (int i = 0; i < songDurations.size(); i++) {

            int current = songDurations.get(i);
            int c_index = -1;

            if (current < rideDuration) {

                int complement = rideDuration - current;
                ArrayList<Integer> c_indices = map.get(complement);

                if (c_indices != null) {
                    if (c_indices.get(0) != i) {
                        c_index = c_indices.get(0);
                    } else if (c_indices.get(0) == i && c_indices.size() > 1) {
                        c_index = c_indices.get(1);
                    }
                    if (current > max || complement > max) {
                        max = (current > complement) ? current : complement;
                        answer.add(0, i);
                        answer.add(1, c_index);
                    }
                }
            }
        }
        return answer;
    }
}
