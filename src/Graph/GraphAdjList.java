package Graph;
import java.util.*;

public class GraphAdjList {

    // Add undirected edge
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

 // Print adjacency list
    public static void print(List<List<Integer>> adj, int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    // BFS traversal
    void bfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS starting from " + start + ": ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    // DFS helper (recursive)
    void dfsUtil(List<List<Integer>> adj, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfsUtil(adj, neighbour, visited);
            }
        }
    }

    // DFS traversal
    void dfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        System.out.print("DFS starting from " + start + ": ");
        dfsUtil(adj, start, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 5);
        addEdge(adj, 1, 4);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);

        // Print graph
        print(adj, V);

        GraphAdjList g = new GraphAdjList();
        g.bfs(adj, 0); // BFS from node 0
        g.dfs(adj, 0); // DFS from node 0
    }
}