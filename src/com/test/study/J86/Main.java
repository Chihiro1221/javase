package com.test.study.J86;
public class Main {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(a);
    }

    public static class TreeNode<T> {
        public T value;
        TreeNode<T> left, right;

        public TreeNode(T value) {
            this.value = value;
        }
    }
}