package animals; 

public class LandAnimal extends Animal
{
    public LandAnimal()
    {
        super("land", "Land");
    }

    @Override
    public void action()
    {
        System.out.println("walking and walking"); 
    }

    @Override
    public LandAnimal clone()
    {
        return new LandAnimal();
    }
}