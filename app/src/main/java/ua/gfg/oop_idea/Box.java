package ua.gfg.oop_idea;

public class Box {
    double width;
    double height;
    double length;

    Box() {
        width = 10;
        height = 10;
        length = 10;
    }

    Box(double size) {
       width = size;
       height = size;
       length = size;
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }


    void showVolume() {
//        double volume = width * height * length;
        System.out.println(showVolumeNew());
    }

    double showVolumeNew() {
        return width * height * length;
    }
}
