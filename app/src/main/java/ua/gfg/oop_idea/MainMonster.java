package ua.gfg.oop_idea;

public class MainMonster {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(1);
        Monster monster2 = new Monster(3, 3);
        Monster monster3 = new Monster(4,4,4);

        monster1.monsterInfo();
        monster.monsterInfo();
        monster2.monsterInfo();
        monster3.monsterInfo();

        String info = Monster.monsterInfo(5,5,5);
        System.out.println(info);

        monster.voice();
        monster1.voice(5);
        monster2.voice(4, "lol");
    }
}
