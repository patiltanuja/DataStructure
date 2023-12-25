
class BFS {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
       ArrayList<Integer> arlist = new ArrayList<>();
       boolean visited[]= new boolean[V];
       
       Queue<Integer> q = new LinkedList<>();
       q.add(0);
       
       while(!q.isEmpty()){
            int vertex = q.poll();
        if (!visited[vertex]) {
            arlist.add(vertex);
            visited[vertex]= true;
       
       
       for(int u: adj.get(vertex)){
           
           if(!visited[u]){
                q.add(u);
           }
       }
        }
      
    }
     return arlist;
    }
}
