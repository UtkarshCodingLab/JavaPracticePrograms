package com.accessstaticmethodinsidenested;

public class Outer {
    public class Inner{
        public static int var1=10;

        public static void getVar1() {
            System.out.println("The Value of Inner Class Variable is "+var1);
        }
    }
}
