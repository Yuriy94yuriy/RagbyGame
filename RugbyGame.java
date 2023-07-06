package game;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyGame {
    public static void main(String[] args) {

    }

    public static void teamBlue(int[] age1) {
        for(int i = 0 ; i<age1.length; i++)
        age1[i]=ThreadLocalRandom.current().nextInt(18, 40);
    }

    public static void teamRed(int[] age2) {
        for(int a = 0 ; a<age2.length; a++)
        age2[a]=ThreadLocalRandom.current().nextInt(18, 40);

    }


    //Є дві команди регбі з 25 гравців різного віку у кожній.
    //
    //Вік беремо випадковим чином в діапазоні від 18 до 40.
    //
    //Виведіть у двох рядках вік гравців кожної команди.
    //
    //Порахуйте середній вік гравців кожної команди та виведіть на екран.


}
