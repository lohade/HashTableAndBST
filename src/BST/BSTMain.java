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
        root= bst.insertNode(root,40);
        root= bst.insertNode(root,95);
        root= bst.insertNode(root,22);
        root= bst.insertNode(root,11);
        root= bst.insertNode(root,65);
        root= bst.insertNode(root,16);
        root= bst.insertNode(root,3);
        root= bst.insertNode(root,63);
        root= bst.insertNode(root,67);
        bst.inorder(root);
        System.out.println(+bst.size(root));

        if(bst.search(root,6))
            System.out.println("node is present");
        else
            System.out.println("node is absent");
        //System.out.println("node is present:"+bst.search(root,6));


    }
}
