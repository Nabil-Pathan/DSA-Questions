
public class SameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { 
          this.val = val; 
      }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Check if both roots are null then return true
        if(p == null && q==null) return true;

        // check if one root is null 
        if(p != null && q == null || p == null && q!=null) return false;


        // Check for values of root
        if(p.val != q.val) return false;

        // 
        boolean leftTreeMatch = isSameTree(p.left, q.left);
        boolean rightTreeMatch = isSameTree(p.right, q.right);

        return leftTreeMatch && rightTreeMatch;

    }
}



