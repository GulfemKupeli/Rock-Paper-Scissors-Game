import java.util.Scanner;

public class RockScissors {
    public static void main (String[] args){
        /**

         Program description:Rocks Papers Scissors Game

         Author: Gülfem Küpeli

         E-mail address: 210401024@ogr.ikcu.edu.tr

         Homework Number: 02

         Last Changed: 2/11/2023

         */


        Scanner scanner = new Scanner(System.in);
//I used toLowerCase() to avoid case sensitivity.
        System.out.println("ROCKS-PAPERS-SCISSORS GAME!!!");
        System.out.println("Player 1, enter your choice(r/s/p): ");
        String player_one = scanner.nextLine();
        player_one = player_one.toLowerCase();

        System.out.println("Player 2, enter your choice(r/s/p): ");
        String player_two = scanner.nextLine();
        player_two = player_two.toLowerCase();
//I used if else statement to indicate the dominance of inputs. Then print statement calls howWon method.
        if(player_one.equals(player_two)) {
            System.out.println("You drew!!! Nobody wins.");
        } else if ((player_one.equals("r") && player_two.equals("s")) ||
                (player_one.equals("p") && player_two.equals("r")) ||
                (player_one.equals("s") && player_two.equals("p"))) {
            System.out.println("Player 1  wins!!!" + howWon(player_one));
            
        }else
            System.out.println("Player 2  wins!!!" + howWon(player_two));


    }
//The program announces the winner as well as the basis for determining the winner using switch statement.
    public static String howWon(String win) {
        switch (win) {
            case "r":
                return "Rock breaks scissors.";
            case "s":
                return "Scissors cuts paper.";
            case "p":
                return "Paper covers rock.";
            default:
                return "invalid";
        }
    }
}

