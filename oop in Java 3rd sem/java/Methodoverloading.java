public class Methodoverloading {
    int x;
    int y;

    void setvalue(int x)
    {
        this.x=x;
    }

    void setvalue(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    void display(int x)
    {
        System.out.println("x= " + this.x);
    }

    void display(int x, int y)
    {
        System.out.println("x= "+this.x);
        System.out.println("y= "+this.y);
    }

    public static void main(String[] args)
    {
        Methodoverloading obj=new Methodoverloading();

        obj.setvalue(4);
        obj.display(obj.x);

        obj.setvalue(5,6);
        obj.display(obj.x,obj.y);
    }
}
