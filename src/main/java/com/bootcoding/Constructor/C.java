package com.bootcoding.Constructor;

public class C  extends B{
    public void print() {
        super.print();
        System.out.println("C");
    }

    public static void main(String[] args) {
        A obj = new C();
        obj.print();
    }
}
