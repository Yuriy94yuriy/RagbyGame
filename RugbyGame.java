package game;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyGame {
    public static void main(String[] args) {
        System.out.print("Team Blue: ");
        teamBlue();
        System.out.println();
        System.out.print("Team Red: ");
        teamRed();
    }

    public static void teamBlue() {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(18, 40);
            System.out.print(" " + "age:" + array[i] + ";");
        }
    }

    public static void teamRed() {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(18, 40);
            System.out.print(" " + "age:" + array[i] + ";");
        }
    }
    public static void calculateMediumAge(){

    }
}


//Є дві команди регбі з 25 гравців різного віку у кожній.
//
//Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//Виведіть у двох рядках вік гравців кожної команди.
//
//Порахуйте середній вік гравців кожної команди та виведіть на екран.


