import java.io.*;
import java.util.*;

public class file {

    // Method to copy contents from one file to another
    public static void copyf(File a, File b) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(a);
            fos = new FileOutputStream(b);

            int n;
            while ((n = fis.read()) != -1) {
                fos.write(n);
            }
            System.out.println("File copied successfully...");
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file name (file to read):");
        String a = sc.nextLine();
        File x = new File(a);

        // Check if the source file exists
        if (!x.exists()) {
            System.out.println("Source file does not exist. Exiting program.");
            return;
        }

        System.out.println("Enter destination file name (file to write):");
        String b = sc.nextLine();
        File y = new File(b);

        // Call the method to copy files
        copyf(x, y);
    }
}
