public class testanimal {
    public static void main(String[] args)
    {
        Dogg d=new Dogg();
        babydogg bd=new babydogg();


        //hierarichal inheritance---one parent can have multiple childrens!...in which siblings donot inherit eachother....only they can 
        //inherit their parent.

        
        bd.eat();
        d.bark();
        bd.weep();
    }
}
