package JavaDS;

/**
 * @title: MyBinaryTree
 * @Author Xu
 * @Date: 2022/9/25 11:11
 * @Version 1.0
 */
public class MyBinaryTree {
    public TreeNode root;

    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    //先序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);
    }

    // 后序遍历
    public void postOrde(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }

    // 获取树中节点的个数
    public int size(TreeNode root) {
        return -1;
    }

    // 获取叶子节点的个数
    public int getLeafNodeCount(TreeNode root) {
        return -1;
    }

    // 子问题思路-求叶子结点个数

    // 获取第K层节点的个数
    public int getKLevelNodeCount(TreeNode root) {
        return -1;
    }

    // 获取二叉树的高度
    public int getHeight(TreeNode root) {
        return -1;
    }

    // 检测值为value的元素是否存在
    public TreeNode find(TreeNode root, int val) {
        return null;
    }

    //层序遍历
    public void levelOrder(TreeNode root) {

    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(TreeNode root) {
        return false;
    }

}