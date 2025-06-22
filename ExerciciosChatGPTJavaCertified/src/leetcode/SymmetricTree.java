package leetcode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(right == null || left == null) return false;
        if(left.val != right.val) return false;
        boolean response = isMirror(left.left, right.right) && isMirror(left.right, right.left);
        return response;
    }
}
