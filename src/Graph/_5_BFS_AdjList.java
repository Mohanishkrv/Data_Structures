/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class _5_BFS_AdjList {
    int V;
    LinkedList<Integer> adj[];

    public _5_BFS_AdjList(int v) 
    {
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    
    public void BFS(int s)//s=start
    {
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(q.size()>0)
        {
            s=q.poll();
            System.out.print(s+" ");
            Iterator itr=adj[s].listIterator();
            while(itr.hasNext())
            {
                int n=(int) itr.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        _5_BFS_AdjList g=new _5_BFS_AdjList(4);
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
        g.BFS(2);
    }
    
}
