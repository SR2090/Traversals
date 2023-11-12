package TreeTraversals;

public class TreeNode {

  public int val;

  public TreeNode left;

  public TreeNode right;

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static TreeNode returnPredefinedTree() {
    TreeNode node7 = new TreeNode(7, null, null);
    TreeNode node3 = new TreeNode(3, null, null);
    TreeNode node6 = new TreeNode(6, null, null);
    TreeNode node4 = new TreeNode(4, null, null);
    TreeNode node5 = new TreeNode(5, node6, node7);

    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode root = new TreeNode(1, node2, node3);
    return root;
  }

  /**
   * @return int return the val
   */
  public int getVal() {
    return val;
  }

  /**
   * @param val the val to set
   */
  public void setVal(int val) {
    this.val = val;
  }

  /**
   * @return TreeNode return the left
   */
  public TreeNode getLeft() {
    return left;
  }

  /**
   * @param left the left to set
   */
  public void setLeft(TreeNode left) {
    this.left = left;
  }

  /**
   * @return TreeNode return the right
   */
  public TreeNode getRight() {
    return right;
  }

  /**
   * @param right the right to set
   */
  public void setRight(TreeNode right) {
    this.right = right;
  }
}
