package DSA.LEARN.GRAPH;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();

        boolean[] visited = new boolean[adj.size()];
        visited[0] = true;

        dfs(0, visited, adj, list);

        return list;
    }

    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        visited[node] = true;
        list.add(node);

        for (Integer element : adj.get(node)){
            if (!visited[element]){
                dfs(element, visited, adj, list);
            }
        }
    }
}
