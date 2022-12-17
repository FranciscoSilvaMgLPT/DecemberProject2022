package Games.TheSimsJava;

import Games.Colors;
import Games.TextEditor;
import Games.TheSimsJava.Professions.*;

import java.util.Scanner;

public class TheSims {
    static Profession houseCleaner = new HouseCleaner(50);
    static Profession softwareProgrammer = new SoftwareProgrammer(90);
    static Profession uberDriver = new UberDriver(70);
    static Profession unemployed = new Unemployed(0);
    static Scanner sc = new Scanner(System.in);
    static int option;


    public static void main(String[] args) {
        startTheSims();

    }

    public static void startTheSims() {


        Person francisco = new Person("Francisco", 27, softwareProgrammer, 1000, null, 100, 100);
        Person fabio = new Person("Fabio", 28, unemployed, 1000, null, 100, 100);
        Person antonio = new Person("Antonio", 27, houseCleaner, 500, null, 40, 100);
        Person ana = new Person("Ana", 27, uberDriver, 0, null, 100, 20);

        TextEditor.TheSimsIntro();
        theSimsMenu();


    }

    public static void theSimsMenu() {
        TextEditor.seeSimsMenu();
        option = sc.nextInt();
        switch (option) {
            case 1:
                Person.seeSims();
                theSimsMenu();

                break;
            case 2:
                createSims();
                theSimsMenu();
                break;
            case 3:
                Person.seeSims();
                System.out.print("Choose your Sims ID number:");
                option = sc.nextInt();
                playTheSims(Person.personList.get(option - 1));
                theSimsMenu();
                break;
            case 0:

                break;
        }
    }

    public static void createSims() {
        System.out.print("Insert Sims name:");
        String name = sc.next();
        System.out.print("Insert Sims age:");
        int age = sc.nextInt();

        Person person1 = new Person(name, age);
        System.out.println("Congratz! Sims " + name + " has been created!");
    }

    public static void playTheSims(Person person) {
        boolean playing = true;
        while (playing) {
            System.out.println(Colors.redColor + "Controlling Sims:\n" + Colors.resetColor + person);
            System.out.println("\n" + Colors.blueColor + "1- Interact with another Sims👬        || 2- Job📁         || 3- Buy meal and eat(25€)🍖         || 4- Pee💦         || 5- Age Sims🎂     || 6- Talk alone        || 0- Leave" + Colors.resetColor);
            System.out.print("Option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Person.seeSims();
                    System.out.print(Colors.redColor + "Choose the Sims ID number that you want to interact:");
                    int chosenInteract = sc.nextInt() - 1;
                    System.out.println(Colors.redColor + "Choose the interaction:\n" + Colors.blueColor + "1- Talk    ||   2- Propose for Nikiniki😈❤️‍🔥  ||  3- Propose for mariage!💍  ");
                    int option1 = sc.nextInt();
                    System.out.println();
                    switch (option1) {
                        case 1:

                            person.comunicate(Person.personList.get(chosenInteract));
                            person.timeHasPast();
                            break;
                        case 2:

                            person.proposeNikiNiki(Person.personList.get(chosenInteract));
                            break;
                        case 3:

                            person.makeProposal(Person.personList.get(chosenInteract));

                            break;
                    }
                    System.out.println();

                    break;
                case 2:
                    if (person.age < 18) {
                        System.out.println("1- Ask parents for money  ||  2-Nevermind..");
                        int chosenOption = sc.nextInt();
                        switch (chosenOption) {
                            case 1:
                                System.out.println("Take 15€ my son!");
                                person.cash = person.cash + 15;
                                break;
                            case 2:
                                break;
                        }
                    } else {
                        System.out.println("1- Go to work?  ||  2-Find a job?");
                        System.out.print("Option:");
                        int chosenOption = sc.nextInt();
                        switch (chosenOption) {
                            case 1:
                                if (person.profession == unemployed || person.profession == null) {
                                    System.out.println("First go find a job! Right?!?");
                                    System.out.println();
                                } else {
                                    System.out.println("A day at work has past!");
                                    person.setCash(person.cash + person.profession.salary);
                                    System.out.println();
                                }
                                person.timeHasPast();
                                break;
                            case 2:
                                System.out.println(Colors.redColor + "Choose a job:\n[1]- House Cleaner  ||  [2]- Uber Driver  || [3]- Software Programmer");
                                System.out.print("Job ID number:");
                                int jobID = sc.nextInt();
                                switch (jobID) {
                                    case 1:
                                        person.setProfession(houseCleaner);
                                        System.out.println("You have been hired has House Cleaner.");
                                        break;
                                    case 2:
                                        person.setProfession(uberDriver);
                                        System.out.println("You have been hired has Uber Driver.");
                                        break;
                                    case 3:
                                        person.setProfession(softwareProgrammer);
                                        System.out.println("You have been hired has Software Programmer.");
                                        break;
                                }
                                System.out.println();
                                person.timeHasPast();
                        }
                    }
                        break;
                        case 3:
                            person.timeHasPast();
                            person.eat();
                            System.out.println();
                            break;
                        case 4:
                            person.timeHasPast();
                            person.doBasicNeeds();
                            System.out.println();
                            break;
                        case 5:
                            person.timeHasPast();
                            person.ageADay();
                            System.out.println();
                            break;
                        case 6:
                            person.timeHasPast();
                            person.comunicate();
                            System.out.println();
                            break;
                        case 0:
                            playing = false;
                            break;
                    }
            if (person.basicNeedsLvl <= 0 || person.hungerLvl <= 0) {
                if(person.basicNeedsLvl<=0){
                    System.out.println(person.name+" pee himself to death. 💦☠️");
                }
                if(person.hungerLvl<=0){
                    System.out.println(person.name+" died of hunger! You nasty MF! 🤬");
                }
                System.out.println();
                System.out.println(person.name + ": Fck! I died! Damn 😰⚰️");
                System.out.println(person.name + " died at " + person.age + " years old.");
                System.out.println("🪦Here lays " + person.name + ", a bad Sims player.🪦");
                System.out.println();
                Person.personList.remove(person);
                playing = false;
            }
        }
    }


}
