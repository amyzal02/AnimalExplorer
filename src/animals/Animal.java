package animals; 

public interface Animal
{
    private String breed;
    private int age; 
    private String color;  
    private String sex;      
    private boolean vaccinated;
    private String name; 


    public Animal copy();
}