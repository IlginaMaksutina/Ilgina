package Lesson_7;

import java.util.ArrayList;

public class Cat {

    protected final String name;
    private int appetite;
    private boolean satiety = false;
    private int satietyCount;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satietyCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(ArrayList<Plate> plates) {

        for (Plate plate :plates) {

            if (satiety) break; //кот сыт, нечего лазить по мискам

            if (plate.getFood() == 0) continue; //эта миска пуста, смотрим дальше

            doEat(plate);

        }

        if (!satiety) {
            System.out.println(this.name + " остался голодным, не хватило "+ (appetite - satietyCount) +" грамм" );
        }
    }

    private void doEat(Plate plate) {
        //сколько еще хочет котик
        int amount = appetite - satietyCount;
        //еды в миске достаточно чтоб утолить голод
        if (plate.getFood() >= amount) {
            satiety = true;

            plate.decreaseFood(amount);

            //наелся до отвала
            satietyCount = appetite;
            System.out.println(this.name + " съел "+amount+" грамм из миски "+plate.name+", наелся и сыт");

        } else {//еды в миске не достаточно, но можно немного поесть
            amount = plate.getFood();

            plate.decreaseFood(amount);
            satietyCount += amount;
            System.out.println(this.name + " съел "+amount+" из миски "+plate.name+" и пошел искать "+(appetite - satietyCount)+" грамм еды дальше ");
        }
    }

    //Котик проголодался
    public void hungry() {
        satiety = false;
        satietyCount = 0;
    }
}
