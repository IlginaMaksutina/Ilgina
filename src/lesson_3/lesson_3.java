package lesson_3;
import java.util.Scanner;

public class lesson_3 {

    private static int myNumber;

    public lesson_3() {
    }

    public static void main(String[] args) {
        while(true) {
            myNumber = 10 - (int)(Math.random() * 10.0D);
            printIf();
            int i = 0;

            for(boolean succsess = false; i < 3 && !succsess; ++i) {
                succsess = chooseAction();
            }

            RepeatGame();
        }
    }

    public static void printIf() {
        System.out.println("Угадайте число от 0 до 9");
    }

    public static boolean chooseAction() {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        if (myNumber < Integer.valueOf(number)) {
            System.out.println("Загаданное число меньше");
        } else if (myNumber > Integer.valueOf(number)) {
            System.out.println("Загаданное число больше");
        } else if (myNumber == Integer.valueOf(number)) {
            System.out.println("Вы угадали!!!");
            return true;
        }

        return false;
    }

    public static void RepeatGame() {
        System.out.println("Загаданное число " + myNumber + " Повторить игру? (1 - Да /0 - Нет)");
        Scanner in11 = new Scanner(System.in);
        String number = in11.next();
        if (number.equals("0")) {
            System.exit(0);
        }

    }
}
