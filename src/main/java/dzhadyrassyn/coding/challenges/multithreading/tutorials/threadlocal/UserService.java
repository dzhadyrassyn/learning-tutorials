package dzhadyrassyn.coding.challenges.multithreading.tutorials.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UserService {

    public static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int id = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(new UserService().birthDate(id));
            });
        }
        executor.shutdown();
//        try {
//            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
//                System.out.println("Executor did not terminate in 10 seconds");
//                executor.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public String birthDate(int userId) {
        System.out.println("Birthdate for a user: " + userId);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = ThreadSafeFormatter.lambdaDateFormatter.get();
        return simpleDateFormat.format(date);
    }
}
