package OverRiding;

class Animal {
    void animalSound()
    {
        System.out.println("Some Animal Sound");
    }
    }
    class Dog extends Animal {
    @Override
    void animalSound()
    {
        System.out.println("Barking");
    }
    }
    class Cat extends Animal {
    @Override
    void animalSound()
    {
        System.out.println("Meow");
    }
    }
    public class Test
    {
        // using
        public static void main(String[] args) {
            Animal obj = new Dog();
            obj.animalSound();
            // using Cat object
            obj = new Cat();
            obj.animalSound();
        }
    }
