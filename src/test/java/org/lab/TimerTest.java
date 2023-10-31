package org.lab;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for Timer class.
 */
public class TimerTest {
    /**
     * The number of repetitions.
     * */
    private final int repetitions;

    /**
     * Instance of the Timer class.
     * */
    private final Timer timer;

    /**
     * Default constructor.
     * */
    public TimerTest() {
        this.repetitions = 10000;
        this.timer = new Timer(this.repetitions);
    }

    /**
     * Test measureAddTime.
     * */
    @Test
    public void measureAddTime() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long arrayTime = endTime - startTime;

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        long linkedTime = endTime - startTime;

        long measuredArrayTime = timer.measureAddTime(new ArrayList<>());
        long measuredLinkedTime = timer.measureAddTime(new LinkedList<>());

        assertTrue(measuredArrayTime >= 0 && arrayTime - 2 <= measuredArrayTime && arrayTime + 2 >= measuredArrayTime);
        assertTrue(measuredLinkedTime >= 0 && linkedTime - 2 <= measuredLinkedTime && linkedTime + 2 >= measuredLinkedTime);
    }

    /**
     * Test measureGetTime.
     * */
    @Test
    public void measureGetTime() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.repetitions; i++) {
            arrayList.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        long arrayTime = endTime - startTime;

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < this.repetitions; i++) {
            linkedList.add(i);
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        long linkedTime = endTime - startTime;

        long measuredArrayTime = timer.measureGetTime(new ArrayList<>());
        long measuredLinkedTime = timer.measureGetTime(new LinkedList<>());

        assertTrue(measuredArrayTime >= 0 && arrayTime - 4 <= measuredArrayTime && arrayTime + 4 >= measuredArrayTime);
        assertTrue(measuredLinkedTime >= 0 && linkedTime - 4 <= measuredLinkedTime && linkedTime + 4 >= measuredLinkedTime);
    }

    /**
     * Test measureDeleteTime.
     * */
    @Test
    public void measureDeleteTime() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.repetitions; i++) {
            arrayList.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            arrayList.remove(0);
        }
        long endTime = System.currentTimeMillis();
        long arrayTime = endTime - startTime;

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < this.repetitions; i++) {
            linkedList.add(i);
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < this.repetitions; i++) {
            linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();
        long linkedTime = endTime - startTime;

        long measuredArrayTime = timer.measureDeleteTime(new ArrayList<>());
        long measuredLinkedTime = timer.measureDeleteTime(new LinkedList<>());

        assertTrue(measuredArrayTime >= 0 && arrayTime - 2 <= measuredArrayTime && arrayTime + 2 >= measuredArrayTime);
        assertTrue(measuredLinkedTime >= 0 && linkedTime - 2 <= measuredLinkedTime && linkedTime + 2 >= measuredLinkedTime);
    }
}
