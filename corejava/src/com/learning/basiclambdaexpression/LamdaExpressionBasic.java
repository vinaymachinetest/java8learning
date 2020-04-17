package com.learning.basiclambdaexpression;

@FunctionalInterface
interface Interface{

    void m1();
}

public class LamdaExpressionBasic {
    public static void main(String []args) {
        /*
         * Lambda expression is a anonymous function (nameless function)
         *     -> not having any name ,no return type and no modifiers
         * The main objective for lambda expression to enable the functional programming
         * To write more readable ,maintainable and concise code
         * To use API's very effectively
         * To enable parallel processing
         */
        //************************************************************************************
        /*
         * To call the lambda expression required functional interface
         * In a interface have only one abstract method it is called functional interface
         * e.g Runnable - contains only one method run()
         *     Callable - contains only one method call()
         *     Comparable - contains only method compareTo()
         *     ActionLinster -contains only actionPerformed()
         *     Can have one or more default methods
         *     can have one or more static methods
         *     to specify explicitly functional interface we have use @FunctionalIntface annotation
         *     Compiler will use at compilation time to avoiding any mistake.		 *
         *
         */
        //Without lambda expression
        System.out.println("hello lamda expression");
        //with lambda expression
        Interface i1 = () -> {System.out.println("using lamda expression");};
        i1.m1();
        //another way to write
        Interface i2 = () -> System.out.println("another way of using lamda expression");
        i2.m1();
    }
}
