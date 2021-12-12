class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    
    void bark()
    {
        System.out.println("barking");
    }
}

class 

public class Testinheritance {
    public static void main(String[] args)
    {
        Dog newdog = new Dog();

        newdog.bark();
        newdog.eat();

    }
}
  