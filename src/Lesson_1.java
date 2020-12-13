package Lesson_1;


public  class Lesson_1 {

    public static void main(String[] args) {

        Movement[] participants = prepareParticipants();
        ObstructionType[] obstructionTypes = prepareObstructions();
        System.out.println("Стена высота 3, дорожка длина 5");
        Start(participants,obstructionTypes);
    }

    public interface Movement {
        boolean run(ObstructionType obstruction);
        boolean jump(ObstructionType obstruction);
    }

    public interface ObstructionType {
        String GetName();
        String GetMethod();
        int GetLength();
        int GetHeight();
    }

    private static Movement[] prepareParticipants() {
        return new Movement[]{
                new Cat(5,10),
                new Robot(10,1),
                new Human(3,5)
        };
    }

    private static ObstructionType[] prepareObstructions() {
        return new ObstructionType[]{
                new Wall(),
                new RunningTrack()
        };
    }
    private static void Start(Movement [] participants,ObstructionType [] obstructions) {

        for (Movement participant : participants) {
            for (ObstructionType obstructionType : obstructions) {

                boolean result;

                if (obstructionType.GetMethod().toLowerCase().equals("run")) {
                     result = participant.run(obstructionType);
                }
                else result= participant.jump(obstructionType);


                if (!result ) {
                    System.out.println(participant.getClass() + " сошел с дистанции");
                    break;
                }


            }
        }

    }

    public static class Cat implements Movement {

        private final int length;
        private final int height;
        public Cat (int length,int height)
        {
            this.length =length;
            this.height =height;

        }
        public boolean jump(ObstructionType obstruction   ) {

            if (obstruction.GetHeight()>height) {
                System.out.println("Кот не умеет прыгать " + obstruction.GetName()+ " выше "+height);
                return false;

            }
            else System.out.println("Кот умеет прыгать " + obstruction.GetName());
            return true;
        }

        public boolean run(ObstructionType obstruction) {

            if (obstruction.GetLength()>length) {
                System.out.println("Кот не умеет бегать " + obstruction.GetName()+ " дольше "+obstruction.GetLength());
                return false;
            }
            else System.out.println("Кот умеет бегать " + obstruction.GetName());
            return true;
        }


    }



    public  static class Robot implements Movement {

        private final int length;
        private final int height;
        public Robot (int length,int height)
        {
            this.length =length;
            this.height =height;

        }

        public  boolean jump(ObstructionType obstruction)
        {

            if (obstruction.GetHeight()>height) {
                System.out.println("Робот не умеет прыгать " + obstruction.GetName());
                return false;
            }
            else System.out.println("Робот умеет прыгать " + obstruction.GetName());
            return true;

        }
        public  boolean run(ObstructionType obstruction)
        {
            if (obstruction.GetLength()>length) {
                System.out.println("Робот не умеет бегать " + obstruction.GetName()+ " дольше "+obstruction.GetLength());
                return false;
            }
            else System.out.println("Робот умеет бегать " + obstruction.GetName());
            return true;
        }

    }

    public static class Human implements Movement {

        private final int length;
        private final int height;
        public Human (int length,int height)
        {
            this.length =length;
            this.height =height;

        }
        public  boolean jump(ObstructionType obstruction)
        {

            if (obstruction.GetHeight()>height) {
                System.out.println("Человек не умеет прыгать " + obstruction.GetName());
                return false;
            }
            else System.out.println("Человек умеет прыгать " + obstruction.GetName());
            return true;

        }
        public  boolean run(ObstructionType obstruction)
        {

            if (obstruction.GetLength()>length) {
                System.out.println("Человек не умеет бегать " + obstruction.GetName()+ " дольше "+obstruction.GetLength());
                return false;
            }
            else System.out.println("Человек  умеет бегать " + obstruction.GetName());
            return true;

        }


    }
    public static class RunningTrack implements ObstructionType {
        public String GetName(){
          return  "по беговой дорожке";
        }
        public String GetMethod(){
            return  "run";
        }


        public int GetLength()
        {
            return 5;
        }

        public int GetHeight()
        {
            return 0;
        }
    }


    public static class Wall implements ObstructionType{
        public String GetName(){
            return  "по стене";
        }
        public String GetMethod(){
            return  "jump";
        }

        public int GetLength()
        {
            return 1;
        }

        public int GetHeight()
        {
            return 3;
        }
    }
}


