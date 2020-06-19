package ua.gfg.oop_idea;

public class MainHuman {
    public static void main(String[] args) {
        Human oldHuman = new Human();
        oldHuman.name = "Dr.Bob";
        oldHuman.age = 60;
        oldHuman.weight = 68.6;
        oldHuman.humanCount();

        Human childHuman = new Human();
        childHuman.name = "Rob";
        childHuman.age = 12;
        childHuman.weight = 33.4;
        childHuman.humanCount();

        Human human = new Human();
        human.name = "Human";
        human.age = 35;
        human.weight = 85.1;
        human.humanCount();

        Human manHuman = new Human();
        manHuman.name = "Karl";
        manHuman.age = 40;
        manHuman.weight = 92.9;
        manHuman.humanCount();

        Human womanHuman = new Human();
        womanHuman.name = "Sara";
        womanHuman.age = 27;
        womanHuman.weight = 60.0;
        womanHuman.humanCount();

        // first way sum age
        double sumAge1 = 0;
        sumAge1 = (double) (oldHuman.age + childHuman.age + human.age + manHuman.age + womanHuman.age) / 5;
        System.out.println("Age1 - " + sumAge1);

        // second way sum age
        double sumAge2 = 0;
        sumAge2 = (double) (oldHuman.age + childHuman.age + human.age + manHuman.age + womanHuman.age) / Human.humanCount;
        System.out.println("Age2 - " + sumAge2);

        /*
            First way sum weight
        */
        double[] weightHumanArray = new double[5];
        weightHumanArray[0] = oldHuman.weight;
        weightHumanArray[1] = childHuman.weight;
        weightHumanArray[2] = human.weight;
        weightHumanArray[3] = manHuman.weight;
        weightHumanArray[4] = womanHuman.weight;

        int sumWeight1 = 0;
        for (int i = 0; i < weightHumanArray.length; i++) {
            sumWeight1 += weightHumanArray[i];
        }

        double sumWeight = 0;
        sumWeight = (double) sumWeight1 / weightHumanArray.length;
        System.out.println("Weight1 - " + sumWeight);

        /*
            Second way sum weight. And display all name objects class Human
        */
        Human[] humanArray = {
                oldHuman,
                childHuman,
                human,
                manHuman,
                womanHuman
        };

        int sumWeight2 = 0;
        for (int i = 0; i < humanArray.length; i++) {
            sumWeight2 += humanArray[i].weight;
        }
        System.out.println("Weight2 - " + (double) sumWeight2 / humanArray.length);

        String nameHuman = "";
        for (int i = 0; i < humanArray.length; i++) {
            if (i < humanArray.length - 1) {
                nameHuman += humanArray[i].name + ", ";
            } else {
                nameHuman += humanArray[i].name + ".";
            }
        }
        System.out.println(nameHuman);
    }
}
