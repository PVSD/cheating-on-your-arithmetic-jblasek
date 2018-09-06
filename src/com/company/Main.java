package com.company;

public class Main {

    public static void main(String[] args) {
        
        Tester funcs = new Tester();

        int a = funcs.equationOne();
        int b = funcs.equationTwo();
        int c = funcs.equationThree();

        System.out.println("79 + 3 * (4+ 82 - 68) - 7 + 19 = " + a);
        System.out.println("(179 + 21 + 10) / 7 + 181 = " + b);
        System.out.println("10359 * 56 * 11 + 2246 = " + c);
    }
}
