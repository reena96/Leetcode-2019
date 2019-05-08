package Heaps;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPoints {
    // totalLocations - no of locations you need to deliver to (All Points) = 2
    // allLocations - coordinates of locations [[2,3],[4,5]]
    // truckCapacity - K
    class Point {
        int x, y;
        Double dist;

        Point(int x, int y, Double dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public List<List<Integer>> KClosest(int totalLocations, List<List<Integer>> allLocations, int truckCapacity) {
        List<List<Integer>> list = new ArrayList<>();

        Point[] points = new Point[totalLocations];
        for (int i = 0; i < allLocations.size(); i++) {
            int x = allLocations.get(i).get(0);
            int y = allLocations.get(i).get(1);
            points[i] = new Point(x, y, distance(x, y));
        }

        PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p2.dist.compareTo(p1.dist);
            }
        });


        for (int i = 0; i < totalLocations; i++) {
            if (pq.size() < truckCapacity) {
                pq.offer(points[i]);
            } else {
                if (pq.peek().dist > points[i].dist) {
                    pq.poll();
                    pq.offer(points[i]);
                }
            }
        }


        while (!pq.isEmpty()) {

            List<Integer> current = new ArrayList<>();
            Point point = pq.poll();
            current.add(point.x);
            current.add(point.y);
            list.add(current);
        }

        return list;

    }

    static double distance(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }
}