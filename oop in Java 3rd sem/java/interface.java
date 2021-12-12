interface abc{
    void display();
}

class bcd{
    void display()
    {
        System.out.println("This is display function.");
    }
}

class xyz extends bcd implements abc{
    void display();

}

class interface{
    public static void main(String[] args)
    {
        abc obj=new xyz();
        obj.display();
    }
    
}
