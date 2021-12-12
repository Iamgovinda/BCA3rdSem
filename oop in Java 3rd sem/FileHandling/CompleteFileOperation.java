import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CompleteFileOperation {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your Message: ");
        String msg = sc1.nextLine();
        sc1.close();

        File newfile = new File("Test.txt");
        File newfile2 =new File("Test2.txt");
        
        try {
            newfile.createNewFile();
            FileWriter filewriter = new FileWriter("Test.txt");

            filewriter.write(msg);
            filewriter.close();

            Scanner sc2 = new Scanner(newfile);
            FileWriter fileWriter2 = new FileWriter("Test2.txt");

            while(sc2.hasNextLine()){
                String newline = sc2.nextLine();
                fileWriter2.write(newline);
            }

            fileWriter2.close();
            sc2.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
