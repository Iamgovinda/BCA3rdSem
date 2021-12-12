import java.util.Random;

public class generate_random_another_way {
    public static void main(String[] args)
    {
        System.out.println(9.8==9.8);
        Random random= new Random();
        int target=99;
        while(true)
        {
            int check= random.nextInt(100);
            //System.out.println(random.nextInt(100));
            System.out.println(check);
            if(target==check)
            {
                break;
            }
           
        }
    }
}
