package TreeTraversals.RecursiveTraversal;

import TreeTraversals.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {

  public static void recursiveInorder(TreeNode root) {
    if (root == null) return;
    recursiveInorder(root.left);
    System.out.println(root.val);
    recursiveInorder(root.right);
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> s = new Stack<>();
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;
    // Do not misplace the root
    TreeNode current = root;
    s.push(current);
    while (!s.isEmpty()) {
      TreeNode currentNode = s.peek();
      if (currentNode != null && currentNode.left != null) {
        s.push(currentNode.left);
      } else {
        while (!s.isEmpty()) {
          TreeNode leftMostNode = s.pop();
          if (leftMostNode == null) break;
          // null check before adding
          result.add(leftMostNode.val);
          if (leftMostNode.right != null) {
            s.push(leftMostNode.right);
            /**
                            if not provided then we will move right side
                         */
            break;
          }
          // I cannot add to result here previous break will prevent addition to result array
        }
      }
    }
    return result;
  }

  public static void main(String args[]) {
    TreeNode tree = TreeNode.returnPredefinedTree();
    recursiveInorder(tree);
  }
}
