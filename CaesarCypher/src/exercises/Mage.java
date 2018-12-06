package exercises;

public class Mage {

    String name;
    int level;
    double FireballDamage;
    double BegoneThotDamage;


    Mage (String name){
        this.name = name;
        this.level = 1;
        this.FireballDamage = this.level * 12.5;
        this.BegoneThotDamage = this.level * 5;
        }

    void castFireball (){
        System.out.println("Vineeeeeeeeeeeeeeeeee");
        System.out.println("Target loses " + this.FireballDamage + " HP");

    }
    void castBegoneThot (){
        System.out.println("Luati de aici scarbelor!");
        System.out.println("All thots in range lose " + this.BegoneThotDamage + " HP");

    }

}

