package com.morton.functionref;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @author MortonShaw
 * @date 2021/7/16 16:13
 */
public class Test04 {

    public static void main(String[] args) {
        Consumer<Too> c1 = (Too too) -> new Too().foo();
        c1.accept(new Too());
        Consumer<Too> c2 = (Too too) -> new Too2().foo();
        c2.accept(new Too());
        BiFunction<Too, String, Integer> fun = Too::fun;
        System.out.println(fun.apply(new Too(), "ss"));
    }

}

class Too {

    public Integer fun(String s) {
        return 1;
    }

    public void foo() {
        System.out.println("foo");
    }

}

class Too2 {

    public Integer fun(String s) {
        return 1;
    }

    public void foo() {
        System.out.println("foo---too2");
    }

    public void show(String str) {

    }

}

