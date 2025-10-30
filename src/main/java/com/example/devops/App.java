package com.example.devops;

public class App {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Build Successful! Sum: " + add(5, 10));
    }
}
