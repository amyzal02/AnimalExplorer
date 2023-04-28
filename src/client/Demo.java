package client;

import animals.Animal;
import animals.AquaticAnimal;
import animals.LandAnimal;
import animals.AnimalRegistry;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Demo
{

    private static Scanner kb = new Scanner(System.in);
    private static int option;

    public static void main(String [] args)
    {

        boolean programDone = false;

        while(!programDone) {

            System.out.printf("Hello! What would you like to do?\n");

            programOptions();

            if(option == 1)
                aboutMe();
            else if(option == 2)
                Game.playGame();
            else
                programDone = true; 
        
        }

    }

    public static void programOptions()
    {
        boolean acceptable = false;

        while(!acceptable)
        {
            acceptable = true; 
            
            System.out.printf( "\n\tOption 1: Learn about me\n\tOption 2: Play Game\n\tOption 3: End Program\n");

            System.out.print("Your option: "); 

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

    public static void aboutMe()
    {
        /*String function = "
            I created a very basic adventure game called Animal Explorer. 
            The player just goes around to different terrains and sees different animals.
            There are two different types of animals, Aquatic and Land, which you will see depending on area"; 

        String why = "
            The prototype pattern makes it so you the clients don't have to know
            exactly what type of animal they need to make. It also makes it easier for the
            addition of new types of animals. You can just create a new class that extends
            animal and add it to the registry.";*/



        String format = 
            
            "\n------------------------------------------------------------------------------"

            + "\n\nAbout me Section"

                +"\n\nPattern:" 
                    +"\n\tPrototype Pattern"
                +"\n\nWhat it does:"
                    +"\n\tI created a very basic adventure game called Animal Explorer." 
                    +"\n\tThe player just goes around to different terrains and sees different animals."
                    +"\n\tThere are two different types of animals, Aquatic and Land, which you will see depending on area"
                +"\n\nHow is this pattern useful?"
                    +"\n\tThe prototype pattern makes it so you the clients don't have to know"
                    +"\n\texactly what type of animal they need to make. Making instances of the animals"
                    + "\n\tis easier since the client doesn't have to call the constructor. "
                    + "\n\tIt also makes it easier for the"
                    +"\n\taddition of new types of animals. You can just create a new class that extends"
                    +"\n\tanimal and add it to the registry." 

            + "\n-----------------------------------------------------------------------------\n\n";

        
        System.out.println(format);

        exit();
        
    }

    public static void exit()
    {
        System.out.print("Press enter when you are ready to go back to the main menu.\t");

        String a = kb.nextLine();
    }


}