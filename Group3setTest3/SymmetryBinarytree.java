package Group3setTest3;


import java.util.*;
public class SymmetryBinarytree {
   // public class Solution {
        public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }
    
        private static boolean isMirror(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (!left.data.equals(right.data)) {
                return false;
            }
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
    
}
