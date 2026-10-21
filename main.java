import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Crewmate playerOne = new Crewmate("PlayerOne", 100, 100, 100);
        Crewmate playerTwo = new Crewmate("Player", 100, 100, 100);
        Airlock airlock = new Airlock();
        
        airlock.lessOxygen(playerOne);
        airlock.lessOxygen(playerTwo);

        
        int toolChoice = scan.nextInt();



    }
}
