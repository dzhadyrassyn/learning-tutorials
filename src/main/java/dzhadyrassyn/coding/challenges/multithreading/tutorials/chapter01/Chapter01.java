package dzhadyrassyn.coding.challenges.multithreading.tutorials.chapter01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Chapter01 {

    public static void main(String[] args) {
        Examples.UnsafeSequence unsafeSequence = new Examples.UnsafeSequence();
        parallelize(unsafeSequence::nextInt);
        System.out.println(unsafeSequence.nextInt());


        Examples.SafeSequence safeSequence = new Examples.SafeSequence();
        parallelize(safeSequence::nextInt);
        System.out.println(safeSequence.nextInt());
    }

    private static void parallelize(Runnable runnable) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(runnable);
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
