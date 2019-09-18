package com.sopra.game;

import com.sopra.game.model.*;

import java.util.Scanner;


public class Entry {

    public static void main(String[] args) {
        System.out.println("Veuillez choisir entre Warrior, Wizard ou Orc");
        Scanner sc = new Scanner(System.in);
        Humanoid hero = selectChar(sc.next());
        assert hero != null;
        System.out.println("Vous avez choisit : " + hero.getName());
        System.out.println("Maintenant choisissez votre adversaire !");
        Humanoid vilain = selectChar(sc.next());
        assert vilain != null;

    }

    public static Humanoid selectChar(String name) {

        switch(name) {
            case "Warrior" :
                return new Warrior("Jayce Dujardin", 80, 21);
            case "Wizard" :
                return new Wizard("Oncle Ryze", 60, 15, 200, 50);
            case "Orc" :
                return new Orc("Garrosh", 90, 30);

            default :
                return null;
        }
    }
}
