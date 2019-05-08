package Heaps;

import java.util.*;

public class KFrequentWords {
    class WordNode{
        String word;
        int count;
        WordNode(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new TreeMap<>();
        for(String word: words){
            map.put(word,map.getOrDefault(word,1)+1);

        }

        PriorityQueue<WordNode> pq = new PriorityQueue<>(new Comparator<WordNode>() {
            public int compare(WordNode a, WordNode b){
                if(a.word == b.word)
                    return a.word.compareTo(b.word);
                else
                    return a.count - b.count;
            }
        });
        for(String word: map.keySet()){
            if(pq.size() < k)
                pq.offer(new WordNode(word, map.get(word)));
            else{
                pq.poll();
                pq.offer(new WordNode(word, map.get(word)));
            }
        }
        List<String> list = new ArrayList<>();
        while (pq.size()>0){
            list.add(pq.poll().word);
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(new KFrequentWords().topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }
}