package Lesson_7;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) throws InterruptedException {


        Observer obs = new Observer();
        //Создаем котиков
        obs.addCat(new Cat("Мартин", 150));
        obs.addCat(new Cat("Пушок", 70));
        obs.addCat(new Cat("Дымок", 60));
        obs.addCat(new Cat("Васька", 60));

        //создаем миски
        obs.addPlate(new Plate("1", 130));
        obs.addPlate(new Plate("2",100));
        obs.addPlate(new Plate("3", 110));

        //кормим котиков
        obs.feedCats(300);

        System.out.println("Котики пошли спать на 5 секунд");
        Thread.sleep(5000);
        System.out.println("");
        System.out.println("Котики снова голодны");

        obs.hungryCats();

        obs.feedCats(500);


    }

}
