package org.lab;

import java.util.List;

public class Timer {
    private final int repetitions;

    public Timer(int repetitions) {
        this.repetitions = repetitions;
    }

    public long measureAddTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


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
