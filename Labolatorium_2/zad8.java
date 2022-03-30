package com.company;

import java.util.Objects;

class Student {
    String imie, nazwisko, indeks;
    int obecnosc, oceny_POJ;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        if (imie.length() == 0) {
            this.imie = "Unknown";
        } else {
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko.length() == 0) {
            this.nazwisko = "Unknown";
        } else {
            this.nazwisko = nazwisko;
        }
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public int getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(int obecnosc) {
        if (obecnosc < 101 || obecnosc >= 0) {
            this.obecnosc=obecnosc;
            if (obecnosc < 50) {
                this.oceny_POJ = 2;
            } else {
                this.oceny_POJ = oceny_POJ;
            }
        } else {
            System.out.println("NIE.");
        }
    }


    public int getOceny_POJ() {
        return oceny_POJ;
    }

    public void setOceny_POJ(int oceny_POJ) {
        this.oceny_POJ = oceny_POJ;
    }

    public Student(String imie, String nazwisko, String indeks, int obecnosc, int oceny_POJ) {


        setImie(imie);
        setNazwisko(nazwisko);
        this.indeks = indeks;
        setObecnosc(obecnosc);
        this.oceny_POJ=oceny_POJ;


    }

    @Override
    public String toString() {
        return "Student" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks='" + indeks + '\'' +
                ", obecnosc=" + obecnosc +
                ", oceny_POJ=" + oceny_POJ;
    }
}

    public class Main {

    public static void main(String[] args) {

    Student s1 = new Student("Dominika","Brunhildzka","s2137",90,5);
    Student s2 = new Student("","","s76667",70,3);
    Student s3 = new Student("Jackson","Wang","s666",14,5);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    }
}
