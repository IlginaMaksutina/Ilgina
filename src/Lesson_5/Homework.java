package Lesson_5;

import java.util.Random;


    public class Homework {
        private static int Employee_count = 5;
        private static final int Min_Age = 40;
        private static Random ageRandomize = new Random();

        public Homework() {
        }

        public static void main(String[] args) {
            Employee[] employees = new Employee[Employee_count];

            for(int i = 0; i < Employee_count; ++i) {
                employees[i] = createEmployee(i);
            }

            Employee[] var6 = employees;
            int var3 = employees.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                Employee employee = var6[var4];
                if (employee.getAge() > 40) {
                    employee.printInfo();
                }
            }

        }

        private static Employee createEmployee(int i) {
            return new Employee("name" + i, "Surname" + i, ageRandomize.nextInt(30) + 30, "mail" + i + "@mail.com", "+78235255665" + i, "QA Tester", 5000 + i * 100);
        }
    }





