package Lesson_6;

import java.util.Random;

public class HW_6 {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();
        playGame(participants);
    }
     private static Animal[] prepareParticipants() {
        return new Animal[]{
                new Cat(),
                new Dog(),
                new Cat(300, 3),
                new Dog (52,2)
        };
     }

     private static void playGame(Animal [] participants) {
        Random random = new Random();

        for (Animal participant : participants) {
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(400)));
            System.out.println(participant.jump(random.nextInt(20)));
            System.out.println(participant.jump(random.nextInt(200)));
            System.out.println();
        }
     }
}
