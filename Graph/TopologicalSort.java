import java.util.*;
import java.util.Stack;

public class TopologicalSort {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void Topology(ArrayList<Edge>[] graph, boolean visit[], int curr, Stack<Integer> st) {
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visit[e.dist]) {
                Topology(graph, visit, e.dist, st);
            }
        }
        st.push(curr);
        System.out.println(curr);

    }

    public static void main(String[] args) {
        int V = 6;
        
        @SuppressWarnings("unchecked")

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean visit[] = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                Topology(graph, visit, i, st);
            }
        }

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
