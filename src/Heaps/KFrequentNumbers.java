package Heaps;

import java.util.*;

public class KFrequentNumbers {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int number : nums){
            map.put(number, map.getOrDefault(number,0)+1);
        }

        map.entrySet();
        // create a max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b) - map.get(a);
            }
        });

        // add element from map on to the priority queue
        for(int element: map.values())
            pq.offer(element);

        // poll elements from pq on to a list
        List<Integer> list = new ArrayList<>();
        while(pq.size() < k){
            list.add(pq.poll());
        }


        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new KFrequentNumbers().topKFrequent(new int[]{3,2,3,2,2,4,5,2,3,5},2);
        for(int number: list){
            System.out.println(number);
        }
    }
}