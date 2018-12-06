package com.company.rpg_exercise;

public class Mage {

    String name;
    int level;
    double HP;
    double FireballDamage;
    double FirestormDamage;
    String targetName;


    Mage (String name){
        this.name = name;
        this.level = 1;
        this.HP = this.level * 5;
        this.FireballDamage = this.level * 12.5;
        this.FirestormDamage = this.level * 5;
        this.targetName = "";
    }

    void castFireball (String targetName){
        this.targetName = targetName;
        System.out.println(this.name + " casts Fireball on " + this.targetName + "!");
        System.out.println(this.targetName + " loses " + this.FireballDamage + " HP!");
        System.out.println();

    }

    void castFirestorm (){
        System.out.println(this.name + " casts Firestorm!");
        System.out.println("All foes in range lose " + this.FirestormDamage + " HP!");
        System.out.println();

    }

    void takeDamage(double damageTaken) {
        this.HP -= damageTaken;
        //       12.5       7.5
        if (this.HP <= 0) {
            System.out.println(this.name + " says: Not like this...");
            System.out.println();
        } else {
            System.out.println(this.name + " says: How rude!");
            System.out.println(this.name + " HP left: " + this.HP);
            System.out.println();
        }
    }

}


