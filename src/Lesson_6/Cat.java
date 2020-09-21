package Lesson_6;

public class Cat  extends Animal {
    public static final int DEFAULT_MAX_RUN_DISTANCE = 200;
    public static final int DEFAULT_MAX_SWIM_DISTANCE = 0;
    public static final int DEFAULT_MAX_JUMP_HEIGHT = 2;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, DEFAULT_MAX_SWIM_DISTANCE, maxJumpHeight);
    }

    public Cat() {
        super(DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_SWIM_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Кот пробежал %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }
        System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public  boolean jump(int jumpHeight)
    {
        if (this.maxJumpHeight >= jumpHeight) {
            System.out.printf("Кот прыгнул %d. Max = %d%n", jumpHeight, maxJumpHeight);
            return true;
        }
        System.out.printf("Кот не смог прыгнуть на высоту %d. Max = %d%n", jumpHeight, maxJumpHeight);
        return false;
    }

    @Override
    public  boolean swim(int distance)
    {
        System.out.printf("Кот не смог проплыть %d. Коты не плавают", distance);
        return false;
    }

}
