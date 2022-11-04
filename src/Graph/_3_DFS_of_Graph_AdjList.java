/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author ASUS
 */
public class _3_DFS_of_Graph_AdjList  {
    int V;//No of Vertices
    LinkedList<Integer> adj[];//Adjacency List Representation

    public _3_DFS_of_Graph_AdjList(int v) 
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
   
    private void DFSUtil(int v, boolean[] visited) 
    {
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> itr=adj[v].listIterator();
        while(itr.hasNext())
        {
            int n=itr.next();
            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }
    
    public void DFS(int v)
    {
        boolean visited[]=new boolean[V];
        DFSUtil(v,visited);
    }
    
    public static void main(String[] args)
    {
        _3_DFS_of_Graph_AdjList g=new _3_DFS_of_Graph_AdjList(4);//2 0 1 3
        g.addEdge(0,1);
        g.addEdge(0,2);     //  1------>2-------|
        g.addEdge(1,2);     //  ^      ^|       |
        g.addEdge(2,0);     //  |    --||       |   
        g.addEdge(2,3);     //  |    |  !       |
        g.addEdge(3,3);     //  0----   3--|    |
                            //  ^       ^  |    |
                            //  |       |--|    |
                            //  |               |    
                            //  ----------------|
        g.DFS(2);
       
    }
}