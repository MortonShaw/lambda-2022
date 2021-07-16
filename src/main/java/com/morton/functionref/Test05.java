package com.morton.functionref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author MortonShaw
 * @date 2021/7/16 16:47
 */
public class Test05 {

    public static void main(String[] args) {
        Supplier<Person> s1 = () -> new Person();
        s1.get();
        Supplier<Person> s2 = Person::new;
        s2.get();

        Consumer<Integer> c1 = Account::new;
        c1.accept(123);

        Function<Integer, Account> f1 = Account::new;
        f1.apply(123);
    }

}

class Account {

    public Account() {
        System.out.println("account的无参构造方法");
    }

    public Account(int age) {
        System.out.println("有age的构造方法");
    }

    public Account(String name) {
        System.out.println("有name的构造方法");
    }

}

class Person {

    public Person() {
        System.out.println("person的无参构造方法");
    }

}
