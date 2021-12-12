class rectangle{
    public int calculatearea(int length,int breadth )
    {
        return length*breadth;
    }
}

public class rectanglee {
    public static void main(String[] args)
    {
        rectangle rec =new rectangle();
        int length=12;
        int breadth=32;
    
        System.out.println(rec.calculatearea(length, breadth));
    }
}
