package graphs.lists;

import java.util.*;

class Node{
    char data;
    Node(char data){
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
public class Graph {
    //Instead of matrix we use LinkedList and ArrayList to connect Nodes

    List<LinkedList<Node>> myList = new ArrayList<>();
    Map<Node, Integer> nodeMap = new HashMap<>();
    private Integer size = 0 ;

    Graph(){
    }

    public void addVertices(Node node){
        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(node);
        myList.add(linkedList);
        nodeMap.put(node, size);
        size++;
    }

    public void addEdge(Node src, Node dst){
        myList.get(nodeMap.get(src)).add(myList.get(nodeMap.get(dst)).get(0));
    }

    public void printMyAdjList(){
        for (LinkedList<Node> li:
             myList) {
            for (Node node:
                 li) {
                System.out.print(node + "->");
            }

            System.out.println();
        }
    }

}
