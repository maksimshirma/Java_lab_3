package org.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The main class
 */
public class App
{
    /**
     * Allows you to get the number of repetitions from the user.
     * @return int - the number of repetitions.
     * */
    private static int getNumberOfRepetitions() {
        Scanner scanner = new Scanner(System.in);
        int repetitions;

        System.out.print("Введите количество повторений (для выхода введите 0): ");
        for (repetitions = scanner.nextInt(); repetitions < 0; repetitions = scanner.nextInt()) {
            System.out.print("Ошибка, попробуйте снова: ");
        }

        return repetitions;
    }

    /**
     * Allows you to print the table with results of the measurement.
     * */
    private static void printTable(long addTime, long deleteTime, long getTime, int repetitions, String list) {
        System.out.println(list + " table:");
        System.out.printf("%-10s%-10s%-5s%n", "Method" + "\t", "Repetitions" + "\t", "Time");

        System.out.printf("%-10s", "add");
        System.out.printf("%8s", repetitions);
        System.out.printf("%9s", addTime);
        System.out.println();

        System.out.printf("%-10s", "get");
        System.out.printf("%8s", repetitions);
        System.out.printf("%9s", getTime);
        System.out.println();

        System.out.printf("%-10s", "delete");
        System.out.printf("%8s", repetitions);
        System.out.printf("%9s", deleteTime);
        System.out.println();
    }

    /**
     * The main method.
     * @param args - arguments of the main method.
     */
    public static void main(String[] args) {
        int repetitions = getNumberOfRepetitions();

        if (repetitions != 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            Timer timer = new Timer(repetitions);

            long arrayListAddTime = timer.measureAddTime(arrayList);
            long linkedListAddTime = timer.measureAddTime(linkedList);

            long arrayListDeleteTime = timer.measureDeleteTime(arrayList);
            long linkedListDeleteTime = timer.measureDeleteTime(linkedList);

            long arrayListGetTime = timer.measureGetTime(arrayList);
            long linkedListGetTime = timer.measureGetTime(linkedList);

            printTable(arrayListAddTime, arrayListDeleteTime, arrayListGetTime, repetitions, "ArrayList");
            printTable(linkedListAddTime, linkedListDeleteTime, linkedListGetTime, repetitions, "LinkedList");
        }
    }
}
