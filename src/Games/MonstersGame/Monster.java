package Games.MonstersGame;

import Games.Colors;

public abstract class Monster {

    String name;
    int health = 100;
    int damage;
    int position;

    String info;


    public abstract void attack(Monster monster);

    @Override
    public String toString() {
      return "Monster nº ["+position+"]-> " + Colors.redColor + name + Colors.resetColor + "\n" +
                    "Health❤️: " + health + "\n" +
                    "Damage💥: " + damage + "\n" +
                    "Info📜: " + info + "\n"+
                    "\n";

    }
}
