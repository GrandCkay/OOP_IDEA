package ua.gfg.oop_idea;

public class Monster {
    int eyes;
    int hand;
    int leg;
    String  result = "";
    String voice = "Voice";

    public Monster() {
        eyes = 2;
        hand = 2;
        leg = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        hand = 2;
        leg = 2;
    }

    public Monster(int eyes, int hand) {
        this.eyes = eyes;
        this.hand = hand;
        leg = 2;
    }

    public Monster(int eyes, int hand, int leg) {
        this.eyes = eyes;
        this.hand = hand;
        this.leg = leg;
    }

    void monsterInfo() {
        System.out.println("Monster is " + eyes + " eyes, "
        + hand + " hands, " + leg + " legs.");
    }

    static String  monsterInfo (int eyes, int hand, int leg) {
       return "Monster is " + eyes + " eyes, "
                + hand + " hands, " + leg + " legs.";
    }

    void voice() {
        System.out.println(voice);
    }

    void voice(int iVoice) {
       for (int i = 0; i < iVoice; i ++) {
           result += (voice + " ");
       }
        System.out.println(result);
    }

    void voice(int iVoice, String word) {
        for (int i = 0; i < iVoice; i++) {
            result += word + " ";
        }
        System.out.println(result);
    }
}
