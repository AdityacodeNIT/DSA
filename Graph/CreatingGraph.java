import java.util.ArrayList;

public class CreatingGraph {
    static class Edge {
        int src;
        int dist;
        int weight;

        public Edge(int src, int dist, int weight) {
            this.src = src;
            this.dist = dist;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int V = 5;

        // create an adjaceny list

        @SuppressWarnings("unchecked")

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();

        }
        // for 0
        graph[0].add(new Edge(0, 1, 5));

        // for 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        // for 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 3, 1));

        // for 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // for 4
        graph[4].add(new Edge(4, 2, 2));

        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);

            System.out.println(e.dist);
        }

    }

}