package csa.Zookeeper;

public class Feline extends Animal {
    private String felineAnimal;

    public Feline(String felineAnimal) {
        super("meat", false, 15);
        this.felineAnimal = felineAnimal;
    }

    public Feline(String felineAnimal, String food, boolean nocturnal, int avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
        this.felineAnimal = felineAnimal;
    }

    public void roar() {
        System.out.println("The " + felineAnimal + " roars loudly. It's a sign of dominance.");
    }

    public void growl() {
        System.out.println("The " + felineAnimal + " growls. It's a sign of aggression.");
    }
}