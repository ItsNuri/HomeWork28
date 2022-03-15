package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sqrt().apply(9.0));

    }

    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> name = (x) -> Math.sqrt(x);
        return name;
    }
}
