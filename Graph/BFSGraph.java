import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFSGraph {

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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 1));

        // for 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // for 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 7));
        graph[2].add(new Edge(2, 3, 1));
        // graph[2].add(new Edge(2, 3, 1));

        // for 3
        graph[3].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(3, 4, 3));
        graph[3].add(new Edge(3, 5, 5));

        // for 4
        // graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // for 5
        graph[5].add(new Edge(5, 6, 1));
        // graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        // for 6
        graph[6].add(new Edge(6, 4, 1));

    }

    // public static void bfs(ArrayList<Edge>[] graph) {
    // Queue<Integer> q = new LinkedList<>();
    // boolean visit[] = new boolean[graph.length];

    // q.add(0);

    // while (!q.isEmpty()) {
    // int curr = q.poll();

    // if (!visit[curr]) {
    // System.out.print(curr + " ");
    // visit[curr] = true;

    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // q.add(e.dist);
    // }
    // }

    // }

    // }

    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        Edge e = graph[0].get(0);

        q.add(e.src);

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge n = graph[curr].get(i);
                    q.add(n.dist);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visit[]) {

        System.out.print(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dist]) {
                dfs(graph, e.dist, visit);
            }

        }

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int desti, boolean visit[]) {
        if (src == desti) {
            return true;
        }
        visit[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visit[e.dist] && hasPath(graph, e.dist, desti, visit)) {
                return true;
            }

        }
        return false;
    }

    public static void Printallpaths(ArrayList<Edge>[] graph, int src, int desti, boolean visit[], StringBuilder sb) {

        if (src == desti) {
            System.out.println(sb.toString());
            return;
        }
        visit[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visit[e.dist]) {
                sb.append(e.dist);
                Printallpaths(graph, e.dist, desti, visit, sb);
                sb.deleteCharAt(sb.length() - 1);

            }
        }
        visit[src] = false;
    }

    public static boolean DetectCycle(ArrayList<Edge>[] graph, int curr, boolean visit[], boolean recursinStack[]) {

        recursinStack[curr] = true;
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (recursinStack[e.dist]) {
                return true;
            } else if (!visit[e.dist] && DetectCycle(graph, e.dist, visit, recursinStack)) {
                return true;
            }

        }

        visit[curr] = false;
        return false;
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void Djikstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dest[] = new int[V];

        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (i != src) {
                dest[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (int j = 0; j < graph[curr.node].size(); j++) {
                    Edge E = graph[curr.node].get(j);

                    int u = E.src;
                    int v = E.dist;

                    if (dest[u] + E.weight < dest[v]) {
                        dest[v] = dest[u] + E.weight;
                        pq.add(new Pair(v, dest[v]));

                    }

                }
            }
        }
        for (int k = 0; k < V; k++) {
            System.out.print(dest[k] + " ");
        }

        System.out.println();

    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int dest[] = new int[V];

        for (int i = 0; i < V; i++) {
            dest[i] = Integer.MAX_VALUE;
        }
        dest[src] = 0;

        for (int j = 0; j < V - 1; j++) {
            for (int k = 0; k < V; k++) {

                for (int i = 0; i < graph[k].size(); i++) {
                    Edge e = graph[k].get(i);

                    int u = e.src;
                    int v = e.src;

                    if (dest[u] + e.weight < dest[v] && dest[u] != Integer.MAX_VALUE) {
                        dest[v] = dest[u] + e.weight;
                    }
                }
            }

            for (int i = 0; i < dest.length; i++) {
                System.out.println(dest[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 7;

        // create an adjaceny list

        @SuppressWarnings("unchecked")

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        // bfs(graph);
        System.out.println();
        // bellmanFord(graph, 0, V);
        // Djikstra(graph, 0, V);
        boolean visit[] = new boolean[V];
        // boolean recursionStack[] = new boolean[V];
        // for (int i = 0; i < V; i++) {
        // if (!visit[i]) {
        // boolean cycle = DetectCycle(graph, i, visit, recursionStack);
        // if (cycle) {
        // System.out.println(cycle);
        // }
        // }
        // }

        dfs(graph, 0, visit);
        // StringBuilder sb = new StringBuilder();
        // Printallpaths(graph, 0, 6, visit, sb);
        // System.out.println(hasPath(graph, 0, 6, new boolean[V]));

    }
}
