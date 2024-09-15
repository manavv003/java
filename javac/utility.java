import java.util.Scanner;

public class utility {

    public static long factorial(long value) {
        if (value < 0) {
            System.out.println("Factorial is not negative numbers.");
            return -1;
        }
        long res = 1;
        for (long i = 2; i <= value; i++) {
            res = res * i;
        }
        System.out.println("Factorial of "+value+" is: "+res);
        return res;
    }
    
    public static boolean isPrime(int value) {
        if (value <= 1) {
           
            System.out.println(value+" is not prime number");
            return false;

        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                System.out.println(value+" is not prime number");

                return false;
            }
        }
        System.out.println(value+" is prime number");

        return true;
    }

   
    public static boolean isEven(long value) {
        if(value%2==0)
        {
            System.out.println(value+" is Even number");
            return true;
        }
        else
        {
            System.out.println(value+" is not Even number");
            return false;
        }
    }

   
    public static boolean isOdd(long value) {
        if(value%2==1)
        {
            System.out.println(value+" is ODD number");
            return true;
        }
        else
        {
            System.out.println(value+" is not ODD number");
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        long f= s.nextLong();
        factorial(f);
       
        System.out.println("");
        System.out.print("Enter a number to check prime number: ");
        int p = s.nextInt();
        isPrime(p);

        System.out.println("");
        System.out.print("Enter a number to check even number: ");
        long e= s.nextLong();
        isEven(e);

        System.out.println("");
        System.out.print("Enter a number to check odd number: ");
        long o = s.nextLong();
        isOdd(o);

        s.close();
    }
}
