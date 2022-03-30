package com.company;

import java.util.Objects;
enum Kolor{
    KIER,KARO,PIK,TREFL;
}
class Card{
    String wartosc;
    Kolor kolor;

    public String getWartosc() {
        return wartosc;
    }

    public void setWartosc(String wartosc) {
        this.wartosc = wartosc;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }

    public Card(String wartosc, Kolor kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Card" +
                "wartosc='" + wartosc + '\'' +
                ", kolor=" + kolor ;
    }
}

public class Main {

    public static void main(String[] args) {

        Card c4 = new Card("dziewiec",Kolor.KIER );
        Card c3 = new Card("krol",Kolor.KARO );
        Card c2 = new Card("AS",Kolor.PIK );
        System.out.println(c4);
        System.out.println(c3);
        System.out.println(c2);

    }
}
