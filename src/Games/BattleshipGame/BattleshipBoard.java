package Games.BattleshipGame;

import Games.Colors;
import Games.TextEditor;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BattleshipBoard {


    static ArrayList<ArrayList<String>> seaBoard = new ArrayList<>();
    static ArrayList<ArrayList<String>> enemyBoard = new ArrayList<>();

    static ArrayList<ArrayList<String>> enemyBoardHidden = new ArrayList<>();

    public static void setSeaBoard() {
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

    }

    public static void seeSeaBoard() {
        System.out.println();
        System.out.println("              Y");
        System.out.println("              ⬇️         "+ Colors.blueColor +"🌊|| YOUR SEA ||🌊                                                                                                         "+ Colors.redColor +"🌊|| ENEMY SEA ||🌊"+ Colors.resetColor);
        System.out.println("         X ➡️     "+ Colors.blueColor +"0   1   2   3   4   5   6   7   8   9"+ Colors.redColor +"                                                                                    0   1   2   3   4   5   6   7   8   9");
        System.out.println("              "+ Colors.blueColor +"0"+ Colors.resetColor +" |" + seaBoard.get(0).get(0) + "|" + seaBoard.get(1).get(0) + "|" + seaBoard.get(2).get(0) + "|" + seaBoard.get(3).get(0) + "|" + seaBoard.get(4).get(0) + "|" + seaBoard.get(5).get(0) + "|" + seaBoard.get(6).get(0) + "|" + seaBoard.get(7).get(0) + "|" + seaBoard.get(8).get(0) + "|" + seaBoard.get(9).get(0) + "|                                                                              "+ Colors.redColor +"0"+ Colors.resetColor +" |" + enemyBoard.get(0).get(0) + "|" + enemyBoard.get(1).get(0) + "|" + enemyBoard.get(2).get(0) + "|" + enemyBoard.get(3).get(0) + "|" + enemyBoard.get(4).get(0) + "|" + enemyBoard.get(5).get(0) + "|" + enemyBoard.get(6).get(0) + "|" + enemyBoard.get(7).get(0) + "|" + enemyBoard.get(8).get(0) + "|" + enemyBoard.get(9).get(0) + "|");
        System.out.println("              "+ Colors.blueColor +"1"+ Colors.resetColor +" |" + seaBoard.get(0).get(1) + "|" + seaBoard.get(1).get(1) + "|" + seaBoard.get(2).get(1) + "|" + seaBoard.get(3).get(1) + "|" + seaBoard.get(4).get(1) + "|" + seaBoard.get(5).get(1) + "|" + seaBoard.get(6).get(1) + "|" + seaBoard.get(7).get(1) + "|" + seaBoard.get(8).get(1) + "|" + seaBoard.get(9).get(1) + "|                                                                              "+ Colors.redColor +"1"+ Colors.resetColor +" |" + enemyBoard.get(0).get(1) + "|" + enemyBoard.get(1).get(1) + "|" + enemyBoard.get(2).get(1) + "|" + enemyBoard.get(3).get(1) + "|" + enemyBoard.get(4).get(1) + "|" + enemyBoard.get(5).get(1) + "|" + enemyBoard.get(6).get(1) + "|" + enemyBoard.get(7).get(1) + "|" + enemyBoard.get(8).get(1) + "|" + enemyBoard.get(9).get(1) + "|");
        System.out.println("              "+ Colors.blueColor +"2"+ Colors.resetColor +" |" + seaBoard.get(0).get(2) + "|" + seaBoard.get(1).get(2) + "|" + seaBoard.get(2).get(2) + "|" + seaBoard.get(3).get(2) + "|" + seaBoard.get(4).get(2) + "|" + seaBoard.get(5).get(2) + "|" + seaBoard.get(6).get(2) + "|" + seaBoard.get(7).get(2) + "|" + seaBoard.get(8).get(2) + "|" + seaBoard.get(9).get(2) + "|                                                                              "+ Colors.redColor +"2"+ Colors.resetColor +" |" + enemyBoard.get(0).get(2) + "|" + enemyBoard.get(1).get(2) + "|" + enemyBoard.get(2).get(2) + "|" + enemyBoard.get(3).get(2) + "|" + enemyBoard.get(4).get(2) + "|" + enemyBoard.get(5).get(2) + "|" + enemyBoard.get(6).get(2) + "|" + enemyBoard.get(7).get(2) + "|" + enemyBoard.get(8).get(2) + "|" + enemyBoard.get(9).get(2) + "|");
        System.out.println("              "+ Colors.blueColor +"3"+ Colors.resetColor +" |" + seaBoard.get(0).get(3) + "|" + seaBoard.get(1).get(3) + "|" + seaBoard.get(2).get(3) + "|" + seaBoard.get(3).get(3) + "|" + seaBoard.get(4).get(3) + "|" + seaBoard.get(5).get(3) + "|" + seaBoard.get(6).get(3) + "|" + seaBoard.get(7).get(3) + "|" + seaBoard.get(8).get(3) + "|" + seaBoard.get(9).get(3) + "|                                                                              "+ Colors.redColor +"3"+ Colors.resetColor +" |" + enemyBoard.get(0).get(3) + "|" + enemyBoard.get(1).get(3) + "|" + enemyBoard.get(2).get(3) + "|" + enemyBoard.get(3).get(3) + "|" + enemyBoard.get(4).get(3) + "|" + enemyBoard.get(5).get(3) + "|" + enemyBoard.get(6).get(3) + "|" + enemyBoard.get(7).get(3) + "|" + enemyBoard.get(8).get(3) + "|" + enemyBoard.get(9).get(3) + "|");
        System.out.println("              "+ Colors.blueColor +"4"+ Colors.resetColor +" |" + seaBoard.get(0).get(4) + "|" + seaBoard.get(1).get(4) + "|" + seaBoard.get(2).get(4) + "|" + seaBoard.get(3).get(4) + "|" + seaBoard.get(4).get(4) + "|" + seaBoard.get(5).get(4) + "|" + seaBoard.get(6).get(4) + "|" + seaBoard.get(7).get(4) + "|" + seaBoard.get(8).get(4) + "|" + seaBoard.get(9).get(4) + "|                                                                              "+ Colors.redColor +"4"+ Colors.resetColor +" |" + enemyBoard.get(0).get(4) + "|" + enemyBoard.get(1).get(4) + "|" + enemyBoard.get(2).get(4) + "|" + enemyBoard.get(3).get(4) + "|" + enemyBoard.get(4).get(4) + "|" + enemyBoard.get(5).get(4) + "|" + enemyBoard.get(6).get(4) + "|" + enemyBoard.get(7).get(4) + "|" + enemyBoard.get(8).get(4) + "|" + enemyBoard.get(9).get(4) + "|");
        System.out.println("              "+ Colors.blueColor +"5"+ Colors.resetColor +" |" + seaBoard.get(0).get(5) + "|" + seaBoard.get(1).get(5) + "|" + seaBoard.get(2).get(5) + "|" + seaBoard.get(3).get(5) + "|" + seaBoard.get(4).get(5) + "|" + seaBoard.get(5).get(5) + "|" + seaBoard.get(6).get(5) + "|" + seaBoard.get(7).get(5) + "|" + seaBoard.get(8).get(5) + "|" + seaBoard.get(9).get(5) + "|                                                                              "+ Colors.redColor +"5"+ Colors.resetColor +" |" + enemyBoard.get(0).get(5) + "|" + enemyBoard.get(1).get(5) + "|" + enemyBoard.get(2).get(5) + "|" + enemyBoard.get(3).get(5) + "|" + enemyBoard.get(4).get(5) + "|" + enemyBoard.get(5).get(5) + "|" + enemyBoard.get(6).get(5) + "|" + enemyBoard.get(7).get(5) + "|" + enemyBoard.get(8).get(5) + "|" + enemyBoard.get(9).get(5) + "|");
        System.out.println("              "+ Colors.blueColor +"6"+ Colors.resetColor +" |" + seaBoard.get(0).get(6) + "|" + seaBoard.get(1).get(6) + "|" + seaBoard.get(2).get(6) + "|" + seaBoard.get(3).get(6) + "|" + seaBoard.get(4).get(6) + "|" + seaBoard.get(5).get(6) + "|" + seaBoard.get(6).get(6) + "|" + seaBoard.get(7).get(6) + "|" + seaBoard.get(8).get(6) + "|" + seaBoard.get(9).get(6) + "|                                                                              "+ Colors.redColor +"6"+ Colors.resetColor +" |" + enemyBoard.get(0).get(6) + "|" + enemyBoard.get(1).get(6) + "|" + enemyBoard.get(2).get(6) + "|" + enemyBoard.get(3).get(6) + "|" + enemyBoard.get(4).get(6) + "|" + enemyBoard.get(5).get(6) + "|" + enemyBoard.get(6).get(6) + "|" + enemyBoard.get(7).get(6) + "|" + enemyBoard.get(8).get(6) + "|" + enemyBoard.get(9).get(6) + "|");
        System.out.println("              "+ Colors.blueColor +"7"+ Colors.resetColor +" |" + seaBoard.get(0).get(7) + "|" + seaBoard.get(1).get(7) + "|" + seaBoard.get(2).get(7) + "|" + seaBoard.get(3).get(7) + "|" + seaBoard.get(4).get(7) + "|" + seaBoard.get(5).get(7) + "|" + seaBoard.get(6).get(7) + "|" + seaBoard.get(7).get(7) + "|" + seaBoard.get(8).get(7) + "|" + seaBoard.get(9).get(7) + "|                                                                              "+ Colors.redColor +"7"+ Colors.resetColor +" |" + enemyBoard.get(0).get(7) + "|" + enemyBoard.get(1).get(7) + "|" + enemyBoard.get(2).get(7) + "|" + enemyBoard.get(3).get(7) + "|" + enemyBoard.get(4).get(7) + "|" + enemyBoard.get(5).get(7) + "|" + enemyBoard.get(6).get(7) + "|" + enemyBoard.get(7).get(7) + "|" + enemyBoard.get(8).get(7) + "|" + enemyBoard.get(9).get(7) + "|");
        System.out.println("              "+ Colors.blueColor +"8"+ Colors.resetColor +" |" + seaBoard.get(0).get(8) + "|" + seaBoard.get(1).get(8) + "|" + seaBoard.get(2).get(8) + "|" + seaBoard.get(3).get(8) + "|" + seaBoard.get(4).get(8) + "|" + seaBoard.get(5).get(8) + "|" + seaBoard.get(6).get(8) + "|" + seaBoard.get(7).get(8) + "|" + seaBoard.get(8).get(8) + "|" + seaBoard.get(9).get(8) + "|                                                                              "+ Colors.redColor +"8"+ Colors.resetColor +" |" + enemyBoard.get(0).get(8) + "|" + enemyBoard.get(1).get(8) + "|" + enemyBoard.get(2).get(8) + "|" + enemyBoard.get(3).get(8) + "|" + enemyBoard.get(4).get(8) + "|" + enemyBoard.get(5).get(8) + "|" + enemyBoard.get(6).get(8) + "|" + enemyBoard.get(7).get(8) + "|" + enemyBoard.get(8).get(8) + "|" + enemyBoard.get(9).get(8) + "|");
        System.out.println("              "+ Colors.blueColor +"9"+ Colors.resetColor +" |" + seaBoard.get(0).get(9) + "|" + seaBoard.get(1).get(9) + "|" + seaBoard.get(2).get(9) + "|" + seaBoard.get(3).get(9) + "|" + seaBoard.get(4).get(9) + "|" + seaBoard.get(5).get(9) + "|" + seaBoard.get(6).get(9) + "|" + seaBoard.get(7).get(9) + "|" + seaBoard.get(8).get(9) + "|" + seaBoard.get(9).get(9) + "|                                                                              "+ Colors.redColor +"9"+ Colors.resetColor +" |" + enemyBoard.get(0).get(9) + "|" + enemyBoard.get(1).get(9) + "|" + enemyBoard.get(2).get(9) + "|" + enemyBoard.get(3).get(9) + "|" + enemyBoard.get(4).get(9) + "|" + enemyBoard.get(5).get(9) + "|" + enemyBoard.get(6).get(9) + "|" + enemyBoard.get(7).get(9) + "|" + enemyBoard.get(8).get(9) + "|" + enemyBoard.get(9).get(9) + "|");
        System.out.println();
        System.out.println();
        TextEditor.separatorText();


    }



}
