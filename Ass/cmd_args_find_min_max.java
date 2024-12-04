import java.util.Arrays;
public class cmd_args_find_min_max {   
    public static void main (String[] args) {
        if (args.length ==0) {
            System.out.println("Please Enter integer arguments.");
            return;
        }
        int[] no = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) 
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
    
    
