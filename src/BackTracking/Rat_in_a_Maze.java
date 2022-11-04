/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

/**
 *
 * @author ASUS
 */
public class Rat_in_a_Maze {
    static int N;
    public static void main(String[] args)
    {
        int maze[][]={{ 1, 0, 0, 0 }, 
                      { 1, 1, 0, 1 },
                      { 0, 1, 0, 0 }, 
                      { 1, 1, 1, 1 }};
        
        N=maze.length;
        solveMaze(maze);
    }
    
    public static void solveMaze(int[][] maze)
    {
        int soln[][]=new int[N][N];
        /*
        Below code starts the Backtracking from initial point(0,0) as well as checks
        whether the solution will exist or not;
        */
        
        if(solveMazeUtil(maze,0,0, soln)==false)
        {
            System.out.print("Solution Doesnt Exist");
            return;
        }
        else
        {
            printSol(soln);
            return;
        }
    }
    public static void printSol(int[][] soln)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(soln[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solveMazeUtil(int[][] maze,int x,int y,int soln[][])
    {
        if(maze[x][y]==1 && x==N-1 && y==N-1)
        {
            soln[x][y]=1;
            return true;
        }
        if(isSafe(maze,x,y)==true)
        {
            soln[x][y]=1;
            if(solveMazeUtil(maze, x+1, y, soln))
            {
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, soln))
            {
                return true;
            }
            soln[x][y]=0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y) 
    {
         return(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);
    }
} 
