import java.util.Scanner;
public class ConsoleInput {
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Entered number is: " + num);
        System.out.println("Entered name is: " + name);
    }

}
