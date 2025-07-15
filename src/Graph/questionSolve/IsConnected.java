package Graph.questionSolve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class IsConnected {
    public static ArrayList<ArrayList<Integer>> matrix2List(int[][] matrix){
        int n = matrix.length;
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();

        for(int i = 0;i< n;i++){
            adjL.add(new ArrayList<>());
        }
        for (int i=0; i< n ; i++){
            for(int j =0; j<n;j++){
                if(matrix[i][j] == 1){
                    adjL.get(i).add(j);
                    adjL.get(j).add(i);
                }
            }
        }
        return adjL;
    }
    public static void bfs(int start, ArrayList<ArrayList<Integer>> adjL, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbor: adjL.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static boolean isConnected(int V, ArrayList<ArrayList<Integer>> adjL){
        boolean[] visited = new boolean[V];
        bfs(0,adjL,visited);
        for(boolean v: visited){
            if(!v) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0}
        };
        IsConnected solution = new IsConnected();
        ArrayList<ArrayList<Integer>> adjL = matrix2List(matrix);
        int V = matrix.length;
        boolean result = solution.isConnected(V,adjL);
        System.out.println(result ? "The graph is connected" : "The graph is NOT connected");
    }

}
