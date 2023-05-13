package com.test.study.J87;


import com.test.study.collection.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        TreeNode<Character> f = new TreeNode<>('F');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        levelOrder(a);
    }

    /**
     * 前序遍历
     * @param root
     */
    public static void preOrder(TreeNode<Character> root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrder(root.right);
    }

    /**
     * 中序遍历
     * @param root
     */
    public static void midOrder(TreeNode<Character> root) {
        if (root == null) return;
        midOrder(root.left);
        System.out.print(root.value + " ");
        midOrder(root.right);
    }

    /**
     * 后序遍历
     * @param root
     */
    public static void postOrder(TreeNode<Character> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    /**
     * 层序遍历
     * @param root
     */
    public static void levelOrder(TreeNode<Character> root) {
        LinkedQueue<TreeNode<Character>> list = new LinkedQueue();
        list.offer(root);
        while (!list.isEmpty()) {
            TreeNode<Character> node = list.poll();
            System.out.print(node.value + " ");
            if (node.left != null) list.offer(node.left);
            if (node.right != null) list.offer(node.right);
        }
    }

    public static class TreeNode<T> {
        public T value;
        TreeNode<T> left, right;

        public TreeNode(T value) {
            this.value = value;
        }
    }
}