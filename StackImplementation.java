package StackImp;

import java.util.*;
public class StackImplementation {
	static int N=10;
	static int stack[]= new int[10];
	static int top=-1;
	static int isfull()
	{
	  if(top==N-1)
	    return 1;
	  else
	   return 0;
	}
	static int isempty()
	{
	  if(top==-1)
	    return 1;
	  else
	   return 0;
	}
	static void push(int x)
	{
	  if(isfull()==1)System.out.println("Stack is already full");
	  else
	    {
	      top++;
	      stack[top]=x;
	      System.out.println("\nPush operation successfull ");
	    }
	}
	static void traverse()
	{
	  int i;
	  if(isempty()==1)
		  System.out.println("No elements to be displayed");
	  else
	  {
		  System.out.println("Stack elemeents are: ");
	    for(i=0;i<=top;i++)System.out.println(stack[i]);
	  }
	}
	static void pop()
	{
	  if(isempty()==1)
		  System.out.println("Stack is already empty");
	  else
	  {
		  System.out.println("Deleted number in stack is: "+stack[top]);
	    top--;

	  }
	}

		  
		    public static void main (String[] args)
		    {
		    	 int choice,info;
		    	 Scanner sc = new Scanner(System.in);
		    	  while(true)
		    	{  System.out.println("Choose  the operation you would like to perform :1.Push 2.Pop 3.Traverse 4.Exit ..........Enter your choice : ");
		    	  choice=sc.nextInt();
		    	  switch(choice)
		    	  {
		    	    case 1:System.out.println("Enter the information to be inserted: ");
		    	    info=sc.nextInt();
		    	    push(info);
		    	    break;
		    	    case 2: pop();
		    	    break;
		    	    case 3: traverse();
		    	    break;
		    	    case 4:return;
		    	   
		    	    default:System.out.println("Wrong choice");
		    	  }
		    	}
		    }
		

}
