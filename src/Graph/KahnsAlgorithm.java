package Graph;

import java.util.*;

public class KahnsAlgorithm {
    public static void main(String[] args) {
        int n = 6; // number of vertices
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        // Graph edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topologicalSort(n, adj);
    }

    static void topologicalSort(int n, List<List<Integer>> adj) {
        int[] indegree = new int[n];

        // Step 1: Calculate in-degree
        for (int i = 0; i < n; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Step 2: Queue for nodes with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: BFS
        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            // Reduce in-degree of neighbors
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Step 4: Check if topological sort is possible
        if (topoOrder.size() != n) {
            System.out.println("Cycle detected! Topological sort not possible.");
        } else {
            System.out.println("Topological Order: " + topoOrder);
        }
    }
}