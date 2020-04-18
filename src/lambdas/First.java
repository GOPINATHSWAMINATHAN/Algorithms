package lambdas;

public class First {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("welcome to learning anonymous inner class");
            }
        });
        thread.start();

        Runnable r = () ->

                System.out.println("Welcome to learning lambda expressions");
        new Thread(r).start();

    }
}
