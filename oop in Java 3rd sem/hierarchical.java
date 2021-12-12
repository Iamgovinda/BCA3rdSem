class A{

    void input()
    {
        System.out.println("Enter your name: ");        
    }
}

class B extends A{
    void name1(){
        System.out.println("Gobinda");
    }
}

class C extends B{
    void name2(){
        System.out.println("Netesh");
    }
}

public class hierarchical {
    public static void main(String[] args)
    {
        B n1=new B();
        C n2=new C();


        n1.input(); n1.name1();
        n2.input(); n2.name2();
    }
}
