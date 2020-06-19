package ua.gfg.oop_idea;

public class Human {
    String name;
    int age;
    double weight;

    static int humanCount = 0;

    public int humanCount() {
        humanCount++;
        return humanCount;
    }
}
