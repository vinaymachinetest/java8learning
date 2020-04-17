package com.learning.basiclambdaexpression;

@FunctionalInterface
interface  Learning{
    void result(int a, int b);
}

public class LambdaExpression_1 {

    public static void main(String []args){
        Learning obj1 = (int a, int b) -> {System.out.println("multiplication: " + a*b);};
        obj1.result(10,2);

        //another way
        Learning obj2 = (a, b) -> System.out.println("multiplication: " + a*b);
        obj2.result(10,3);

        //another way
        Learning obj = (x, y) -> System.out.println("multiplication: " + x*y);
        obj.result(10,4);

    }
}
