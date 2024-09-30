package com.pluralsight;

public class Demo8Parameters {

    public static void main(String[] args) {
        foo("Hello");
        moo("Goodbye");
        addAndPrint(5, 3);
    }

    public static void foo(String message) {
        System.out.println(message);
    }

    public static void moo(String message) {
        System.out.println(message);
    }



    public static void addAndPrint(int a, int b) {
        int result = a + b;
        System.out.println(result);
        System.out.println();
    }
}
