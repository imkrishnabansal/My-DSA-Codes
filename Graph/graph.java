package Graph;

import java.util.ArrayList;
import java.util.*;
public class graph {
    static class edge{
        int src;
        int dest;
        public edge(int s,int d){
            this.src = s;
            this.dest =d;
        }
    }
    public static void crategraph( ArrayList<edge>graph[] ){
        for(int i= 0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));
        graph[0].add(new edge(1,2));
        graph[0].add(new edge(1,3));
        graph[0].add(new edge(2,0));
        graph[0].add(new edge(2,1));
        graph[0].add(new edge(2,3));
        graph[0].add(new edge(3,1));
        graph[0].add(new edge(3,2));
    }
    public static void main(String[] args) {
        int v =4;
        ArrayList<edge>graph[] = new ArrayList[4];
        crategraph(graph);
        for(int i = 0;i<graph[1].size();i++){
            edge e =  graph[1].get(i);
            System.out.println(e.dest+" ");
        }
    }
}
