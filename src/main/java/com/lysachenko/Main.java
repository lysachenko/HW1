package com.lysachenko;

public class Main {

    public static void main(String[] args) {

        byte b = 127;
        short s = 1024;
        int i = 100;
        long l = 432;
        float f = 1000.3f;
        double d = 500.2;

        byte sum = (byte) (b + b);
        long minus = s - l;
        double minus2 = f - d;
        double division = d / i;
        long multiplication = l * b;

        System.out.println("b = " + b
                + " s = " + s
                + " i = " + i
                + " l = " + l
                + " f = " + f
                + " d = " + d);
        System.out.println("b + b = " + sum);
        System.out.println("s - l = " + minus);
        System.out.println("f - d = " + minus2);
        System.out.println("d / i = " + division);
        System.out.println("l * b = " + multiplication);

    }
}
