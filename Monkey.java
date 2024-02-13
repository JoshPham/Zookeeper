package csa.Zookeeper;

public class Monkey extends Primate {
    public Monkey() {
        super("monkey", "bananas", false, 25);
    }

    public void climb() {
        System.out.println("The monkey climbs up a tree.");
    }

    public void hoot() {
        System.out.println("The monkey hoots. We can't tell why, but it's either them being angry,\n scared, or just communicating with its friends.");
    }

    public void howl() {
        System.out.println("The monkey howls to mark its territory. It's a warning to other monkeys to stay away.");
    }
}