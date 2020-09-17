package Lesson_5;


    public class Employee {
        private String Firstname;
        private String Surname;
        private int Age;
        private String Email;
        private String PhoneNumber;
        private String Position;
        private int Salary;

        public Employee(String Firstname, String Surname, int age, String Email, String PhoneNumber, String Position, int Salary) {
            this.Firstname = Firstname;
            this.Surname = Surname;
            this.Age = age;
            this.Email = Email;
            this.PhoneNumber = PhoneNumber;
            this.Position = Position;
            this.Salary = Salary;
        }

        public String getFirstname() {
            return this.Firstname;
        }

        public void setFirstname(String Firstname) {
            this.Firstname = Firstname;
        }

        public String getSurname() {
            return this.Surname;
        }

        public void setSurname(String Surname) {
            this.Surname = Surname;
        }

        public int getAge() {
            return this.Age;
        }

        public void setAge() {
            this.Age = this.Age;
        }

        public String getEmail() {
            return this.Email;
        }

        public void setEmail(String email) {
            this.Email = email;
        }

        public String getPhoneNumber() {
            return this.PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
        }

        public String getPosition() {
            return this.Position;
        }

        public void setPosition(String Position) {
            this.Position = Position;
        }

        public int getSalary() {
            return this.Salary;
        }

        public void setSalary(int salary) {
            this.Salary = salary;
        }

        public void printInfo() {
            System.out.println(this);
        }

        public String toString() {
            return "Employee{Firstname='" + this.Firstname + "', Surname='" + this.Surname + "', Age=" + this.Age + ", Email='" + this.Email + "', PhoneNumber='" + this.PhoneNumber + "', Position='" + this.Position + "', Salary=" + this.Salary + "}";
        }
    }

