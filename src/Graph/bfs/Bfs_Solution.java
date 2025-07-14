package Graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;

public class Bfs_Solution {
    static int totalNodes = 100;

    public static void addEdge(List<List<Integer>> graph, int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void performBFS(List<List<Integer>> graph , int startNode){
        boolean[] isVisited = new boolean[totalNodes];
        Queue<Integer> queue = new LinkedList<>();
        isVisited[startNode] = true;
        queue.add(startNode);

        System.out.print("BFS Traversal:");

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.print(currentNode+ " ");
            for(int neighbor: graph.get(currentNode)){
                if(!isVisited[neighbor]){
                    isVisited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void printGraph(List<List<Integer>> graph ){
        System.out.print("Adjacency List: ");
        for (int i =0 ; i< graph.size();i++){
            if(!graph.get(i).isEmpty()){
                System.out.print(i+": ");
                for (int neighbor : graph.get(i)){
                    System.out.print(neighbor+" ");
                }
                System.out.println();
            }

        }
    }


    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0 ; i< totalNodes;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 10, 30);
        addEdge(graph, 10, 20);
        addEdge(graph, 20, 40);
        addEdge(graph, 20, 50);
        addEdge(graph, 30, 60);

        printGraph(graph);
        performBFS(graph,10);
    }
}
