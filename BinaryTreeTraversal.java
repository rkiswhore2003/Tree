class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}



public class BinaryTreePreorderTraversal {
    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    
       
    }


    
        public void inorderTraversal(TreeNode root) {
            if (root == null) {
                return;
            }
            
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
           
           
        }


       
            public void postorderTraversal(TreeNode root) {
                if (root == null) {
                    return;
                }
                
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                System.out.print(root.val + " ");
               
            }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2); 
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(9);
        root.left.left.right.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(8);
        
        BinaryTreePreorderTraversal tree = new BinaryTreePreorderTraversal();


        System.out.println("Preorder traversal of the binary tree:");
        tree.preorderTraversal(root);

        System.out.println("\ninorder traversal of the binary tree:");
        tree.inorderTraversal(root);

        System.out.println("\nPostorder traversal of the binary tree:");
        tree.postorderTraversal(root);

    }
}
