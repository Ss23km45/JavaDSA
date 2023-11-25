package graphs.lists;


public class AdjacencyLists {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');

        myGraph.addVertices(nodeA);
        myGraph.addVertices(nodeB);
        myGraph.addVertices(nodeC);
        myGraph.addVertices(nodeD);
        myGraph.addVertices(nodeE);

        myGraph.addEdge(nodeA, nodeB);
        myGraph.addEdge(nodeA, nodeE);
        myGraph.addEdge(nodeB, nodeD);
        myGraph.addEdge(nodeC, nodeA);
        myGraph.addEdge(nodeA, nodeC);
        myGraph.addEdge(nodeA, nodeD);

        myGraph.addEdge(nodeC, nodeE);
        myGraph.addEdge(nodeD, nodeB);
        myGraph.addEdge(nodeD, nodeA);
        myGraph.addEdge(nodeE, nodeC);
        myGraph.addEdge(nodeE, nodeD);

//        System.out.println("NodeA and NodeB Connected ??" + myGraph.isConnected(nodeA, nodeB));
//        System.out.println("NodeA and Nodec Connected ??" + myGraph.isConnected(nodeA, nodeC));
//        System.out.println("NodeC and NodeD Connected ??" + myGraph.isConnected(nodeC, nodeD));
//        System.out.println("NodeE and NodeA Connected ??" + myGraph.isConnected(nodeE, nodeA));

        myGraph.printMyAdjList();
    }
    }
