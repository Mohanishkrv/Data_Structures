/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Priority_Queue {
    
  static int front,rear;
  public static void main(String[] args)
  {
    System.out.println("Enter Size");;
    int size=5;
    int a[]=new int[size];
    int p[]=new int[size];
  }
  
  public static void enqueue(int data,int pri,int a[],int p[],int size)
  {
      if(size==rear)
      {
          System.out.println("Queue is full");
          return;
      }
      else
      {
          for(int i=0;i<size;i++)
          {
            a[rear]=data;
            p[rear]=pri;
            rear++;  
          }
      }
  }
      
      public static void dequeue(int a[],int p[],int size)
      {
          if(front==rear)
          {
              System.out.println("Queue is empty");
              return;
          }
          else
          {
              for(int i=0;i<rear-1;i++)
              {
                  a[i]=a[i+1];
              }
              if(rear<size && )
              {
                  a[size]=0;
              }
              rear--;
          }
      }
  
    
}
