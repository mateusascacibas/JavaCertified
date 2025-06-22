package leetcode;


public class MaximumDepthBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
	}

}
