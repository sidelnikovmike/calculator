package com.adtech.calculator;

public class Calculator {
    public int first;
    public int second;

    public Calculator(int First, int Second){
        this.first = First;
        this.second = Second;
    }

    public int divide(){
        return second/first;
    }
}
