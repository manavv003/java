import java.util.Arrays;

public class SortAndDisplay {

    public static void main(String[] args) {
        // Ensure that exactly 5 command line arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integer numbers.");
            return;
        }
        
        // Array to store the integer values
        int[] numbers = new int[5];

        // Read integers from command line arguments
        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide only integer numbers.");
            return;
        }

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Display the minimum and maximum values
        System.out.println("Minimum value: " + numbers[0]);
        System.out.println("Maximum value: " + numbers[numbers.length - 1]);
    }
}
