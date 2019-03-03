package academy.mate;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.work();
        main.sleep();
        main.learnJava();
    }

    private void work() {
        System.out.println("Working..");
    }

    private void sleep() {
        System.out.println("Sleeping..");
    }

    private void learnJava() {
        System.out.println("Learning Java..");
    }
}
