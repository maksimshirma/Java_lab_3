package org.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App
{
    public static int getCountOfRepetitions() {
        Scanner scanner = new Scanner(System.in);
        int repetitions;

        System.out.print("Введите количество повторений (для выхода введите 0): ");
        for (repetitions = scanner.nextInt(); repetitions < 0; repetitions = scanner.nextInt()) {
            System.out.print("Ошибка, попробуйте снова: ");
        }

        return repetitions;
    }

    public static void printTable(long addTime, long deleteTime, long getTime, int repetitions, String list) {
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

    public static void main(String[] args) {
        int repetitions = getCountOfRepetitions();

        if (repetitions != 0) {
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            LinkedList<Integer> linkedList = new LinkedList<>();
//            Timer timer = new Timer();
//
//            long arrayListAddTime = timer.measureAddTime(arrayList, repetitions);
//            long linkedListAddTime = timer.measureAddTime(linkedList, repetitions);
//
//            long arrayListDeleteTime = timer.measureDeleteTime(arrayList, repetitions);
//            long linkedListDeleteTime = timer.measureDeleteTime(linkedList, repetitions);
//
//            long arrayListGetTime = timer.measureGetTime(arrayList, repetitions);
//            long linkedListGetTime = timer.measureGetTime(linkedList, repetitions);
//
//            printTable(arrayListAddTime, arrayListDeleteTime, arrayListGetTime, repetitions, "ArrayList");
//            printTable(linkedListAddTime, linkedListDeleteTime, linkedListGetTime, repetitions, "LinkedList");
        }
    }
}
