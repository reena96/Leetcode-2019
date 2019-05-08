import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test2 {
    public List<List<Integer>> kClosest(int totalCrates, List<List<Integer>> alllocations, int truckCapacity) {

        List<List<Integer>> returnList = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < totalCrates; i++) {
            int dist = getdistance(alllocations.get(i));
            if (i < truckCapacity)
                pq.offer(i);
            else {
                if (getdistance(alllocations.get(pq.peek())) < dist) {
                    pq.poll();
                    pq.offer(i);
                }
            }
        }
        for (int i = 0; i < pq.size(); i++) {
            returnList.add(alllocations.get(i));
        }
        return returnList;
    }

    private int getdistance(List<Integer> point) {
        return point.get(0) ^ 2 + point.get(1) ^ 2;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();

    }
}