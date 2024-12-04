
import java.util.Scanner;

class stack {
  int top = -1, s[], max;
  Scanner s1 = new Scanner(System.in);;

  stack() {
    max = 5;
    s = new int[max];
  }

  stack(int len) {
    max = len;
    s = new int[max];
  }

  void push() {
    int ele;
    if (top == max - 1)
      System.out.println("\nStack is Overflow..");
    else {
      top++;
      System.out.print("Enter New Element : ");
      ele = s1.nextInt();
      s[top] = ele;
    }
  }

  void pop() {
    if (top == -1)
      System.out.println("\nStack is Underflow..");
    else {
      System.out.println("\nRemove Element : " + s[top]);
      top--;
    }
  }

  void traverse() {
    if (top == -1)
      System.out.println("\nStack is Underflow..!!");
    else {
    	
      System.out.print("Elements : ");
      for (int i = top; i >= 0; i--)
        System.out.print(s[i] + " ");
    }
  }
}

class st {
  static Scanner sc=new Scanner(System.in);
  public static void operation(stack s)
  {
      do
      { 
         System.out.println("\n1.PUSH");
         System.out.println("2.POP");
         System.out.println("3.Traverse");
         System.out.println("0.Exit");
         System.out.print("Enter Your Choice : ");
         int c=sc.nextInt();
         switch (c) {
          case 1:
            s.push();
            break;
          case 2:
            s.pop();
            break;
          case 3:
            s.traverse();
            break;
          case 0:
            System.exit(0);
          default:System.out.println("\nPlease,enter valid one above choice");
            break;
         }
      }while(true);
  }
  public static void main(String args[])
  {

    boolean t=true;
    while(t)
    {
	  	  stack s1=new stack();
          operation(s1);
          t=false;
    
  }
  }
}