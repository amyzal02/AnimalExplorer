package animals; 

public class AquaticAnimal extends Animal
{
    public AquaticAnimal()
    {
        super("ocean", "Aquatic");
    }

    @Override
    public void action()
    {
        System.out.println("just keep swimming"); 
    }

    @Override
    public AquaticAnimal clone()
    {
        return new AquaticAnimal();
    }
}