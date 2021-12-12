import java.io.FileWriter;

public class FWExample{
public static void main(String[] args)
{
    try {
        FileWriter fw= new FileWriter("C:\\Users\\default.LAPTOP-6IMDNNN0\\Desktop\\student.txt");
        fw.write("Welcome to the java World!");
        fw.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    System.out.println("Writing success...");
}
}