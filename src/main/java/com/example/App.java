package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int output = calc.soma(1, 2);

        System.out.println(output == 4);
    }
}
