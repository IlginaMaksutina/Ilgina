package lesson2;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println("задание №1");
        System.out.println(Arrays.toString(array));
        System.out.println("задание №2");
        task2();
        System.out.println("задание №3");
        task3();
        System.out.println("задание №4");
        task4();
    }
    public static void task2() {
        int[] array = new int[8];
        int value = 0;
        for (int i =0; i < array.length; i++) {
            value += 3;
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void task3() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < 6) {
                array[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task4 () {
        int [] [] array = new int[9][9];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array [i]  [i] = array[i] [lastIndex - i] = 1;
                    }
        
        for (int [] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

    }
    }




