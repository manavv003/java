import java.util.Arrays;

public class SortAndFindMinMax {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly five integer numbers.");
            return;
        }
        int[] numbers = new int[5];
        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
            Arrays.sort(numbers);
            int min = numbers[0];
            int max = numbers[4];
			
            System.out.println("Sorted numbers: " + Arrays.toString(numbers));
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        } catch (NumberFormatException e) {
           System.out.println("Please make sure all arguments are valid integers.");
        }
    }
}