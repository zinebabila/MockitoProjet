package com.example;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }
    public int performOperation(int a, int b) {
        return operation.execute(a, b);
    }
}
