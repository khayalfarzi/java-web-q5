package az.iktlab.javawebq5.dp.threads;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int numberOfWorkers = 5;
        CountDownLatch countDownLatch = new CountDownLatch(numberOfWorkers);

        for (int i = 0; i < numberOfWorkers; i++) {

            new Thread(() -> {
                // Do some work...
                System.out.println("Thread " + Thread.currentThread().getId() + " has finished its work.");
                System.out.println(countDownLatch.getCount());

                countDownLatch.countDown(); // Signal that this thread is done.
            }).start();
        }

        countDownLatch.await(); // Wait for all threads to finish.
        System.out.println("All threads have finished their work.");
    }
}
