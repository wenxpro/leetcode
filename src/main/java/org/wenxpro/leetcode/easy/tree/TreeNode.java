package org.wenxpro.leetcode.easy.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(9);
        TreeNode r = new TreeNode(20);
        TreeNode rl = new TreeNode(15);
        TreeNode rr = new TreeNode(7);
        TreeNode rrl = new TreeNode(4);
        root.left = l;
        root.right = r;
        r.left = rl;
        r.right = rr;
        rr.left = rrl;
        int max = dfs(root);
        System.out.println(max);
    }

    /**
     * 树的最大高度
     * @param node
     * @return
     */
    private static int dfs(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftheight = dfs(node.left);
        int rightheight = dfs(node.right);
        //末位 left right 为 0 每向上一层 +1
        int num = Math.max(leftheight, rightheight);
        //高度 +1
        return num + 1;
    }

}