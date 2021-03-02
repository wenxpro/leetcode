package org.wenxpro.tree;

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

    private static int dfs(TreeNode node) {
        //递归调用
        if(node == null) {
            return 0;
        }
        int leftheight = dfs(node.left);
        int rightheight = dfs(node.right);
        int num = Math.max(leftheight, rightheight);
        return num + 1;
    }

}