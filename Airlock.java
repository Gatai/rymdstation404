import java.util.Scanner;

public class Airlock {
    Scanner scan = new Scanner(System.in);

    private int oxygenLevel; // suit
    private int energy;

    Crewmate crwm = new Crewmate("Player1", 100, 100, 100);
    
    public void lessOxygen (Crewmate crwm){
        crwm.setOxygenLevel(80);
        System.out.print("The Airlock is leaking! Your Oxygen Level has been dropped to " + crwm.getOxygenLevel() + ". You need to seal the airlock, FAST!");
    }

    public String toolChoice (){
        System.out.println("QUICK! You're running out of air! You need to close that leak NOW!");
        System.out.println("Make a choice, " +
        "\n 1. Get an Oxygen tank for an extra +10 oxygen level." +
        "\n 2. Risk your oxygen and use the silver tape to close the gap." +
        "\n 3. Give up...");
        
        Switch(toolChoice())
        case 1:
            System.out.println("");
            break;
        case 2:
            System.out.println("");
            break;
        case 3:
            System.out.println("");
            break;
        return;
    }



}
