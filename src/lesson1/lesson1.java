package lesson1;
public class lesson1 {



    public static void main(String[] args) {
        System.out.println("Hello, lesson1!");

        System.out.println("Задание 2, инициализация переменных ");
        task2();

        System.out.println("Задание 3, метод вычисляющий выражение ");
        int result = calcExpression(2, 8, 16, 4);
        System.out.printf("результат = %d ", result);
        System.out.println("Задание 4");
        calcExpression2(7, 16);
        System.out.println("Задание 5");
        task5(-5);

        System.out.println("Задание 6");
        task6(-5);
        System.out.println("Задание 7");
        task7("Michel");
    }

    public static void task2() {
        byte val1 = -115;
        short val2 = 5000;
        int val3 = 25;
        long val4 = 500000L;
        float val5 = 10.25f;
        double val6 = -112.232;
        char val7 = 'j';
        char val8 = '\u2242';
        boolean val9 = false;

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        System.out.println(val8);
        System.out.println(false);

    }

    public static int calcExpression(int valA, int valB, int valC, int valD) {
        int sum = valA * (valB + (valC / valD));
        return sum;
    }


    public static boolean calcExpression2(int valA, int valB) {
        
        int sum = valA + valB;
        if (sum > 10 && sum < 20) {
            System.out.println("Входит в диапазон");
            return true;
        } else {
            System.out.println("Не входит в диапазон");
            return false;
        }


    }

    public static void task5(int valL) {
        if (valL >= 0) System.out.println("Число " + valL + " положительное");
        else System.out.println("Число " + valL + " отрицательное");
    }

    public static void task6(int valM) {
        if (valM < 0) System.out.println("Число целое");
        else System.out.println("Число отрицательное");

    }

    public static void task7(String userName) {
        System.out.println("Привет " + userName);
    }
}

