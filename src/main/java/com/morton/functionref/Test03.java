package com.morton.functionref;

import java.util.function.Supplier;

/**
 * @author MortonShaw
 * @date 2021/7/16 15:51
 */
public class Test03 {

    public String put() {
        return "put......";
    }

    public static void main(String[] args) {
        System.out.println(new Test03().put());
        Supplier<String> s1 = () -> new Test03().put();
        Supplier<String> s2 = new Test03()::put;
        System.out.println(s1.get());
        System.out.println(s2.get());
    }

}
