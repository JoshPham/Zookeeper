package csa.Zookeeper;

public class Hippo extends Hooved {
    private int weight;

    public Hippo() {
        super("hippo", "grass and fruits", true, 45);
        this.weight = 5000;
    }

    @Override
    public void forage() {
        int isPicky;

        if (weight < 4000) {
            System.out.println("The hippo is very desperate for food, as their weight is low.");
            isPicky = -1;
        } else if (weight > 6000) {
            System.out.println("The hippo is very exhausted due to how heavy it is but still hungry.");
            isPicky = 1;
        } else {
            System.out.println("The hippo feels hungry so it wants to forage.");
            isPicky = 0;
        }
        System.out.println("The hippo begins leaving their lake and forages for food.");
        System.out.println("After searching for a while, the hippo finds a grass field.");
        
        if (isPicky > 0) {
            super.forage(true);
            System.out.println("The hippo is very picky and as a result didn't find enough food to\nbalance it with its weight.");
            weight -= ((int) (Math.random() * 300) + 1800);
        } else if (isPicky < 0) {
            super.forage(false);
            System.out.println("The hippo is very desperate and as a result ate anything it could find\nwhich allowed it to gain a lot of weight.");
            weight += ((int) (Math.random() * 300) + 1800);
        } else {
            super.forage();
            System.out.println("The hippo was able to find a good amount of food which allowed it to\ngain a bit of weight.");
            weight += ((int) (Math.random() * 100) + 300);
        }
    }

    public void groan() {
        System.out.println("The hippo groans, which upsets and disrupts the animals nearby.");
    }
}
