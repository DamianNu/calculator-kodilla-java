package com.example.calculatorkodilla;

public class Calculator {
    private int a;
    private int b;
    public Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int addition(){
        int result = a + b;
        System.out.println(result);
        return result;
    }
    public int subtraction(){
        int result = a - b;
        System.out.println(result);
        return result;

    }

}

 class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(123,10);
        calculator.addition();
        calculator.subtraction();

    }
}
