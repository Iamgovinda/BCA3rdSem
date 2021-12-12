
import java.io.File;

import java.util.Scanner;


public class CreateFile{
    public static void main(String[] args) {
    //     File newFile = new File("file.txt");
    //     try {
    //         newFile.createNewFile();
    //     } catch (Exception e) {
    //         System.out.println("Unable to create file.");
    //     }
    // }

    //code to write string to the file.
    // try {
    //     FileWriter filewriter = new FileWriter("file.txt");
    //     filewriter.write("This is Our first file from this java course.");
    //     filewriter.close();
        
    // } catch (Exception e) {
    //     System.out.println("Not written to file.");
    // }

    File myfile  = new File("file.txt");

    try {
        Scanner sc = new Scanner(myfile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

}
}