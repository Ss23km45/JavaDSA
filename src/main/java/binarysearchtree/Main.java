package binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(8));
        bst.insert(new Node(5));
        bst.insert(new Node(9));
        bst.insert(new Node(12));
        bst.insert(new Node(2));
        bst.insert(new Node(6));
        bst.insert(new Node(17));
        bst.insert(new Node(21));

        bst.displayTree();

        System.out.println("Is Found " + bst.search(new Node(17)));

        bst.remove(17);
        System.out.println("Is Found " + bst.search(new Node(17)));


    }
}
