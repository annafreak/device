interface device{
    void turnOn();
        void turnOff();
        default void charge(){
            System.out.println("Charging on...");
        }
        static void reset(){
            System.out.println("Resetting");
        }


}

    class Smartphone implements device{
        @Override
        public void turnOn(){
            System.out.println("Turning on...");
        }
        @Override
        public void turnOff(){
            System.out.println("Turning off...");
        }

    }

    class Laptop implements device{
        @Override
        public void turnOn(){
            System.out.println("Turning on...");
        }
        @Override
        public void turnOff(){
            System.out.println("Turning off...");
        }

    }
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Smartphone smartphone = new Smartphone();


        System.out.println("smartphone: ");
        smartphone.turnOn();
        smartphone.turnOff();
        smartphone.charge();

        device.reset();

        System.out.println("laptop: ");

        laptop.turnOn();
        laptop.turnOff();
        laptop.charge();
        device.reset();







    }
}