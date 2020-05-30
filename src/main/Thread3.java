package main;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public class Thread3 {
    public static void main(String[] args) throws InterruptedException
    {
        /*
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime()+"\n");
        ScheduledFuture<?> future = executor.schedule(task, 5, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.SECONDS);
        System.out.printf("Remaining Delay: %sms\n", remainingDelay);
        */
        /*
        ScheduledExecutorService executor1 = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> System.out.println("Scheduling 1: " + System.nanoTime());

        int initialDelay = 0;
        int period = 2;
        executor1.scheduleAtFixedRate(task1, initialDelay, period, TimeUnit.SECONDS);
        */
        /*
        ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(1);

        Runnable task2 = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling 2: " + System.nanoTime());
            }
            catch (InterruptedException e) {
                System.err.println("task interrupted");
            }
        };

        executor2.scheduleWithFixedDelay(task2, 0, 1, TimeUnit.SECONDS);
        */
    }
}
