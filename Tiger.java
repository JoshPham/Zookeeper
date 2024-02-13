package csa.Zookeeper;

public class Tiger extends Feline {
    public Tiger() {
        super("tiger", "meat", true, 15);
    }

    public void huntAlone() {
        System.out.println("The tiger hunts alone. It's a solitary animal.");
    }

    public void swim() {
        System.out.println("The tiger swims across the river to catch its prey.");
    }
}