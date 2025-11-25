package dzhadyrassyn.coding.challenges.multithreading.tutorials.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Examples {

    static class UnsafeHitCounter {
        private long hits;

        public long getHits() {
            return hits;
        }

        public void hit() {
            hits++;
        }
    }

    static class SafeHitCounter {

        private AtomicLong hits = new AtomicLong(0);

        public long getHits() {
            return hits.get();
        }

        public void hit() {
            hits.incrementAndGet();
        }
    }

    interface Cache {
        int getValue(int key);
        void setValue(int key);
    }

    static class UnsafeCache implements Cache {

        Map<Integer, Integer> cache = new HashMap<>();

        @Override
        public int getValue(int key) {
            return cache.getOrDefault(key, 0);
        }

        @Override
        public void setValue(int key) {
            if (!cache.containsKey(key)) {
                cache.put(key, cache.getOrDefault(key, 0) + 1);
            }
        }
    }

    static class NonAtomicCompoundCache implements Cache {

        Map<Integer, Integer> cache = new ConcurrentHashMap<>();

        @Override
        public int getValue(int key) {
            return cache.getOrDefault(key, 0);
        }

        @Override
        public void setValue(int key) {
            if (!cache.containsKey(key)) {
                cache.put(key, cache.getOrDefault(key, 0) + 1);
            }
        }
    }

    static class SafeCache implements Cache {

        Map<Integer, Integer> cache = new ConcurrentHashMap<>();

        @Override
        public int getValue(int key) {
            return cache.getOrDefault(key, 0);
        }

        @Override
        public void setValue(int key) {
            cache.putIfAbsent(key, cache.getOrDefault(key, 0) + 1);
        }
    }
}
