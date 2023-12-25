import java.util.ArrayList;

class Solution {
    // Function to perform Depth-First Search
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        // Perform DFS starting from each unvisited node
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, result);
            }
        }

        return result;
    }

    // Recursive function to perform DFS
    private void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[vertex] = true;
        result.add(vertex);

        for (int u : adj.get(vertex)) {
            if (!visited[u]) {
                dfs(u, adj, visited, result);
            }
        }
    }
}

