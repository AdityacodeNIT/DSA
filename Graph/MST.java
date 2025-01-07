import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {

    public static class Edge {
        int src;
        int dist;
        int weight;

        public Edge(int src, int dist, int weight) {
            this.src = src;
            this.dist = dist;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 50));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prism(ArrayList<Edge> graph[], int V) {
        PriorityQueue<Pair> p2 = new PriorityQueue<>();

        boolean vis[] = new boolean[V];

        p2.add(new Pair(0, 0));

        int mstMost = 0;

        while (!p2.isEmpty()) {
            Pair curr = p2.poll();

            if (!vis[curr.node]) {
                vis[curr.node] = true;
                mstMost += curr.cost;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    if (!vis[e.dist]) {
                        p2.add(new Pair(e.dist, e.weight));
                    }
                }
            }
        }
        System.out.println(mstMost);
    }

    public static void main(String[] args) {

        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prism(graph, V);
    }
}
