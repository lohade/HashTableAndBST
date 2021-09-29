package BST;

public class BST<T extends Comparable<T>>{


    public Node insertNode(Node<T> node,T val){
        if(node==null){
            return createBST(val);
        }
        if(val.compareTo(node.data)<0){
            node.left=insertNode(node.left,val);
            System.out.println(node.left.data);

        }
        if(val.compareTo(node.data)>=0){
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

}


