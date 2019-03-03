package academy.mate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Git is cool!");

        Main main = new Main();
        main.work();
        System.out.println(main.sum(5, 6));
    }

    public void work() {
        System.out.println("Now i'm working..");
    }

    private int sum(int a, int b) {
        return a + b;
    }
}
