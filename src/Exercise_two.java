public class Exercise_two {

    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(1);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(1);
        TreeNode sixth = new TreeNode(1);
        TreeNode seventh = new TreeNode(1);

        root = first;
        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            if(leftDepth>rightDepth){
                return(leftDepth + 1);
            }
            else {
                return(rightDepth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Exercise_two btTwo = new Exercise_two();
        btTwo.createBinaryTree();

        System.out.println("Height of tree is "+btTwo.maxDepth(btTwo.root));
    }

}
