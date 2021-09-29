package BST;

public class BSTMain {
    public static void main(String[] args){
        BST bst=new BST();
        Node root=null;
        root=bst.insertNode(root,50);
        System.out.println(root.data);
        root=bst.insertNode(root,30);
        root= bst.insertNode(root,70);
        root= bst.insertNode(root,60);
        root= bst.insertNode(root,10);
        root= bst.insertNode(root,90);
        root= bst.insertNode(root,23);
        bst.inorder(root);
        //System.out.println(root.left.data+"right data"+root.right.data);
        System.out.println(+bst.size(root));

    }
}
