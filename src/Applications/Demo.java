public class Demo
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to the Watauga Humane Society!");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal litter1 = new Cat("tabby", "3", "orange", "female", false, "Pumpkin");

        Array names = {"Pumpkin", "Spice", "baby back ribs"};
        Array sexes = {"female", "male"}; 

        Animal copy; 

        for(int i = 0; i < litter1.length; i++)
        {
            copy = litter1.copy();
            copy.setName(names[i]);
            copy.setSex(sexes[i % 2]);

            animals.add(copy);
        }




        Animal litter2 = new Cat("maine coon", "5", "brown", "male", true, "Flame Eyes");

        Animal litter3 = new Dog("golden retriver", "10", "golden", "female", false, "Sandy");

        Animal litter4 = new Cat("black lab", "12", "black", "male", true, "Frank");

        animals.add(litter1, c, d, ); 
    }
}