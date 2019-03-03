package academy.mate;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.work();
        main.sleep();
        System.out.println(main.sum(5, 6));
    }

    private void work() {
        System.out.println("Working..");
    }

    private void sleep() {
        System.out.println("Sleeping..");
    }

    private int sum(int a, int b) {
        return a + b;
    }
}
