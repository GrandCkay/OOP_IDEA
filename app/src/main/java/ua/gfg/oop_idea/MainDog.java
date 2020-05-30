package ua.gfg.oop_idea;

public class MainDog {
    public static void main(String[] args) {
        Dog noya = new Dog();
        noya.name = "Nosik";
        noya.breed = "Samoed";
        noya.speed = 4;

        noya.run();

        System.out.println(noya.info());

    }


}
