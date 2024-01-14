package Lesson_7;

import java.util.ArrayList;

public class Observer {
    private ArrayList<Cat> cats = new ArrayList<Cat>();
    private ArrayList<Plate> plates = new ArrayList<Plate>();

    public void addCat(Cat cat)
    {
        cats.add(cat);
    }

    public void addPlate(Plate plate)
    {
        plates.add(plate);
    }
    //Наполнить миски
    private void fillPlates(int foodAmount) {
        //еды в пакетике
        int currentAmount = foodAmount;

        for (Plate plate : plates) {

            if (plate.getFood() < plate.capacity) {
                //Если в миске уже есть еда, то положить придется меньше чем объем миски
                int platePortion = plate.capacity - plate.getFood();

                //в пакетике еды могло окзать меньше чем объем миски, проверим хватит ли
                if (currentAmount >= platePortion) {
                    plate.addFood(platePortion);
                    currentAmount -= platePortion;
                } else { //высыпаем в миску остаток пакетика
                    plate.addFood(currentAmount);
                    currentAmount = 0;
                }
            }
            plate.info();
        }
        if (currentAmount > 0) System.out.println(currentAmount + " грамм не влезло в миски");
    }
    //покормить котиков
    public void feedCats(int food)
    {
        fillPlates(food);

        for (Cat cat : cats)
        {
            cat.eat(plates);
        }

    }

    public void hungryCats()
    {
        for (Cat cat : cats)
        {
            cat.hungry();
        }
    }

}
