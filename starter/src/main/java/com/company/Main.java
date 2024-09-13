package com.company;

public class Main {
    public static void main(String[] args) {
        ApiInterface apiInterfaceImpl1 = new ApiInterfaceImpl();
        System.out.println(apiInterfaceImpl1.getData());
    }
}
