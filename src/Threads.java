public class Threads {
    public static void main(String[] args) {

        new Thread(mainThread).start();

        SecondThread thread2 = new SecondThread();
        thread2.start();

    }

    private static Runnable mainThread = new Runnable() {

        @Override
        public void run() {
        soma();

        };
    };
    public static int soma () {
        int a = 0;
        for (int j = 0; j != 50; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            a = 1 + 1;
//            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread principal somando 1 + 1 : " + a);

        }
        return a;
    }
}

