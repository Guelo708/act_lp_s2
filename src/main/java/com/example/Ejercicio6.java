package com.example;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();
        System.out.println("\n--- Datos Capturados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        scanner.close();
}
        public static void main(String[] args) {
        ejercicio6();
        
    }
}
