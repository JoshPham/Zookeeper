package csa.Zookeeper;

public class Primate extends Animal {
    private String primateAnimal;

    public Primate() {
        super("plants", false, 25);
    }

    public Primate(String primateAnimal, String food, boolean nocturnal, int avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
        this.primateAnimal = primateAnimal;
    }

    public void forage() {
        System.out.println("In the jungle, the " + primateAnimal + " finds a " + super.getFood() + " and gathers it along with the nearby vegetation.");
        eat();
    }
}