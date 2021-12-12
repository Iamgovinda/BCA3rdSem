import java.util.Scanner;

public class userinput {
   
    int x;
    int y;

    userinput(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    int add(int x,int y)
    {
        return this.x+this.y;
    }

    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");

        int a=sc.nextInt();
        int b=sc.nextInt();

        userinput obj=new userinput(a, b);

        int result=obj.add(obj.x, obj.y);
        System.out.println(result);
    }
}
