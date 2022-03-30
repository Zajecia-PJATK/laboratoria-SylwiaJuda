package com.company;

import java.util.Objects;

class Segment {
    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Segment[" +
                "v1=" + a +
                ", v2=" + b +
                ']';
    }
    public double getLength(){
        double dl;
        dl=a.distance(b);
        return dl;
    }
}
class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "v1=" + a +
                ", v2=" + b +
                ", v3=" + c +
                ']';
    }
    public double getDistances(){



        double obw;
        obw = a.distance(b)+b.distance(c)+c.distance(a) ;
        return obw;
    }
    public String getType(){
        if(a.distance(b)==b.distance(c) && c.distance(a)==b.distance(c)){
            return "Rownoboczny";
        }
        if(a.distance(b)==a.distance(c) || c.distance(a)==c.distance(b) || b.distance(a)==b.distance(c)){
            return "Rownoramienny";
        }
        else{
            return "Roznoboczny";
        }
    }
}
class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }

    public Point(){
        this.x = 320;
        this.y = 200;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Point getCoordinates(){
        Point pointt = new Point(this.x, this.y);
        return pointt;
    }
    public void setCoordinates(int x,int y){
        this.y = y;
        this.x = x;

    }
    public void setCoordinates(Point p){
        this.y = p.y;
        this.x = p.x;
    }

    public double distance(Point p){
        return Math.sqrt(((this.x-p.x)*(this.x-p.x))+((this.y-p.y)*(this.y-p.y)));
    }
}

public class Main {

    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(1,1), new Point(2,2))  ;
        System.out.println(s1);
        Triangle t1 = new Triangle (new Point(11,0), new Point(10,0), new Point(5,2));
        System.out.println(t1);
        double dys = t1.getDistances();
        System.out.println(dys);
        double dl = s1.getLength();
        System.out.println(dl);
        String typ = t1.getType();
        System.out.println(typ);
    }
}
