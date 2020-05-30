package ua.gfg.oop_idea;

public class MainRect {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.setDimens(30, 20);

        System.out.println("Perimeter = " + rect1.perimeterRect());
        System.out.println("Area = " + rect1.areaRect());

    }
}
