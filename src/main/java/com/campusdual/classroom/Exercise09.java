package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(8);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        int numeroBase = 0;
        do {
            System.out.print("Entra con valor: " + numeroBase);
            numeroBase++;
            System.out.println(", sale con valor: " + numeroBase);
        } while (numeroBase < num);
    }
}