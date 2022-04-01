package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@AllArgsConstructor
class Labirynt{
    @Getter @Setter private int a;



}
public class Main {

    public static void main(String[] args) {
        Labirynt a1 = new Labirynt(2);
        System.out.println(a1.getA());
        a1.setA(1);
        System.out.println(a1.getA());

    }
}
