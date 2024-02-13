package csa.Zookeeper;

public class Animal {
    private String food;
    private boolean nocturnal;
    private double avgLifeSpan;
    
    public Animal(String food, boolean nocturnal, double avgLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.avgLifeSpan = avgLifeSpan;
    }

    public void eat() {
        System.out.println("This animal eats " + food);
    }

    public String getFood() {
        return food;
    }

    public double getLifeSpan() {
        return avgLifeSpan;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }
}