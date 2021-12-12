class outerclass{
    int x=10;
    class innerclass{
        int y=15;
    }
}

public class nestedclass {
    public static void main(String[] args)
    {
        outerclass myouter=new outerclass();
        outerclass.innerclass myinner = myouter.new innerclass();
        System.out.print(myinner.y+ ", " + myouter.x);

    }
}
