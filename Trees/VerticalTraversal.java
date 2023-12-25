class Pair{
    public TreeNode node;
    public int level;
    public Pair(TreeNode node, int x){
        this.node = node;
        level = x;
    }
}

public class VerticalTraversal {

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        if(A==null) {
            return null;
        }

        Queue<Pair> queue = new LinkedList<Pair>();
        HashMap<Integer, ArrayList<TreeNode>> hm = new HashMap<Integer, ArrayList<TreeNode>>();
      
        queue.add(new Pair(A, 0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i=0; i<size; i++) {
                Pair pair = queue.poll();
                
                min = Math.min(min, pair.level);
                max = Math.max(max, pair.level);
                
                if(!hm.containsKey(pair.level)) {
                    hm.put(pair.level, new ArrayList<TreeNode>());
                }
                hm.get(pair.level).add(pair.node);
                
                if(pair.node.left!=null) {
                    queue.add(new Pair(pair.node.left, pair.level-1));
                }
                if(pair.node.right!=null) {
                    queue.add(new Pair(pair.node.right, pair.level+1));
                }
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=min; i<=max; i++) {
            if(hm.containsKey(i)) {
                ArrayList<Integer> inner = new ArrayList<Integer>();
                for(TreeNode node:hm.get(i)) {
                    inner.add(node.val);
                }
                ans.add(inner);
            }
        }
        return ans;
    }
}



