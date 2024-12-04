import java.util.*;

class ptr{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,no;
        System.out.print("Enter the number:");
        no=sc.nextInt();

        for(i=0;i<=no;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
 }