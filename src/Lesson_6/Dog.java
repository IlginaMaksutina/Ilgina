package Lesson_6;

public class Dog extends Animal {
    public static final int DEFAULT_MAX_RUN_DISTANCE = 200;
    public static final int DEFAULT_MAX_SWIM_DISTANCE = 0;
    public static final int DEFAULT_MAX_JUMP_HEIGHT =2;

    public Dog (int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, DEFAULT_MAX_SWIM_DISTANCE, maxJumpHeight);
    }

    public Dog(){
        super(DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_SWIM_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT);
    }
    @Override
    public boolean run(int distance) {
        if( this.maxRunDistance >= distance) {
            System.out.printf("Собака пробежала %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }
        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public  boolean jump(int jumpHeight)
    {
        if (this.maxJumpHeight >= jumpHeight) {
            System.out.printf("Собака прыгнула %d. Max = %d%n", jumpHeight, maxJumpHeight);
            return true;
        }
        System.out.printf("Собака не смогла прыгнуть на высоту %d. Max = %d%n", jumpHeight, maxJumpHeight);
        return false;
    }

    @Override
    public  boolean swim(int distance)
    {
        if( this.maxRunDistance >= distance) {
            System.out.printf("Собака проплыла %d. Max = %d%n", distance, maxSwimDistance);
            return true;
        }
        System.out.printf("Собака не смогла проплыть дистанцию %d. Max = %d%n", distance, maxSwimDistance);
        return false;
    }
}


