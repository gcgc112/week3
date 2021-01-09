package com.offcn.test;


import java.util.Arrays;

class Letter {
    char c;
}

class Value {
    int i;
}

public class PassObject {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        /*Letter x = new Letter();
        x.c = 'a';
        System.out.println("1:x.c = " + x.c);
        f(x);
        System.out.println("2:x.c = " + x.c);*/

        /*Integer i1 = new Integer(35);
        Integer i2 = new Integer(35);
        //System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1);
        System.out.println(i2);*/

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1);
        System.out.println(v2);

    }

}
