package csa.Zookeeper;

public class Lion extends Feline {
    public Lion() {
        super("lion", "meat", true, 20);
    }

    public void huntInPack() {
        System.out.println("The lions gather together to form a pack and hunt together.");
    }
}
