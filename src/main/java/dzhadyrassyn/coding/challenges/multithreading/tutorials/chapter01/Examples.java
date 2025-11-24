package dzhadyrassyn.coding.challenges.multithreading.tutorials.chapter01;

public class Examples {

    static class UnsafeSequence {

        private int value = 0;

        public int nextInt() {
            value = value + 1;
            return value;
        }
    }

    static class SafeSequence {
        private int value = 0;

        public synchronized int nextInt() {
            value = value + 1;
            return value;
        }
    }
}
