
import java.util.*;

public class Matrix {

  public static void main (String[] args) {
  	Scanner sc=new Scanner(System.in);
  	int i,j,k,row,col;
  	
  	System.out.print("Enter the number of rows:");
  	row=sc.nextInt();
  	
  	System.out.print("Enter the number of column:");
  	col=sc.nextInt();
  		
  	int mat1[][]=new int[row][col];
  	int mat2[][]=new int[row][col];
  	
  	int res[][]=new int[row][col];
  	
  	System.out.println("Enter data in the Matrix-1:");
  	for(i=0;i<row;i++)
  	{
  		for(j=0;j<col;j++)
  		{
  			mat1[i][j]=sc.nextInt();
  		}
  	}
  	System.out.println("Enter data in the Matrix-2:");
  	for(i=0;i<row;i++)
  	{
  		for(j=0;j<col;j++)
  		{
  			mat2[i][j]=sc.nextInt();
  		}
  	}
  	
  	System.out.println("Addition of matrix");
  	for(i=0;i<row;i++)
  	{
  		for(j=0;j<col;j++)
  		{
  			res[i][j]=mat1[i][j] + mat2[i][j];
  			System.out.print(res[i][j]+" ");
  		}
  		System.out.println("");
  	}
  	
  	System.out.println("Subtraction of matrix");
  	for(i=0;i<row;i++)
  	{
  		for(j=0;j<col;j++)
  		{
  			res[i][j]=mat1[i][j] - mat2[i][j];
  			System.out.print(res[i][j]+" ");
  		}
  		System.out.println("");
  	}
  	
  	
  	System.out.println("Matrix Multipication");
  	
  	for(i=0;i<row;i++)
  	{
  		for(j=0;j<col;j++)
  		{
  			res[i][j]=0;
  			for(k=0;k<col;k++)
  			{
  			res[i][j]+=mat1[i][k] * mat2[k][j];
  		
  			}
  			System.out.print(res[i][j]+" ");
  		}
  	
  		System.out.println("");
  	}
}
    
    
}