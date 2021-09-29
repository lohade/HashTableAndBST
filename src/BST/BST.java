package BST;

public class BST<T extends Comparable<T>>{

    public Node root;
    public BST(){
        root=null;
    }

    public Node insertNode(Node<T> node,T val){
        if(node==null){
            return createBST(val);
        }
        else if(val.compareTo(node.data)<0){
            node.left=insertNode(node.left,val);
            System.out.println(node.left.data);


        }
        else if(val.compareTo(node.data)>=0){
            node.right=insertNode(node.right,val);
            System.out.println(node.right.data);

        }
        return node;

    }
    public Node createBST(T val){
        Node node = new Node(val);
        node.data =val;
        node.left=null;
        node.right=null;
        return node;

    }

    public int size(Node node){
        if(node==null){
            return 0;
        }
        else
            return(size(node.left)+ 1 + size(node.right));
    }
    public void inorder(Node node){

        if(node==null){
            System.out.println("tree is empty");
            return;
        }
        else{
            if(node.left!=null)
                inorder(node.left);
            System.out.println(node.data+"");
            if(node.right!=null)
                inorder(node.right);
        }
    }
}



