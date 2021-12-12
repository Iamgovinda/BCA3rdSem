class A{
    private A(){};
    private int data = 60;
    private void msg(){
        System.out.println("Hello dear.......");
    }
}


public class Access_modifiers{
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println("Data: ", a1.data);
    }
}
