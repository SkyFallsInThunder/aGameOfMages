package com.company.rpg_exercise;

public class NPC {

    String name;
    int level;
    double HP;
    double meleeDamage;
    String targetName;

    NPC(String name) {
        this.name = name;
        this.level = 1;
        this.HP = this.level * 15;
        this.meleeDamage = this.level * 2;
        this.targetName = "";

    }

    void takeDamage(double damageTaken) {
        this.HP -= damageTaken;
                //       12.5       7.5
        if (this.HP <= 0) {
            System.out.println(this.name + " says: Now I breathe my last. It is true that mages are indeed superior!");
            System.out.println("Time of death and final admission:");
        } else {
            System.out.println(this.name + " says: Die, witch!");
            System.out.println(this.name + " HP left: " + this.HP);
            System.out.println();
        }
    }

    void meleeAttack(String targetName) {
        this.targetName = targetName;
        System.out.println(this.name + " attacks " + this.targetName + " in melee!");
        System.out.println(this.targetName + " loses " + this.meleeDamage + " HP");
        System.out.println();

    }

}





