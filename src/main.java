public class main {

    public static void main(String[] args) {

        System.out.println("Hello, world!");


//        long a = 700_000_000_000_000L;
        int a = 7;
        int countApple = 3;
        double result = 1.0 * a / countApple;

        //       System.out.println("Результат:" + result);

        double f = 7.0;
        double r = 3.0;
        double resultFloat = f / r;
        System.out.println(resultFloat);

        char ch = 'a';
        char ch2 = 3432;

//        System.out.println("" + ch + ch2);

        for (int i = 0; i < 3000; i++) {
            System.out.printf("%4d : %2c\n", i, i);

            boolean isFlag = false; //true

            String str = "Hello world!";

            //          System.out.println(a + countApple + "Result" + f + ch);

            int sum = 0;
            sum += countApple;

            a += 1;
            a++;
            ++a;


            //          a = 0;
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(a--);
            System.out.println(--a);
        }
            int valA = 4;
            int valB = 5;
      //
      //      comparison(valA, valB);
            f = calcMoneyWithoutTax(10000);
        System.out.println(f);
        }
        public static void comparison (int valA, int valB) {

            if (valA == valB) {
                System.out.println("Числа равны");
            } else if (valA > valB) {
                System.out.println("Число A больше");
            } else {
                System.out.println("Число В больше");
            }
        }


public static double calcMoneyWithoutTax(int a){
        double sum = a * 0.87;
        return sum;


}
}




