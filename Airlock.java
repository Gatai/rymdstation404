import java.util.Scanner;

import Enum.Item;

public class Airlock {
    Scanner scan = new Scanner(System.in);

    //private int oxygenLevel; // suit
    //private int energy;

    //Crewmate crwm = new Crewmate("Player1", 100, 100, 100);
    
    public void lessOxygen (Crewmate crewMate){
        int currentOxygenLevel = crewMate.getOxygenLevel();
        crewMate.setOxygenLevel(currentOxygenLevel - 5);
        System.out.print("The Airlock is leaking! Your Oxygen Level has been dropped to " + crewMate.getOxygenLevel() + ". You need to seal the airlock, FAST!");
    }

    public void toolChoice ()
    {
        System.out.println("QUICK! You're running out of air! You need to close that leak NOW!");
        System.out.println("Make a choice, " +
        "\n 1. Get an Oxygen tank for an extra +10 oxygen level." +
        "\n 2. Risk your oxygen and use the silver tape to close the gap." +
        "\n 3. Give up...");
        
        for (Item item : Item.values()) 
        { 
            System.out.println(item.getName()); 
            System.out.println(item.getPoint());
        }

      
        
        int itemChoice = scan.nextInt();
        switch(itemChoice)
        {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            default:
                System.out.println("You have entered an invalid choice.");           
        
        }
    }
}
     




