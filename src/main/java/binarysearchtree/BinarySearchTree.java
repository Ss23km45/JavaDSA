package binarysearchtree;

public class BinarySearchTree {
    Node root;

    BinarySearchTree(){

    }

    public void insert(Node node){

        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        if(root == null){
            root = node;
            return root;
        } else if (root.data > node.data) {
            root.left = insertHelper(root.left, node);
        } else if (root.data < node.data) {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }


    public boolean search(Node node){
        return searchHelper(root, node);
    }

    private boolean searchHelper(Node root, Node node) {
        if(root==null){
            return false;
        }else if(root.data == node.data){
            return true;
        }else if(root.data > node.data){
            return searchHelper(root.left, node);
        }else {
            return searchHelper(root.right, node);
        }

    }

    public void displayTree(){
        displayTreeHelper(root);
    }

    private void displayTreeHelper(Node root) {
        if(root != null) {
            displayTreeHelper(root.left);
            System.out.println("Element Node " + root);
            displayTreeHelper(root.right);
        }
    }

    public void remove(int data){
        removeHelper(root, data);
    }

    private Node removeHelper(Node root, int data) {

        if(root == null){
            return root;
        }else if(root.data>data){
            root.left = removeHelper(root.left, data);
        }else if(root.data<data){
            root.right = removeHelper(root.right, data);
        }else{
            if(root.left==null && root.right==null){
                root = null;
            }else if(root.right !=null){
                root.data =  successor(root);
                root.right = removeHelper(root.right, root.data);
            }else {
                root.data =  predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }

        return root;
    }

    private int successor(Node root) { //find least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) {//find greatest value below the left child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
}
