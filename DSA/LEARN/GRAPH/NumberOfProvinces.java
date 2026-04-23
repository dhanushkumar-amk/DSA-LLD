package DSA.LEARN.GRAPH;

import java.util.ArrayList;

public class NumberOfProvinces {

    public static void main(String[] args) {

    }

     public static int findNumOfProvinces(int[][] roads, int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

         for (int i = 0; i < n; i++) {
             list.add(new ArrayList<>());
         }

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                if (list.get(i).get(j) != 1 && i != j){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
             }
         }

         boolean[] visited = new boolean[n + 1];
         int count = 0;

         for (int i = 0; i < n; i++) {
             if (!visited[i]){
                 count++;
                 dfs(i, visited, list);
             }
         }
    }

    private static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> list) {
        visited[node] = true;
        for (Integer element : list.get(node)) {
            if (!visited[element])
                dfs(element, visited, list);
        }
    }
}
