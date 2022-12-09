import Games.BattleshipGame.BattleshipMain;
import Games.Collors;
import Games.DiceMagicGame.BoardGame;
import Games.MonstersGame.MonsterMain;
import Games.TextEditor;
import player.Icons;
import player.Player;

import java.util.Scanner;

import static Games.TextEditor.separatorText;

public class BaseApp {
    static Scanner sc = new Scanner(System.in);
    static int option;
    static String name;

   public static void StartApp(){
       TextEditor.BaseIntro();
       TextEditor.GameList();
       option= sc.nextInt();
       switch (option){
           case 0:
               break;
           case 1:


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
               Player player1 = new Player(name,Icons.Pinto);
               MonsterMain.playMonsters(player0,player1);
               BaseApp.StartApp();
               break;
       }

   }


}
