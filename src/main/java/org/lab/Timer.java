package org.lab;

import java.util.List;

/**
 * Timer. This class provides measurement of executing time for add, delete and get methods of the ArrayList and LinkedList classes.
 */
public class Timer {
    /**
     * The number of the repetitions.
     * */
    private final int repetitions;

    /**
     * Default constructor.
     * @param repetitions - the number of the repetitions.
     * */
    public Timer(int repetitions) {
        this.repetitions = repetitions;
    }

    /**
     * Allows you to measure the time of add method of ArrayList or LinkedList class.
     * @param list - the list whose method will be measured;
     * @return long - the time in milliseconds.
     * */
    public long measureAddTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Allows you to measure the time of remove method of ArrayList or LinkedList class.
     * @param list - the list whose method will be measured;
     * @return long - the time in milliseconds.
     * */
    public long measureDeleteTime(List<Integer> list) {
        for (int i = 0; i < this.repetitions; i++) {
            list.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Allows you to measure the time of get method of ArrayList or LinkedList class.
     * @param list - the list whose method will be measured;
     * @return long - the time in milliseconds.
     * */
    public long measureGetTime(List<Integer> list) {
        for (int i = 0; i < this.repetitions; i++) {
            list.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
