package csa.Zookeeper;

public class Deer extends Hooved {

    public Deer() {
        super("deer", "browse, mast, and forbs", true, 7);
    }

    public void grunt() {
        System.out.println("The deer feels a little bit uncomfortable and grunts.");
    }
}
