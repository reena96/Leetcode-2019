import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NetworkCost {

    public class Edge {
        public int node1, node2;
        public int cost;

        public Edge(int node1, int node2, int cost) {
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }
    }


    Comparator<Edge> comparator = new Comparator<Edge>() {
        public int compare(Edge a, Edge b) {
            if (a.cost != b.cost) {
                return a.cost - b.cost;
            }
            if (!(a.node1 == b.node1)) {
                return a.node1 - b.node1;
            }
            return a.node2 - b.node2;
        }
    };

    public int minCost(int numTotalEdgeNodes,
                       int numTotalAvailableNetworkNodes,
                       List<List<Integer>> networkRoutesAvailable,
                       int numNewNtworkRoutesConstruct,
                       List<List<Integer>> costNewNetworkRoutesConstruct) {

        List<Edge> edges = new ArrayList<>();

        // O(numTotalAvailableNetworkNodes)
        for (int i = 0; i < numTotalAvailableNetworkNodes; i++) {
            edges.add(new Edge(networkRoutesAvailable.get(i).get(0), networkRoutesAvailable.get(i).get(1), 0));
        }

        // O(numNewNtworkRoutesConstruct)
        for (int i = 0; i < numNewNtworkRoutesConstruct; i++) {
            edges.add(new Edge(costNewNetworkRoutesConstruct.get(i).get(0), costNewNetworkRoutesConstruct.get(i).get(1), costNewNetworkRoutesConstruct.get(i).get(2)));
        }

        // n log n
        Collections.sort(edges, comparator);
        List<Edge> result = new ArrayList<Edge>();


        int[] parent = new int[numTotalEdgeNodes+1];;
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
//            System.out.println(i);
        }

        int sum = 0;
        for (Edge e : edges) {
            int idx1 = e.node1;
            int idx2 = e.node2;

            int parent1 = find(parent, idx1);
            int parent2 = find(parent, idx2);

            if (parent1 != parent2) {
                parent[parent1] = parent2;
                result.add(e);
                sum = sum + e.cost;
            }
        }



        return (result.size() == numTotalEdgeNodes - 1) ? sum : -1;

    }

    private int find(int[] parent, int idx) {
        while (parent[idx] != idx) {
            parent[idx] = parent[parent[idx]];
            idx = parent[idx];
        }

        return idx;
    }


    public static void main(String[] args) {
//        NetworkCost nc = new NetworkCost();
//        List<List<Integer>> aroutes = new ArrayList<>();
//        List<Integer> route = new ArrayList<>();
//        route.add(1);
//        route.add(4);
//        aroutes.add(route);
//
//        route = new ArrayList<>();
//        route.add(4);
//        route.add(5);
//        aroutes.add(route);
//
//        route = new ArrayList<>();
//        route.add(2);
//        route.add(3);
//        aroutes.add(route);
//
//        List<List<Integer>> nroutes = new ArrayList<>();
//        route = new ArrayList<>();
//        route.add(1);
//        route.add(2);
//        route.add(5);
//        nroutes.add(route);
//
//        route = new ArrayList<>();
//        route.add(1);
//        route.add(3);
//        route.add(10);
//        nroutes.add(route);
//
//        route = new ArrayList<>();
//        route.add(1);
//        route.add(6);
//        route.add(2);
//        nroutes.add(route);
//
//        route = new ArrayList<>();
//        route.add(5);
//        route.add(6);
//        route.add(5);
//        nroutes.add(route);
//
//        int cost = nc.minCost(6, 3, aroutes, 4, nroutes);
//        System.out.println(cost);

        List<String> list = new ArrayList<>();
        System.out.println(list.size());
    }
}
