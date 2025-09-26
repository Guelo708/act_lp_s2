package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {

        //  Identificadores válidos:
        // - Comienzan con letra, guion bajo (_) o signo de dólar ($)
        // - Pueden contener letras, dígitos, _ y $
        // - No pueden comenzar con un número
        // - No pueden ser palabras reservadas del lenguaje

        int miVariable = 10;     // Válido: comienza con letra
        int _contador = 20;      // Válido: comienza con guion bajo
        double $precio = 99.99;  // Válido: comienza con signo de dólar
        int variable123 = 123;   // Válido: contiene letras y números

        // Identificadores inválidos (comentados para evitar errores de compilación):
        // int 123variable = 5;   // Inválido: comienza con número
        // int mi-variable = 10;  // Inválido: contiene guion medio (-), no permitido
        // int class = 1;         // Inválido: "class" es palabra reservada
        // int public = 2;        // Inválido: "public" es palabra reservada

        // Imprimir variables válidas
        System.out.println("miVariable: " + miVariable);
        System.out.println("_contador: " + _contador);
        System.out.println("$precio: " + $precio);
        System.out.println("variable123: " + variable123);
    
       
    }
}
