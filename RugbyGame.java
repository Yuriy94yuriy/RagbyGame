package game;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RugbyGame {
    public static void main(String[] args) {


        System.out.println("Середній вік гравців Червоної команди: ");
        calculateAverageRed();
        System.out.println("Середній вік гравців Блакитної команди: ");
        calculateAverageBlue();
    }

    public static void calculateAverageRed() {
        int averageRed = 0;
        int[] array = new int[25];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(18, 40);
            sum += array[i];
        }
        averageRed = sum / array.length;
        System.out.println(averageRed);
    }

    public static void calculateAverageBlue() {
        int averageBlue = 0;
        int[] array = new int[25];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(18, 40);
            sum += array[i];
        }
        averageBlue = sum / array.length;
        System.out.println(averageBlue);
    }

    public static void calculateMediumAge() {

    }

}


//Є дві команди регбі з 25 гравців різного віку у кожній.
//
//Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//Виведіть у двох рядках вік гравців кожної команди.
//
//Порахуйте середній вік гравців кожної команди та виведіть на екран.


