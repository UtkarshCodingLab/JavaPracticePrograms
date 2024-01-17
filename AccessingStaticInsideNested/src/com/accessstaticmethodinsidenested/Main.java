package com.accessstaticmethodinsidenested;

public class Main {
    public static void main(String[] args) {
        System.out.println(Outer.Inner.var1);
        Outer.Inner.getVar1();
    }
}
