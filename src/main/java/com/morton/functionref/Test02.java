package com.morton.functionref;

import com.morton.IAnimate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author MortonShaw
 * @date 2021/7/16 15:23
 */
public class Test02 {

    static String put() {
        System.out.println("put... ...");
        return "put";
    }

    static void getSize(int size) {
        System.out.println(size);
    }

    public static void main(String[] args) {
//        System.out.println(put());
        Supplier<String> s1 = Test02::put;
        System.out.println(s1.get());

        Supplier<String> s2 = Test02::put;
        System.out.println(s1.get());

        Supplier<String> hehe = Fun::hehe;
        System.out.println(hehe.get());

        Consumer<Integer> getSize = Test02::getSize;
        getSize.accept(123);

        Function<String, String> toUpperCase = Fun::toUpperCase;
        System.out.println(toUpperCase.apply("abc"));
    }

}

class Fun {

    public static String hehe() {
        return "hehe";
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

}
