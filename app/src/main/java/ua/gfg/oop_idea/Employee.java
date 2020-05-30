package ua.gfg.oop_idea;

public class Employee {
    String name;
    String position;
    int pay;

    public Employee(String name, String position, int pay) {
        this.name = name;
        this.position = position;
        this.pay = pay;
    }

    String info(int i) {
        int j = i * pay;
        return "Employee " + name + ", position " + position
                + ", over the last " + i +  " months earned " + j + " $";
    }
}
