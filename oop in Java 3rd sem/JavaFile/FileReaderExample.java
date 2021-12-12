import java.io.FileReader;
public class FileReaderExample {
    public static void main(String[] args) throws Exception
    {
        FileReader Fr = new FileReader("C:\\Users\\default.LAPTOP-6IMDNNN0\\Desktop\\student.txt");
        int i;
        while((i=Fr.read())!=-1){
            System.out.print((char)i);
            
        }
            Fr.close();
        
    }
}
            
        

