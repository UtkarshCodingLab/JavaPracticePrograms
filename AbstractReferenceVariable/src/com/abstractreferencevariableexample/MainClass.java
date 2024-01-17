package com.abstractreferencevariableexample;

public class MainClass {
    public static void main(String[] args) {
       AbstractClass abstractClass = new ImplementationClass();
       abstractClass.setVariableVar1();
       ImplementationClass implementationClass= new ImplementationClass();
       implementationClass.defaultValue();
    }
}
