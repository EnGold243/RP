package com.cubism.roleplay;

import java.util.HashMap;

public class RPText {
    static HashMap<Integer, String> greeting = new HashMap<>();
    static HashMap<Integer, String> names = new HashMap<>();
    static HashMap<Integer, String> characters = new HashMap<>();
    static HashMap<Integer, String> location = new HashMap<>();
    static HashMap<Integer, String> places = new HashMap<>();

    public static void main() {
        greeting.put(1,"Добро пожаловать,");
        greeting.put(2,"Рады вам,");
        greeting.put(3,"Очень рады вас видеть,");
        greeting.put(4,"Рады вас приветствовать,");
        greeting.put(5,"Моё почтение,");

        places.put(1,"порт");
        places.put(2,"заброшенный дом");
        places.put(3,"деревня");
        places.put(4,"рынок");
        places.put(5,"город");
    }

}
