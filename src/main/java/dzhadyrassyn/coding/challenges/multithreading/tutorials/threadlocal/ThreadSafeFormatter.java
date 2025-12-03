package dzhadyrassyn.coding.challenges.multithreading.tutorials.threadlocal;

import java.text.SimpleDateFormat;

public class ThreadSafeFormatter {

    public static ThreadLocal<SimpleDateFormat> lambdaDateFormatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };


}
