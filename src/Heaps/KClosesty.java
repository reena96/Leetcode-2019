package Heaps;

import java.util.Arrays;

public class KClosesty {
    public static int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i)
            dists[i] = dist(points[i]);

        Arrays.sort(dists);
        int distK = dists[K-1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i)
            if (dist(points[i]) <= distK)
                ans[t++] = points[i];
        return ans;
    }

    public static int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
    public static void main(String[] args){

        int[][] result = new int[4][2];
        result[0] = new int[]{1,0};
        result[1] = new int[]{3,0};
        result[2] = new int[]{7,0};
        result[3] = new int[]{12,0};

        int[][] newArr = kClosest(result,2);
        for (int i=0;i<newArr.length;i++){
            for (int j=0;j<newArr[i].length;j++){
                System.out.println(newArr[i][j]);
            }
        }
    }
}