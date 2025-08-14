package Graph;

import java.util.*;

class Dijkstra {
    static class Pair {
        int node, dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public static void dijkstra(int V, List<List<Pair>> graph, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.dist));
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.node;

            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.node;
                int weight = neighbor.dist;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1, 4));
        graph.get(0).add(new Pair(2, 2));
        graph.get(1).add(new Pair(2, 5));
        graph.get(1).add(new Pair(3, 10));
        graph.get(2).add(new Pair(4, 3));
        graph.get(4).add(new Pair(3, 4));
        graph.get(3).add(new Pair(5, 11));

        dijkstra(V, graph, 0);
    }
}