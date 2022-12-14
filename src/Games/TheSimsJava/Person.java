package Games.TheSimsJava;

import Games.Colors;
import Games.TheSimsJava.Professions.Profession;
import Games.TheSimsJava.Professions.Unemployed;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Person implements LivingThing {

    String name;
    int age;
    Profession profession;
    int salary;
    int cash = 200;
    Person spouse = null;
    int hungerLvl = 100;
    String hungerLvlIconed;
    int basicNeedsLvl = 100;
    String basicNeedsLvlIconed;

    Scanner sc = new Scanner(System.in);

    public static ArrayList<Person> personList = new ArrayList<>();


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.profession = new Unemployed(0);

        personList.add(this);
    }


    public Person(String name, int age, Profession profession, int cash, Person spouse, int hungerLvl, int basicNeedsLvl) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.cash = cash;
        this.spouse = spouse;
        this.hungerLvl = hungerLvl;
        this.basicNeedsLvl = basicNeedsLvl;

        personList.add(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession.name;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpouse() {
        return spouse.name;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }

    public int getBasicNeedsLvl() {
        return basicNeedsLvl;
    }

    public void setBasicNeedsLvl(int basicNeedsLvl) {
        this.basicNeedsLvl = basicNeedsLvl;
    }

    public String seePersonList() {
        if (spouse == null) {
            return "Name: " + name + Colors.greenColor + " | 💰Cash: " + cash + Colors.resetColor + "| 🎂Age: " + age + " | 📁Profession: " + profession + " | 💶Salary: " + salary + " | 💍Spouse: Unmarried";
        } else {
            return "Name: " + name + Colors.greenColor + " | 💰Cash: " + cash + Colors.resetColor + "| 🎂Age: " + age + " | 📁Profession: " + profession + " | 💶Salary: " + salary + " | 💍Spouse: " + spouse.name;
        }
    }

    public static void seeSims() {
        int lenght = personList.size();


        IntStream.range(0, lenght).forEach(index -> System.out.println("Sims " + (index + 1) + ": " + Person.personList.get(index).name + " | 🎂Age :" + Person.personList.get(index).age + Colors.greenColor + " | 💰Cash: " + Person.personList.get(index).cash + Colors.resetColor + " | 📁Profession: " + Person.personList.get(index).profession.name + " | 💶Salary: " + Person.personList.get(index).profession.salary + " | 💍Spouse: " + Person.personList.get(index).spouse));
    }


    public Person makeProposal(Person person1) {
        System.out.println(name + " got on his knees and asked " + person1.getName() + " for marriage!");
        int proposalChance = (int) (Math.random() * 3) + 1;
        switch (proposalChance) {
            case 1:
                System.out.println(person1.getName() + ": OMG!!! YES!!!!!!!!!!!! I LOVE YOU " + name);
                person1.setSpouse(this);
                this.spouse = person1;

                return person1;
            default:
                System.out.println(person1.getName() + ": What?1? Ofc not! Get away!");
                break;
        }
        return null;
    }


    public void proposeNikiNiki(Person person) {
        int nikinikiChance = (int) (Math.random() * 3) + 1;
        System.out.println(this.name + ": Hi " + person.name + " do you want to nikiniki with me?😬❤️");
        switch (nikinikiChance) {
            case 1:
            case 2:
                System.out.println(person.name + ": hm..🤔 Lets go!😈 ❤️‍🔥");
                this.makeNikiNiki(person);
                break;
            case 3:
                System.out.println(person.name + ": hm..🤔 Think not!! CYA! 😖💥🤬");
                break;
        }
        timeHasPast();
    }

    public void makeNikiNiki(Person person) {
        int babyChance = (int) (Math.random() * 3) + 1;
        switch (babyChance) {
            case 1:
            case 2:
                System.out.println("💋💑🦋🦋🦋");
                break;
            case 3:
                System.out.println("OMG!!!  A BABY IS BORN BETWEEN " + name + " and " + person.name);
                System.out.print("How do you want to call him? Baby name👶:");
                String babyName = sc.next();
                Person person1 = new Person(babyName, 0);
                System.out.println(babyName + " has came to the world! He is now a playing character!");
                break;
        }
        timeHasPast();
        timeHasPast();
    }


    @Override
    public String toString() {
        int counter = 0;
        for (int i = 0; i <= hungerLvl; i = i + 10) {
            counter++;
            hungerLvlIconed = hungerLvl + ("🍖").repeat(counter);
        }
        counter = 0;
        for (int i = 0; i <= basicNeedsLvl; i = i + 10) {
            counter++;
            basicNeedsLvlIconed = basicNeedsLvl + ("💦").repeat(counter);
        }
        if (hungerLvl < 50) {
            hungerLvlIconed = Colors.redColor + hungerLvlIconed + Colors.resetColor;
        }
        if (basicNeedsLvl < 50) {
            basicNeedsLvlIconed = Colors.redColor + basicNeedsLvlIconed + Colors.resetColor;
        }

        if (spouse == null) {
            return "Name: " + name + Colors.greenColor + " | 💰Cash: " + cash + Colors.resetColor + "| 🎂Age: " + age + " | 📁Profession: " + profession.name + " | 💶Salary: " + profession.salary + " | 💍Spouse: Unmarried | ❤️HungerLvl: " + hungerLvlIconed + " 🚾basicNeedsLvl: " + basicNeedsLvlIconed;
        } else {
            return "Name: " + name + Colors.greenColor + " | 💰Cash: " + cash + Colors.resetColor + "| 🎂Age: " + age + " | 📁Profession: " + profession.name + " | 💶Salary: " + profession.salary + " | 💍Spouse: " + spouse.name + " | ❤️HungerLvl: " + hungerLvlIconed + " 🚾basicNeedsLvl: " + basicNeedsLvlIconed;
        }
    }

    @Override
    public void ageADay() {
        System.out.println(name + " 🎂 happy birthday to me! Happy birthday to " + name + "! IEEIII!! I was so bothered of having " + age + " years old, finally I'm " + (age + 1) + "!!\n");
        this.age++;
        timeHasPast();
    }

    @Override
    public void doBasicNeeds() {
        System.out.println(name + " 💦 ahhh so good! \n");
        timeHasPast();
        this.basicNeedsLvl = 100;

    }

    @Override
    public void eat() {
        if (cash >= 25) {
            System.out.println(name + " 🍖 hmmm!!!!! Soooo goood! 🤌\n");
            hungerLvl = 100;
            cash = cash - 25;
        }else{
            System.out.println("Damn... I have no money!! 😱");
        }
    }

    @Override
    public void timeHasPast() {
        hungerLvl = hungerLvl - 10;
        basicNeedsLvl = basicNeedsLvl - 10;
    }

    @Override
    public void comunicate() {
        System.out.println(name + ": Im damn crazy! 🤯🤪🫣");
    }

    public void comunicate(Person person) {
        System.out.println(name + ": Blala ?\n" + person.name + ": OFC BLALA! You never blalalali?\n" + name + ": Hm.. Now you talk it i already blalalilati!");

    }
}
