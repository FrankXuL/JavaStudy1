package JavaDS;

/**
 * @title: BinarySearchTree
 * @Author Xu
 * @Date: 17/10/2022 下午 8:13
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class BinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }


    private Node root = null;

    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.key == key) {
                return cur;
            } else if (cur.key > key) {
                cur = cur.right;
            } else if (cur.key < key) {
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.key < key) {
                parent = cur;
                cur = cur.right;
            } else if (cur.key > key) {
                parent = cur;
                cur = cur.left;
            } else {
                return false;
            }
        }
        if (parent.key > key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    public boolean remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if (cur.key == key) {
                removeNode(parent, cur);
                return true;
            } else if (cur.key < key) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node target = cur.right;
            Node targetParent = cur;
            while (target.left != null) {
                targetParent = target;
                target =target.left;
            }
            cur.key = target.key;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] array = {5,3,4,1,7,8,2,6,0,9};
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }
        binarySearchTree.inorder(binarySearchTree.root);
    }
}