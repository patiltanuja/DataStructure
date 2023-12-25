/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class LevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
     Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        ArrayList<ArrayList<Integer>> mainAns = new ArrayList<ArrayList<Integer>>();

while(q.size()>0){
    ArrayList<Integer> ans = new ArrayList<Integer>();
   int s = q.size();

   for(int i=0;i<s;i++){
       TreeNode temp = q.poll();
        ans.add(temp.val);
        if(temp.left != null){ q.add(temp.left);}
        if(temp.right != null){q.add(temp.right); }
           
   }  
    mainAns.add(ans);
}
     return mainAns;
    }
}
