package Graph.questionSolve;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    public static ArrayList<ArrayList<Integer>> convertMatrixToList(int[][] matrix){
        int n = matrix.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i< n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i< n; i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j] == 1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }

            }
        }

        return adj;
    }

    public boolean check(int start, int V, ArrayList<ArrayList<Integer>> adj, int[] color){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0;

        while(!queue.isEmpty()){
            int node = queue.peek();
            queue.remove();
            for(int it: adj.get(node)){
                if (color[it]== -1){
                    color[it] = 1- color[node];
                    queue.add(it);
                }else if(color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V,ArrayList<ArrayList<Integer>> adj ){
        int[] color = new int[V];
        Arrays.fill(color,-1);
        for(int i=0 ; i< V ; i++) {
            if (color[i] == -1) {
                if (!check(i, V, adj, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,0},
                {1,0,1},
                {0,1,0}
        };
        BipartiteGraph solution = new BipartiteGraph();
        ArrayList<ArrayList<Integer>> adj = convertMatrixToList(matrix);
        int V= matrix.length;
        boolean result = solution.isBipartite(V,adj);
        System.out.println(result ? "The graph is bipartite" : "The graph is NOT bipartite");
    }


}
