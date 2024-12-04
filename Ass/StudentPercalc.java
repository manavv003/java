import java.io.*;
import java.util.*;

public class StudentPercalc{

    public static void main(String[] args) {
        // Input file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the input text file (with path if needed):");
        String fileName = sc.nextLine();

        File inputFile = new File(fileName);

        // Check if the file exists
        if (!inputFile.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            System.out.printf("%-10s %-15s %-10s\n", "Roll No", "Name", "Percentage");
            System.out.println("---------------------------------------");

            String line;
            while ((line = br.readLine()) != null) {
                // Split the line using tab as the delimiter
                String[] fields = line.split("\t");

                // Parse the fields
                if (fields.length < 5) {
                    System.out.println("Invalid record found: " + line);
                    continue;
                }

                String rollNo = fields[0];
                String name = fields[1];
                double mark1 = Double.parseDouble(fields[2]);
                double mark2 = Double.parseDouble(fields[3]);
                double mark3 = Double.parseDouble(fields[4]);

                // Calculate percentage
                double totalMarks = mark1 + mark2 + mark3;
                double percentage = (totalMarks / 300) * 100;

                // Print student details with percentage
                System.out.printf("%-10s %-15s %-10.2f\n", rollNo, name, percentage);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing numerical data: " + e.getMessage());
        }
    }
}
