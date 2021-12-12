public class oop {
    int x;
    int y;

    oop(int x, int y)
    {
        this.x=x;
        this.y=y;
    }


    void addition()
    {
        int c=this.x+this.y;
        System.out.println("addition="+c);
    
    }

    void subtraction()
    {  
        int c=this.x-this.y;
        System.out.println("subtraction"+c);
    
    }

    void multiplication()
    {
        int c=this.a*this.b;
        System.out.println("multiplication="+c);
    
    }

    void division()
    {
        int c=this.a/this.b;
        System.out.println("division="+c);
    
    }
    public static void main(String[] args)
    {
       oop obj1= new oop(10,2);
       
       obj1.addition();
       obj1.subtraction();
       obj1.multiplication();
       obj1.division();

    }
}
