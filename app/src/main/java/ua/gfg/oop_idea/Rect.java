package ua.gfg.oop_idea;

public class Rect {
    double length;
    double width;

    void setDimens(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeterRect() {
        return (length + width) * 2;
    }

    double areaRect() {
        return length * width;
    }
}
