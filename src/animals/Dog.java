package animals; 

public class Dog implements Animal
{

    public Dog(String breed, int age, String color, String sex, boolean vaccinated, String name)
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
        return new Dog(breed, age, color, sex, vaccinated, name);
    }
}
