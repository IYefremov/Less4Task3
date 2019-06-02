package com.less4Task3Package;

public class Dog {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.print("The age shouldn't be less then 0. The age is set as entered negative value ");
            //System.exit(0);
        }
            this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.trim().length() == 0){
            System.out.print("You should point the name. The name is set as NULL ");
            //System.exit(0);
        } else {
            this.name = name;
        }

    }
}
