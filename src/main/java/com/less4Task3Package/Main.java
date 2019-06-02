package com.less4Task3Package;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        // set the characteristic for dog1 (positive case)
        dog1.setAge(3);
        dog1.setName("Muhtar");
        System.out.println(dog1.getName() + " " + dog1.getAge() + " years old");

        // set the characteristic for the dog2 with empty name. Expected: warning
        dog2.setAge(2);
        dog2.setName("  ");
        System.out.println(" Name = " + dog2.getName() + " Age = " + dog2.getAge());

        // set the characteristic for the dog3 with negative age. Expected: warning
        dog3.setName("Sharik");
        dog3.setAge(-1);
        System.out.println(" Name = " + dog3.getName() + " Age = " + dog3.getAge());
    }
}
