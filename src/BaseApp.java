import Games.BattleshipGame.BattleshipMain;
import Games.DiceMagicGame.BoardGame;
import Games.MonstersGame.MonsterMain;
import Games.TextEditor;
import Games.TheSimsJava.TheSims;
import player.Icons;
import player.Player;

import java.util.Scanner;

public class BaseApp {
    static Scanner sc = new Scanner(System.in);
    static String name;

    public static void StartApp() {
        boolean proceed = false;
        while (!proceed) {
            TextEditor.BaseIntro();
            TextEditor.GameList();
            int option;
            try {
                option = sc.nextInt();
                switch (option) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        TheSims.startTheSims();
                        BaseApp.StartApp();
                        break;
                    case 2:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        BoardGame.gameStart();
                        BaseApp.StartApp();
                        break;
                    case 3:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.print("Insert your Name:");
                        name = sc.next();
                        Player player = new Player(name);
                        BattleshipMain.playBattleship(player);
                        BaseApp.StartApp();
                        break;
                    case 4:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.print("Insert Player 1 Name:");
                        name = sc.next();
                        Player player0 = new Player(name, Icons.Pig);
                        System.out.print("Insert Player 2 Name:");
                        name = sc.next();
                        Player player1 = new Player(name, Icons.Pig);
                        MonsterMain.playMonsters(player0, player1);
                        BaseApp.StartApp();
                        break;
                }
                proceed = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Focus! Do you want to play or not? ");

            }
        }

    }

}
