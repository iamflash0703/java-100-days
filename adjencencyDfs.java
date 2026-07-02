import java.util.*;

public class adjencencyDfs{
    public static void dfs(int v, int[][] graph, boolean[] visited, char[] vertices){
        visited[v] = true;

        System.out.println(vertices[v] + " ");

        for(int i = 0; i < graph.length; i++){
            if(graph[v][i] == 1 && !visited[i]){
                dfs(i,graph,visited,vertices);
            }
        }
        
    }

    public static void main(String[] args){
        char[] vertices = {'A','B','C','D','E','F'};

        int[][] graph = {
    {0,1,0,0,0,0},
    {1,0,1,1,0,1},
    {0,1,0,0,1,0},
    {0,1,0,0,0,1},
    {0,0,1,0,0,0},
    {0,1,0,1,0,0}
};

        System.out.println("Adjacency Matrix");
        for(int i = 0;i < graph.length;i++){
            for(int j = 0;j < graph.length; j++){
                System.out.println(graph[i][j] + " ");
            }
            System.out.println();
        }

        boolean[] visited = new boolean[vertices.length];

        System.out.println("\nDfS Traversal");

        dfs(0,graph,visited,vertices);
    }
}