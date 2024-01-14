package Lesson_7;

public class Plate {

    protected final String name;
    private int food;
    public final int capacity;


    public Plate(String name, int capacity, int food) {
        this.name = name;
        this.capacity = capacity;
        this.food = food;
    }

    public Plate(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.food = 0;
    }

    public int getFood() {
        return food;
    }


    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount) {
        if (this.food >= foodCount) this.food -= foodCount;

    }

    public void info() {
        System.out.println("В миске "+" "+this.food+" грамм");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
