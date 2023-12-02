package org.example;

import TimeComparison.TimeComparison;

public class Main {
    public static void main(String[] args) {
        TimeComparison array = new TimeComparison("ArrayList", 2000);
        array.table();

        TimeComparison linked = new TimeComparison("LinkedList", 2000);
        linked.table();
    }
}