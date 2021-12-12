import java.lang.Math;
public class generaterandom {
    
    public static void main(String[] args)
    {
        int target=99;
        while(true)
        {
           // System.out.println((int)(Math.random()*100));
           int check = (int)(Math.random()*100);
           System.out.println(check);
           if(target == check) {
               break;
           }
            
        }
    }
}
