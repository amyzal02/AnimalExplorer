package client;

import animals.Animal;
import animals.AquaticAnimal;
import animals.LandAnimal;
import animals.AnimalRegistry;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Game
{

    private static Scanner kb = new Scanner(System.in);
    private static int option;
    private static int num; 

    public static void playGame()
    {
        System.out.println("\nWelcome to AnimalExplorer!\n");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        AnimalRegistry registry = new AnimalRegistry();

        boolean gameEnd = false;

        String[] names = {"Shelly", "Harold", "Willow", "Hummus", "Spots", "Sandy", "Jalepeno", "Cheetos", "WatterBottle"};

        while(!gameEnd){

            System.out.printf("\nWhere would you like to explore next?\n");

            gameOptions();


            String location = ""; 

            if(option == 3)
                gameEnd = true; 
            else
            {
                if(option == 1)
                    location = "land";
                else if(option == 2)
                    location = "ocean";
            

                Animal a = registry.getAnimal(location);

                a.setName(names[num % names.length]);
                num++;
                

                animals.add(a);

                System.out.printf("\nCurrent Location: %s" 
                    + "\nYou just discovered a %s!\n" , location, a.getType());
                    
                System.out.print(a.getName() + ": " );
                
                a.action();
            }

        }

        System.out.printf("\nHeres the animals that you saw on your adventure\n");

        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println(i + "  " +  animals.get(i));
        }
        System.out.printf("Goodbye. See you on your next adventure!\n");
    }


    public static void gameOptions()
    {
        boolean acceptable = false;

        while(!acceptable)
        {
            acceptable = true; 
            
            System.out.printf( "\n\tOption 1: Forest\n\tOption 2: Ocean\n\tOption 3: End Game\n");

            System.out.print("Your Selection: "); 

            try
            {
                option = kb.nextInt();

                if(option != 1 && option != 2 && option != 3)
                {
                    System.out.println("That's not an acceptable int. Try Again.");
                    acceptable = false;
                }
            } 
            catch(InputMismatchException e)
            {
                System.out.println("That's not an int. Try Again.");
                acceptable = false;
            }   

            String extra = kb.nextLine();
            
        }
    }
    

}