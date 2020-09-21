package Lesson_6;

import java.sql.SQLOutput;

public abstract class Animal {
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected int maxJumpHeight;

    public Animal (int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight= maxJumpHeight;
        this. maxSwimDistance = maxSwimDistance;

    }
    public abstract boolean run (int distance);
    public abstract boolean swim (int distance);
    public abstract boolean jump (int height);


    public void printInfo() {System.out.println(this); }

    public String toString(){
        return this.getClass(). getSimpleName() + "{" +
                "maxRunDistance=" + maxRunDistance +
                "maxJumpHeight=" + maxJumpHeight +
                "maxSwimDistance=" + maxSwimDistance + "}";
    }
}
