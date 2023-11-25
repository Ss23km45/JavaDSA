package graphs.matrix;

import java.util.*;

class Node{
    char data;
    Node(char data){
        this.data = data;
    }
}

//Graph for Adjacency matrix
public class Graph {
    int[][] matrix;
    Map<Node, Integer> nodeMap = new HashMap<>();

    int key =0;

    List<Character> chars = new ArrayList<>();
    Graph(int size){
        this.matrix=new int[size][size];
    }

    Graph(Node node){
        nodeMap.put(node, key);
        key++;
    }

    public Node addVertices(Node node){
        chars.add(node.data);
        nodeMap.put(node,key);
        key++;

        return node;
    }

    public void addEdge(Node source, Node destination){
        matrix[nodeMap.get(source)][nodeMap.get(destination)] = 1;
    }

    public boolean isConnected(Node src, Node dst) {
        return matrix[nodeMap.get(src)][nodeMap.get(dst)] == 1;
    }

    public void printMyGraph(){
        System.out.print("  ");
        for (Character cg:
             chars) {
            System.out.print(cg + " ");
        }
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            System.out.print(chars.get(i) + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dsfHelper(src, visited);
    }

    private void dsfHelper(int src, boolean[] visited) {
        if(visited[src]){
            return;
        }else {
            visited[src] = true;
            System.out.println("DFS is working, node we visited " + chars.get(src) + " visited");
        }

        for (int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i]==1){
                dsfHelper(i, visited);
            }
        }

        return;
    }

    public void breadthFirstSearch(int src){
        Queue<Character> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];
        queue.offer(chars.get(src));
        visited[src] = true;

        while(queue.size() != 0){
            char ele = queue.poll();
            src = chars.indexOf(ele);
            System.out.println(ele + " = Visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if(matrix[src][i]==1 && !visited[i]){
                    queue.offer(chars.get(i));
                    visited[i] = true;
                }
            }
        }
    }


}
