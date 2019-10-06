package com.biyl.git;

public class Test01 {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("这是第一行代码");
        System.out.println("这是第二行代码");

        test01(18,"lucy");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static void test01(int age, String name) {
        System.out.println("age=" + age);
        System.out.println("name=" + name);
    }
}
