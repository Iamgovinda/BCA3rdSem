public class CatHandler {

    public static void main(String[] args)
    {
        Catt cat1 = new Catt("Rani","red","blue","irregular","longwhisker",5,"Long tail","moody","German breed",7);
        System.out.println(cat1 instanceof Catt);

        System.out.println("Old name: " + cat1.getName());
        cat1.setName("puppy");
        System.out.println("New name: " + cat1.getName());

        cat1.seteyeColor("yellow");
        System.out.println("New color: " + cat1.geteyeColor());

    }
}
