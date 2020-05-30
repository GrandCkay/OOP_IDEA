package ua.gfg.oop_idea;

public class MainBox {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;

        Box box1 = new Box();
        box1.height = 5;
        box1.length = 5;
        box1.width = 5;

        myBox.showVolume();
        box1.showVolume();

        double volume1 = myBox.showVolumeNew();
        System.out.println(volume1);

        Box box2 = new Box();
        box2.setDimens(15, 15, 15);
        System.out.println(box2.showVolumeNew());


        Box box3 = new Box();
        System.out.println(box3.showVolumeNew());

        Box box4 = new Box(10,10,10);
        System.out.println(box4.showVolumeNew());

        Box box5 = new Box(10);
        System.out.println(box5.showVolumeNew());
    }
}
