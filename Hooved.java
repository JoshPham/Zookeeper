package csa.Zookeeper;

public class Hooved extends Animal {
    private String hoovedAnimal;

    public Hooved(String hoovedAnimal) {
        super("plant", false, 20);
        this.hoovedAnimal = hoovedAnimal;
    }

    public Hooved(String hoovedAnimal, String food, boolean nocturnal, int avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
        this.hoovedAnimal = hoovedAnimal;
    }

    @Override
    public void eat() {
        System.out.println("The " + hoovedAnimal + " eats " + super.getFood() + ".\nMakes sense as they are herbivores.");
    }

    public void forage() {
        System.out.println("In the grass fields, the " + hoovedAnimal + " finds a " + super.getFood() + " and gathers it along with the nearby vegetation.");
        eat();
    }

    public void forage(boolean isPicky) {
        if (isPicky) {
            System.out.println("The " + hoovedAnimal + " is picky and only collects the " + super.getFood() + " that is its favorite.");
        } else {
            System.out.println("The " + hoovedAnimal + " doesn't mind what they eat and grabs chunks from a bush and the nearby vegetation.");
        }
        eat();
    }
}
