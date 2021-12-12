public class Cat {
    private String name;
    private String furColor;
    private String eyeColor;
    private String earShape;
    private String whisker;
    private int size;
    private String tailType;
    private String character;
    private String breed;
    private int pawsSize;

    public Cat(String name, String furColor, String eyeColor, String earShape, String whisker, int size,
            String tailType, String character, String breed, int pawsSize) {
        this.name = name;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.earShape = earShape;
        this.whisker = whisker;
        this.size = size;
        this.tailType = tailType;
        this.breed = breed;
        this.character = character;
        this.pawsSize = pawsSize;
    }

    public void sleeps() {
        System.out.println("Cat is sleeping...");
    }

    public void meows() {
        System.out.println("Cat is meowing...");
    }

    public void killsrat() {
        System.out.println("Cat is killing a rat...");
    }

    public void plays()
    {
        System.out.println("Cat is playing...");
    }

}

