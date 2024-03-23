import java.util.Stack;

public class Exercise_one {

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
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seven;
    }
    public void preOrder(TreeNode root){
        //start from the top
        //top -> left -> right
        long start = System.currentTimeMillis();
        if(root ==null){
            return;
        }
        //print the first root# on top
        System.out.print(root.data +" ,");
        //traver to the left
        preOrder(root.left);
        preOrder(root.right);
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Time used: "+total);
    }
    //    public void preOrder(){
//        if(root ==null){
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode temp = stack.pop();
//            System.out.print(temp.data + " ");
//            if(temp.right!=null){
//                stack.push(temp.right);
//            }
//            if(temp.left!=null){
//                stack.push(temp.left);
//            }
//        }
//    }


    public void inOrder(TreeNode root){
        //left sub -> root -> right sub
        long start = System.currentTimeMillis();
        if(root == null){
            return;
        }
        //traver to the left subroot first
        inOrder(root.left);
        //print the very left root data
        //if the root dat have null node on the sub
        //go back to the prev step
        System.out.print(root.data + " ,");
        //after the print for root.left
        inOrder(root.right);
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Time used: "+total);
    }
//    public void inOrder(TreeNode root){
//        if(root ==null){
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode temp = root;
//        while (!stack.isEmpty() || temp!=null){
//            if(temp !=null){
//                stack.push(temp);
//                temp = temp.left;
//            }else{
//                temp = stack.pop();
//                System.out.print(temp.data);
//                temp = temp.right;
//            }
//        }
//    }
    public void postOrder(TreeNode root){
        //left sub -> right sub -> root
        long start = System.currentTimeMillis();
        if(root ==null){
            return;
        }
        //check for the very left sub
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ,");
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Time used: "+total);
    }


    public static void main(String[] args) {
        Exercise_one bt = new Exercise_one();
        bt.createBinaryTree();

        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
}
