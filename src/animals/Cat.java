package animals; 

public class Cat implements Animal
{

    public Cat(String breed, int age, String color, String sex, boolean vaccinated, String name)
    {
        this.breed = breed;     
        this.age = age;
        this.color = color;     
        this.sex = sex;     
        this.vaccinated = vaccinated;    
        this.name = name;
    }

    @Override 
    public Animal copy()
    {
        return new Cat(breed, age, color, sex, vaccinated, name);
    }

    public void setName(String name)
    {
        this.name = name; 
    }

    public void setSex(String Sex)
    {
        this.sex = sex; 
    }


    
}