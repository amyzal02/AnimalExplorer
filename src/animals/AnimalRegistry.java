package animals;

import java.util.HashMap;

public class AnimalRegistry
{

    private static HashMap<String, Animal> animalMap = initialize();

    private static HashMap<String, Animal> initialize()
    {
        HashMap<String, Animal> map = new HashMap<String, Animal>();

        map.put("ocean", new AquaticAnimal());
        map.put("land", new LandAnimal());

        return map;
    }

    public static Animal getAnimal(String loc)
    {
        return animalMap.get(loc).clone();      
    }  
}