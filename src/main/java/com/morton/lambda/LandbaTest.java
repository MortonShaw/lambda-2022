package com.morton.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author MortonShaw
 * @date 2021/7/16 14:12
 */
public class LandbaTest {

    public static void main(String[] args) throws Exception {
        Runnable runnable01 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running01");
            }
        };
        runnable01.run();

        Runnable runnable02 = () -> {
            System.out.println("running02");
        };
        runnable02.run();

        Runnable runnable03 = () -> System.out.println("running03");
        runnable03.run();

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello world";
            }
        };
        System.out.println(callable.call());

        Callable<String> callable1 = () -> null;
        System.out.println(callable1.call());

        StudentDao studentDao = (Student student) -> System.out.println("insert : " + student);
        studentDao.insert(new Student());

        TeacherDao teacherDao = () -> 2;
        System.out.println(teacherDao.get());

        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("123"));

        Supplier<String> s1 = () -> "hello world";
        System.out.println(s1.get());

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("beijing");

        BiFunction<String, String, Integer> biFunction = (a, b) -> a.length() + b.length();
        System.out.println(biFunction.apply("aa", "bb"));

        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);
    }

}
