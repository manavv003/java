package org.gvp.dcs.ds;


class packagedemo{
	private double top;
	private int []arr;
	
	public Stack(){
		top=-1;
		arr[]=int arr[5];
	}
	public Stack(int size){
		this();
		this.top=top;
		arr=new int[size];
	}
	public void push(int value)
	{
		arr[++top]=value;
		
	}
	public int pop()
	{
		top--;
		value=arr[top+1];
		return value;
	}
	public void dispaly()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}

class Queue{
	private double front;
	private double rear;
	private int []arr;
	
	public Queue(){
		front=-1;
		arr=int arr[5];
		rear=arr-1;
	}
	public Queue(int size){
		this();
		this.top=top;
		arr=int [arr[size]];
		this.rear=rear;
	}
	public void push()
	{
		arr[front++];
	}
	public int pop()
	{
		rear--;
		arr[rear-1];
		return arr[rear];
	}
	public void dispaly()
	{
		for(int i=front;i>=rear;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
