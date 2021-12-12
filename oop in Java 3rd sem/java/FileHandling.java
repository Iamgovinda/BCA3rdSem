import java.io.*;

public class FileHandling {
    public static void main(String args[]) {

        String str = "This is a line of text to be written.";
        try {

            // Open given file in append mode by creating an
            // object of BufferedWriter class
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt", true));

            // Writing on output stream
            for (int i = 1; i <= 10; i++) {
                out.write("line " + i + ">" + str + "\n");
            }
            // Closing the connection
            out.close();
        }

        // Catch block to handle the exceptions
        catch (Exception e) {

            // Display message when exception occurs
            e.getStackTrace();
        }

        try {
            FileInputStream input = new FileInputStream("test.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
