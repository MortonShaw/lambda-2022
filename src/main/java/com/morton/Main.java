package com.morton;

import java.util.function.Consumer;

/**
 * @author MortonShaw
 * @date 2021/7/16 9:39
 */
public class Main {

    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(100);
    }

    void run(IPerson person) {
        person.run();
    }

}
