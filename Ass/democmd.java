import java.util.Arrays;
public class democmd {   
    public static void main (String[] args) {
        if (args.length!=5) {
            System.out.println("Please Enter 5 integer arguments.");
            return;
        }
        int[] no = new int[5];
        try {
            for (int i = 0; i < 5; i++) 
            {
                no[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e) {
            System.out.println("Please Enter only integer value.");
         
            return;
        }
        Arrays.sort(no);
        System.out.println("Sorted integers value:");
        for (int number : no) {
            System.out.print(" "+number);
        }
        System.out.println("");
        System.out.println("Minimum value is: " + no[0]);
        System.out.println("Maximum value is: " + no[no.length - 1]);
  }
}
    
    
