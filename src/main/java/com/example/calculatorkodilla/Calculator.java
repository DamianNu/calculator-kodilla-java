package com.example.calculatorkodilla;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(64,23);
        calculator.subtraction(56,57);

    }
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }

}
