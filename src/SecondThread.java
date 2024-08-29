public class SecondThread extends Thread {

    @Override
    public void run() {
        for(int i = 0; i != 50; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.currentThread().setName("segunda thread");
//            System.out.println(SecondThread.currentThread().getName());
            System.out.println("Segunda thread rodando");
        }
    }
}