package ua.gfg.oop_idea;

public class MainHuman {
    public static void main(String[] args) {
        Human oldHuman = new Human();
        oldHuman.name = "Dr.Bob";
        oldHuman.age = 60;
        oldHuman.weight = 18;

        Human childHuman = new Human();
        childHuman.name = "Rob";
        childHuman.age = 12;
        childHuman.weight = 18;

        Human human = new Human();
        human.name = "Human";
        human.age = 35;
        human.weight = 25;

        Human manHuman = new Human();
        manHuman.name = "Karl";
        manHuman.age = 40;
        manHuman.weight = 22;

        Human womanHuman = new Human();
        womanHuman.name = "Sara";
        womanHuman.age = 27;
        womanHuman.weight = 20;

        double sumAge = 0;
        sumAge = (double) (oldHuman.age + childHuman.age + human.age + manHuman.age + womanHuman.age) / 5;
        System.out.println("Age - " + sumAge);

        double[] weightHuman = new double[5];
        weightHuman[0] = oldHuman.weight;
        weightHuman[1] = childHuman.weight;
        weightHuman[2] = human.weight;
        weightHuman[3] = manHuman.weight;
        weightHuman[4] = womanHuman.weight;

        int sumW = 0;
        for (int i = 0; i < weightHuman.length; i++) {
            sumW += weightHuman[i];
        }

        double sumWeight = 0;
        sumWeight = (double) sumW / weightHuman.length;
        System.out.println("Weight1 - " + sumWeight);

        Human[] men = new Human[5];
        men[0] = oldHuman;
        men[1] = childHuman;
        men[2] = human;
        men[3] = manHuman;
        men[4] = womanHuman;

        int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].weight;
        }
        System.out.println("Weight2 - " + (double) sum / men.length);

        String nameHuman = "";
        for (int i = 0; i < men.length; i++) {
            if (i < men.length - 1) {
                nameHuman += men[i].name + ", ";
            } else {
                nameHuman += men[i].name + ".";
            }
        }
        System.out.println(nameHuman);
    }
}
