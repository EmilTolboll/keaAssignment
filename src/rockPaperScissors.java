import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

    public static int getWinningTool(int playerOneSelect,int playerTwoSelect){
        int tool;
        boolean isRockPresent = (playerOneSelect==1) || (playerTwoSelect==1);
        boolean isPaperPresent = (playerOneSelect==2) || (playerTwoSelect==2);
        boolean isScissorPresent = (playerOneSelect==3) || (playerTwoSelect==3);

        if (playerOneSelect==playerTwoSelect){
            tool = playerOneSelect;
        }else if (isRockPresent && isPaperPresent) {
            tool = 2;
        }else if (isRockPresent && isScissorPresent){
            tool = 1;
        }else {
            tool = 3;
        }
        return tool;
    }


    public static void main(String[] args) {


        String[] options =
                {"Singleplayer","Multiplayer"};

        System.out.println("Hi, select if you wish to play singleplayer or multiplayer? \n1 singleplayer\n2 multiplayer");

        Scanner sc = new Scanner(System.in);

        int singleOrMultiplayer = sc.nextInt();
        //int singleOrMultiplayer = 2;

        String[] choices = {"rock","paper","scissor"};

        // Singleplayer mode
        if(singleOrMultiplayer==1){
            // ask for names
            System.out.println("Okay, singleplayer it is. What is your name?");
            String playerName = sc.next();

            System.out.println("Thank you " + playerName + ". Please select \n1 rock\n2 paper\nor\n3 scissor");

            int playerSelect = sc.nextInt();

            Random randomObject = new Random();
            int computerSelect = randomObject.nextInt((3 - 1) + 1) + 1;
            System.out.println("Computer chose: " + choices[computerSelect-1]);
            // First I get winning tool - next I look for which player who has the tool and if both it is a draw
            int winningTool = getWinningTool(playerSelect,computerSelect);

            if(playerSelect==computerSelect){
                System.out.println("The game was a draw");
            }else if (playerSelect==winningTool){
                System.out.println(playerName + " won the game");
            }else{
                System.out.println("Computer won the game");
            }

            System.out.println("Winning tool:" + choices[getWinningTool(playerSelect,computerSelect)-1]);

        }

        // Multiplayer mode
        if(singleOrMultiplayer==2){
            // ask for names
            System.out.println("Okay, multiplayer it is. What is player 1's name?");
            String playerOneName = sc.next();
            System.out.println("And what is player 2's name?");
            String playerTwoName = sc.next();

            System.out.println("Thank you " + playerOneName + " and " + playerTwoName + ".");

            System.out.println( playerOneName + " please select \n1 rock\n2 paper\nor\n3 scissor");
            int playerOneSelect = sc.nextInt();
            System.out.println( playerTwoName + " please select \n1 rock\n2 paper\nor\n3 scissor");
            int playerTwoSelect = sc.nextInt();

            // First I get winning tool - next I look for which player who has the tool and if both it is a draw
            int winningTool = getWinningTool(playerOneSelect,playerTwoSelect);

            if(playerOneSelect==playerTwoSelect){
                System.out.println("The game was a draw");
            }else if (playerOneSelect==winningTool){
                System.out.println(playerOneName + " won the game");
            }else{
                System.out.println(playerTwoName + " won the game");
            }

            System.out.println("Winning tool:" + choices[getWinningTool(playerOneSelect,playerTwoSelect)-1]);


        }

    }
}
