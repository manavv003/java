import java.util.Arrays;
public class SortStrings {
    public static void main(String[] args) {
		//System.out.println("Enter the string:");
        if (args.length != 5) {
            System.out.println("Please provide exactly five strings.");
            return;
        }
        String[] strings = new String[5];
		for (int i = 0; i < 5; i++) {
            strings[i] = args[i];
        }
        Arrays.sort(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}