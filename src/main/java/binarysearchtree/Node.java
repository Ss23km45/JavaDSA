package binarysearchtree;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int input){
        this.data = input;
    }

    @Override
    public String toString() {
        return "{ "+  "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
