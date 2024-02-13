package csa.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Gorilla gorilla = new Gorilla();
        Giraffe giraffe = new Giraffe();
        Hippo hippo = new Hippo();
        Monkey monkey = new Monkey();
        Elephant elephant = new Elephant();
        Deer deer = new Deer();
        Tiger tiger = new Tiger();

        System.out.println("The zookeeper is feeding the animals:");
        lion.eat();
        gorilla.eat();
        giraffe.eat();
        hippo.eat();
        monkey.eat();
        elephant.eat();
        deer.eat();

        System.out.println("\n\nThe zookeeper is observing the felines:");
        lion.huntInPack();
        lion.roar();
        tiger.growl();
        tiger.huntAlone();
        tiger.swim();

        System.out.println("\n\nThe zookeeper is observing the hooved animals:");
        giraffe.hum();
        deer.grunt();
        hippo.groan();
        hippo.forage();
        hippo.forage();
        hippo.forage();

        System.out.println("\n\nThe zookeeper is observing the primates:");
        monkey.climb();
        monkey.hoot();
        monkey.howl();
        gorilla.grunt();
        gorilla.forage();

        System.out.println("\n\nFinally, the zookeeper is observing the elepant:");
        elephant.trumpet();
        elephant.forage();
    }
}