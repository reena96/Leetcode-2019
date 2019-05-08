import java.util.*;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        Map<Integer, Integer> linkMap = new LinkedHashMap<>();
        int[] arr = new int[]{2, 2, 3, 2, 2, 3, 2, 1 ,0};
        for (int i = 0; i < arr.length; i++) {
            int val = linkMap.getOrDefault(arr[i], 0);
            linkMap.put(arr[i], ++val);
        }

        Integer[] values = Arrays.copyOf(linkMap.values().toArray(),linkMap.size(), Integer[].class );
        int max = 0;
        int sum = 0;
        for(int i = 0;i<values.length-1; i++) {
            sum = values[i]+values[i+1];
            if(sum > max){
                max = sum;
            }

        }
        System.out.println(max);
    }
}
