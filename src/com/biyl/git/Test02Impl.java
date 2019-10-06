package com.biyl.git;

public class Test02Impl implements Test02 {
    @Override
    public void print() {
        System.out.println("我是Test02接口的实现类");
    }

    public static void main(String[] args) {
        Test02Impl test02 = new Test02Impl();
        test02.print();
    }
}
