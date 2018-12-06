package exercises;

public class Main {
    public static void main(String[] args) {

//        int a = 2;
//        int b = 1;
//        int c = 2;
//        int d = 2;
//
//        if(a == b && a == c && a == d) {
//            System.out.println("a=b=c=d");
//        }
//        else
//            System.out.println("taci Djon ca poate la mine merge");
        Mage Nerries = new Mage("Nerries");
        NPC NPC1 = new NPC("NPC1", 10.0);
        NPC NPC2 = new NPC("NPC2", 20.0);
        NPC NPC3 = new NPC("NPC3", 100.0);

        Nerries.castBegoneThot();

        NPC1.takeDamage (Nerries.BegoneThotDamage);
        NPC2.takeDamage (Nerries.BegoneThotDamage);
        NPC3.takeDamage (Nerries.BegoneThotDamage);

    }


}
