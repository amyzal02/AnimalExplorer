package animals; 

public abstract class Animal 
{
    protected String habitat; 
    protected String animalType;
    protected String name; 

    public abstract void action();

    public Animal(String h, String a)
    {
        this.habitat = h;
        this.animalType = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return animalType;
    }

    public abstract Animal clone();

    public String toString()
    {
        return name + "\t" + animalType + "\t" + habitat;
    }
}