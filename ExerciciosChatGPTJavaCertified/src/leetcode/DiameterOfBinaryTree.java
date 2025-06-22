package leetcode;

public class DiameterOfBinaryTree {

	int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        checkLength(root);
        return maxDiameter;
    }

    public int checkLength(TreeNode root){
        if(root == null) return 0;
        int left = checkLength(root.left);
        int right = checkLength(root.right);
        maxDiameter = Math.max(maxDiameter, left+ right);
        return Math.max(left, right) + 1;
    }
}
