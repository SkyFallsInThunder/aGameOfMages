package com.company.rpg_exercise;

public class Main {

// Main.java
// Mage.java
// NPC.java
// Log.java

// combat log
// mage casts some spell on npc
// npc fights back

    public static void main(String[] args) {
        Mage Nerries = new Mage("Nerries");
        NPC Poltalgron = new NPC("Poltalgron");


        Nerries.castFireball(Poltalgron.name);
        Poltalgron.takeDamage (Nerries.FireballDamage);

        Poltalgron.meleeAttack(Nerries.name);
        Nerries.takeDamage(Poltalgron.meleeDamage);


        Log.log();
    }

}
