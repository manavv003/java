import java.util.Arrays;

public class SortStrings {

    public static void main(String[] args) {
        // Ensure that exactly 5 command line arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 strings.");
            return;
        }
        
        // Copy command line arguments into a string array
        String[] strings = args.clone();

        // Sort the array of strings
        Arrays.sort(strings);

        // Display the sorted array
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
