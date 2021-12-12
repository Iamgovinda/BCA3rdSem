public class passbyvalue {
    void display(int num)
    {
        num=num+25;

        System.out.println("Inside the method number is: "+ num);
    }

    public static void main(String[] args)
    {
        passbyvalue obj=new passbyvalue();
        int number=100;
        System.out.println("Number before calling a method is: "+ number);
        obj.display(number);
        System.out.println("Number before calling a method is: "+ number);

    }
}
