/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Iterator;

/**
 *
 * @author ASUS
 */
public class _4_DFS_Of_Graph_AdjMatrix {
    boolean adjMat[][];
    int V;
    
    public _4_DFS_Of_Graph_AdjMatrix(int V)
    {
        this.V=V;
        adjMat=new boolean[V][V];
    }
    
    public void addEdge(int i,int j)
    {
        adjMat[i][j]=true;
        adjMat[j][i]=true;
    }
    private void DFSUtil(int start_v, boolean[] visited) 
    {
        System.out.print(start_v+" ");
        visited[start_v]=true;
        for(int i=0;i<V;i++)
        {
            if(adjMat[start_v][i]==true && (visited[i]!=true))
            {
                DFSUtil(i, visited);
            }
        }
    }
    public void DFS(int start_v)
    {
        boolean visited[]=new boolean[V];
        DFSUtil(start_v,visited);
    }
    
    public static void main(String[] args)
    {
        _4_DFS_Of_Graph_AdjMatrix g=new _4_DFS_Of_Graph_AdjMatrix(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        /*for(int i=0;i<g.V;i++)
        {
            for(int j=0;j<g.V;j++)
            {
                System.out.print(g.adjMat[i][j]+" ");
            }
            System.out.println();
        }*/
        g.DFS(2);
    }
}