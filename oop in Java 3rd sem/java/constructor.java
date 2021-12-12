
//write a java program to demonstrate constructor.
public class constructor {
    int x;
    int y;
    int z;

    constructor()
    {
        System.out.println("constructor created.");
    }

    constructor(int x)
    {
        this.x=x;
        System.out.println(this.x);
    }

    constructor(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.print(this.x + " " + this.y);
    }

    constructor(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.print(this.x + " " + this.y + " " + this.z);
    }

    public static void main(String[] args)
    {
        constructor newobj1=new constructor();
        constructor newobj2=new constructor(4);
        constructor newobj3=new constructor(2,3);
        constructor newobj4=new constructor(2,3,4);
    }

}