package com.company;

import java.util.Objects;

class Numbers{
    int a,b,c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum(){
        return a+b+c;
    }
    public int average(){
    return (a+b+c)/3;
    }
    public int min(){
        return Math.min(a, Math.min(b,c));
    }
    public int max(){
    return Math.max(a, Math.max(b,c));
    }
    public double geometric(){
    return Math.pow((a*b*c),1/3);
    }
}
    public class Main {

    public static void main(String[] args) {
Numbers n1 = new Numbers(9,5,6);
System.out.println(n1.sum());
        System.out.println(n1.average());
        System.out.println(n1.min());
        System.out.println(n1.max());
        System.out.println(n1.geometric());
    }
}
