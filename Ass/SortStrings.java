import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {

        if (args.length ==0) {
            System.out.println("Please Enter only five strings.");
            return;
        }

        String[] s = new String[args.length];
        
        for (int i = 0; i < args.length; i++) {
            s[i] = args[i];
        }

        Arrays.sort(s);

        System.out.println("Sorted strings is:");
        for (String str : s) {
            System.out.println(str);
        }
    }
}
