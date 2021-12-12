public class Catt {
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

    public Catt(String name, String furColor, String eyeColor, String earShape, String whisker, int size,
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

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setfurColor(String furColor)
    {
        this.furColor=furColor;
    }

    public String getfurcolor()
    {
        return this.furColor;
    }

    public void seteyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public String geteyeColor()
    {
        return this.eyeColor;
    }

    public void setearShape(String name)
    {
        this.earShape=earShape;
    }

    public String getearShape()
    {
        return this.earShape;
    }

    public void setWhisker(String name)
    {
        this.whisker=whisker;
    }

    public String getWhisker()
    {
        return this.whisker;
    }

    public void size(int size)
    {
        this.size=size;
    }

    public int getSize()
    {
        return this.size;
    }

    public void settailType(String tailType)
    {
        this.tailType=tailType;
    }

    public String gettailType()
    {
        return this.tailType;
    }

    public void setcharacter(String character)
    {
        this.character=character;
    }

    public String getcharacter()
    {
        return this.character;
    }

    public void setbreed(String breed)
    {
        this.breed=breed;
    }

    public String getbreed()
    {
        return this.breed;
    }

    public void setpawSize(int pawsSize)
    {
        this.pawsSize=pawsSize;
    }

    public int getpawSize()
    {
        return this.pawsSize;
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

