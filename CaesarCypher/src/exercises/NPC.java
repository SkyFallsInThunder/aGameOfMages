package exercises;

public class NPC {

    String name;
    double HP;

    NPC (String name, double hp){
        this.name = name;
        this.HP = hp;

    }

    void takeDamage ( double damageTaken ){
        this.HP -= damageTaken;
        //       12.5       7.5
        if (this.HP <= 0) {
            System.out.println("I am die");
        }
        else {
            System.out.println("nu ma face pe mine asta ba");
            System.out.println("HP left: " + this.HP);
        }

    }



}

