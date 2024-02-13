package csa.Zookeeper;

public class Elephant extends Animal {
    public Elephant() {
        super("plants", false, 50);
    }

    @Override
    public void eat() {
        System.out.println("While normally being too tall for normal animals, the elephant\nuses its trunk to grab the " + super.getFood() + " and eats it.");
    }

    public void trumpet() {
        System.out.println("The elephant uses its trunks to trumpet, and it can be heard from miles away.");
    }

    public void forage() {
        System.out.println("In the grass fields, the elephant finds a " + super.getFood() + " and gathers it along with the nearby vegetation.");
        eat();
    }
}
