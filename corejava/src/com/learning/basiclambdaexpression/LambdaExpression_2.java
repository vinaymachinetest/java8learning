package com.learning.basiclambdaexpression;

@FunctionalInterface
interface  Learning2{
     int result(int a, int b);
}
public class LambdaExpression_2  {
    public static void main(String []args) {
        Learning2 obj1 = (int a, int b) -> {return a * b ;};
        System.out.println(obj1.result(10, 5));

        //another way
        Learning2 obj2 = ( int a, int b) -> a * b ;
        System.out.println(obj2.result(10, 6));

        //another way
        Learning2 obj3 = (a, b) -> a * b ;
        System.out.println(obj3.result(10, 7));
    }
}
