package com.assignment6_000805099;

/**
 * Implementation of a set of classes for the inhabitants of FakeWorld.
 * @author Andy Le
 */
public class Main {

    public static void main(String[] args) {
        // Create classes
	    Hobbit h1 = new Hobbit("Steve");
	    Hobbit h2 = new Hobbit("Ham", 1, 2, 3, 4, 5, 6);
	    Elf e1 = new Elf("Bilfrid");
        Elf e2 = new Elf("Nicky", 5, 5, 5, 5, 5, 5, "forest", h1);
        Fighter f1 = new Fighter("Samus");
        Fighter f2 = new Fighter("Link", 15, 10, 15, 10 , 100, 100, e1);
        Wizard w1 = new Wizard("Jacob");
        Wizard w2 = new Wizard("Matthew", 15, 10, 15, 10 , 100, 100, e1, 20);
        // Process and output variables after use of methods
        System.out.println(h2.steal());
        System.out.println(e2);
        e2.setBF(h2);
        System.out.println(f2.getEnemy().getName());
        System.out.println(w1.getMagic());
        System.out.println(w2.getMagic());
        System.out.println(w2.heal());
        System.out.println(w2.getMagic());
        System.out.println(e2.getHealth());
        w2.attack(e2);
        System.out.println(e2.getHealth());
    }
}
