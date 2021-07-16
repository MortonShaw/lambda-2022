package com.morton.functionref;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author MortonShaw
 * @date 2021/7/16 15:19
 */
public class Test01 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("abc"));

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("str");
    }

}
