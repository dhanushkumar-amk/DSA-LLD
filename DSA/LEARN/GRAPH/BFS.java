package DSA.LEARN.GRAPH;

import java.util.*;

public class BFS {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);

        ArrayList<Integer> result = bfs(adj);

        System.out.println(result);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            ans.add(node);

            for (int it : adj.get(node)) {
                if (!visited[it]) {
                    visited[it] = true;
                    queue.offer(it);
                }
            }
        }

        return ans;
    }
}