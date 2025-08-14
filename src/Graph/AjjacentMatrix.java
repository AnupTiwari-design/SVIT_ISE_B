package Graph;

public class AjjacentMatrix {
	
    public static void addEdge(int adj[][], int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1; // because it's an undirected graph
    }
    
    // Function to print adjacency matrix
    public static void print(int[][] adj, int V) {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 6;
        int adj[][] = new int[V][V];
		
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 5);
        addEdge(adj, 1, 4);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);
		
        print(adj, V);
    }
}