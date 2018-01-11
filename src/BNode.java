


import java.util.Scanner;
//        Task

//       The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer,'root' , pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
//
//        Input Format
//
//        The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
//        The first line contains an integer,'n', denoting the number of nodes in the tree.
//        Each of the 'n' subsequent lines contains an integer,data, denoting the value of an element that must be added to the BST.
//
//        Output Format
//
//        The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.
class BNode {

    BNode left, right;
    int data;

    BNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    public static int getHeight(BNode root) {
        if (root == null)
            return -1;

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }

    public static BNode insert(BNode root, int data) {
        if (root == null) {
            return new BNode(data);
        } else {
            BNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
