package Graph.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dfs_Solution {
    private static int totalNodes= 100;

    public static void addEdge(List<List<Integer>> graph, int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void performDfs(List<List<Integer>> graph, int startNode){
        boolean[] isVisited = new boolean[totalNodes];
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        System.out.print("DFS Traversal: ");
        while(!stack.isEmpty()){
            int currentNode = stack.pop();
            if(!isVisited[currentNode]){
                isVisited[currentNode] = true;
                System.out.print(currentNode+ " ");

                for(int neighbor: graph.get(currentNode)){
                    if(!isVisited[neighbor]){
                        stack.push(neighbor);
                    }
                }
            }

        }
    }
    public static void printGraph(List<List<Integer>> graph){
        System.out.print("Adjacency List:");
        for (int i =0; i< graph.size();i++){
            if(!graph.get(i).isEmpty()){
                System.out.print(i+": ");
                for(int neighbor:graph.get(i)){
                    System.out.print(neighbor+" ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i =0; i<totalNodes; i++){
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 10,30);
        addEdge(graph, 10, 20);
        addEdge(graph, 20, 40);
        addEdge(graph, 20, 50);
        addEdge(graph, 30, 60);
        printGraph(graph);

        performDfs(graph,10);
    }
}
