
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Crewmate[] myCrew = createCrew();

        Airlock myAirlock = new Airlock();
        // Lab myLab = new Lab();
        // Reactor myReactor = new Reactor();

        // yerOne = new Crewmate("PlayerOne", 100, 100, 100);
        // Crewmate playerTwo = new Crewmate("Player", 100, 100, 100);
        // Airlock airlock = new Airlock();

        myAirlock.lessOxygen(myCrew[0]);
        myAirlock.toolChoice();
        // airlock.lessOxygen(playerOne);
        // airlock.lessOxygen(playerTwo);

        // int toolChoice = scan.nextInt();

        scan.close();
    }

    public static Crewmate[] createCrew() {
        Crewmate[] myCrew = new Crewmate[2];
        myCrew[0] = new Crewmate("Cajsa", 50, 300, 40);
        myCrew[1] = new Crewmate("Phatchari", 50, 300, 30);
        return myCrew;
    }

}
