import models.PingPong;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PingPong playGame = new PingPong();
        Scanner myScan = new Scanner(System.in);
        System.out.println("I am Ping-Pong app!!!");
        try {
            System.out.println("Enter a number");
            int userNumber = myScan.nextInt();
            System.out.println(playGame.runPingPong(userNumber));
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry, please enter numbers only");
        }
    }
}
