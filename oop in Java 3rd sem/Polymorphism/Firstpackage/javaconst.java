public class javaconst {
    public String name;
    javaconst()
    {
        System.out.println("This is java constructer.");
        name="Pinku";
    }

    public static void main(String[] args)
    {
        javaconst newobj=new javaconst();
        System.out.println(newobj.name);
    }

}
